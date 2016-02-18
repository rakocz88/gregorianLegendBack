package com.pilaf.tgl.api.charakter.points;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.effect.enums.ParameterValueType;

public class ActionPoints extends CharakterPointsCommon {

    private ParameterValueType parameterValueType = ParameterValueType.ACTION_PONTS;

    public ParameterValueType getParameterValueType() {
	return parameterValueType;
    }

    @Override
    public ActionPoints initPoints(CharakterInCombatBase charakterInCombatBase) {
	int value = 19 + (charakterInCombatBase.getCharakterMainParameters().getDexterity().getCurrentValue() / 3)
		+ getModValue() + getCurrentMod();
	setCurrentValue(value);
	return this;
    }

    @Override
    public ActionPoints buildPoints(CharakterInCombatBase charakterInCombatBase) {
	// int value = this.getCurrentValue() + this.modValue;
	// charakterInCombatBase.getCharakterPoints().getActionPoints().setCurrentValue(value);
	return this;
    }

}
