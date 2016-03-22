package com.pilaf.tgl.api.charakter.action;

import java.io.Serializable;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.enums.ActionType;

public interface ActiveAction extends Serializable {

    ActionType actionType();

    default void invokeAction(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	action(atacker, target);
	atacker.buildChar();
	target.buildChar();
    }

    // TODO ADD ADITIONAL PARAMETERS TO ACTION(as map or as ..)
    void action(CharakterInCombatBase atacker, CharakterInCombatBase target);

    int getActionCost(CharakterInCombatBase charakter);

    int getDistance(CharakterInCombatBase charakter);

    default public boolean filterValue(CharakterInCombatBase charakterInCombatBase) {
	return charakterInCombatBase.getCharakterPoints().getActionPoints()
		.getCurrentValue() > getActionCost(charakterInCombatBase);

    }

}
