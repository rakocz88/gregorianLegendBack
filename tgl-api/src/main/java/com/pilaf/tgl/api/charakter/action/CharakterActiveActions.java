package com.pilaf.tgl.api.charakter.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.action.basic.MaleAtackAction;
import com.pilaf.tgl.api.charakter.action.basic.MoveAction;
import com.pilaf.tgl.api.charakter.action.basic.WaitAction;

public class CharakterActiveActions {

    private List<ActiveAction> startingActions = Arrays.asList(new MaleAtackAction(), new WaitAction(),
	    new MoveAction());
    private List<ActiveAction> actionList = new ArrayList<>(startingActions);
    private List<ActiveAction> availableActions = new ArrayList<>();

    public List<ActiveAction> getActionList() {
	return actionList;
    }

    public void setActionList(List<ActiveAction> actionList) {
	this.actionList = actionList;
    }

    public void addToActionList(ActiveAction action) {
	this.actionList.add(action);
    }

    public List<ActiveAction> getAvailableActions() {
	return availableActions;
    }

    public void setAvailableActions(CharakterInCombatBase charakter) {
	charakter.getCharakterActiveActions().getActionList().stream().forEach(filterAction(charakter));
    }

    private Consumer<ActiveAction> filterAction(CharakterInCombatBase charakterInCombatBase) {
	List<ActiveAction> charakterList = charakterInCombatBase.getCharakterActiveActions().getAvailableActions();
	charakterList.clear();
	Consumer<ActiveAction> consumer = action -> {
	    if (action.filterValue(charakterInCombatBase)) {
		charakterList.add(action);
	    }
	};
	return consumer;
    }

}
