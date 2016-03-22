package com.pilaf.tgl.api.charakter.action.basic;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.action.ActiveAction;
import com.pilaf.tgl.api.enums.ActionType;

@JsonInclude(Include.NON_NULL)
public class MoveAction implements ActiveAction {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    @JsonIgnore
    public ActionType actionType() {
	return ActionType.MOVE;
    }

    @Override
    @JsonIgnore
    public void action(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	// TODO chainge position

    }

    @Override
    @JsonIgnore
    public int getActionCost(CharakterInCombatBase charakter) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    @JsonIgnore
    public int getDistance(CharakterInCombatBase charakter) {
	// TODO Auto-generated method stub
	return 0;
    }

}
