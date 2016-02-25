package com.pilaf.tgl.api.charakter.action.basic;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.action.ActiveAction;
import com.pilaf.tgl.api.enums.ActionType;

public class MoveAction implements ActiveAction {

    @Override
    public ActionType actionType() {
	return ActionType.MOVE;
    }

    @Override
    public void action(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	// TODO chainge position

    }

    @Override
    public int getActionCost(CharakterInCombatBase charakter) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int getDistance(CharakterInCombatBase charakter) {
	// TODO Auto-generated method stub
	return 0;
    }

}
