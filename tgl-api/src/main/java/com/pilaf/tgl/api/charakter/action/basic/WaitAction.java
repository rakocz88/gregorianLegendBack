package com.pilaf.tgl.api.charakter.action.basic;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.action.ActiveAction;
import com.pilaf.tgl.api.enums.ActionType;

public class WaitAction implements ActiveAction {

    @Override
    public ActionType actionType() {
	return ActionType.WAIT;
    }

    @Override
    public void action(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	System.out.println(atacker.getCharName() + " has "
		+ target.getCharakterPoints().getActionPoints().getCurrentValue() + "and waits");
	atacker.getCharakterPoints().getActionPoints().setCurrentValue(0);
    }

    @Override
    public int getActionCost(CharakterInCombatBase charakter) {
	return 0;
    }

    @Override
    public int getDistance(CharakterInCombatBase charakter) {
	return 0;
    }

}
