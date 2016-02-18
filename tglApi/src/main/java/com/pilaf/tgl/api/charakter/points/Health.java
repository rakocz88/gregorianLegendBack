package com.pilaf.tgl.api.charakter.points;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.effect.enums.ParameterValueType;

public class Health extends CharakterPointsCommon {

    private ParameterValueType parameterValueType = ParameterValueType.HEALTH;

    private static int HEALTH_PER_VIT_POINT = 5;
    private static int START_HEALTH = 20;

    public ParameterValueType getParameterValueType() {
	return parameterValueType;
    }

    @Override
    public Health buildPoints(CharakterInCombatBase charakterInCombatBase) {
	double maxValue = getMaxValue();
	int value = (int) ((getCurrentValue() / maxValue) * (HEALTH_PER_VIT_POINT
		* charakterInCombatBase.getCharakterMainParameters().getVitality().getCurrentValue()
		+ this.getModValue() + this.getCurrentMod() + START_HEALTH));
	setCurrentValue(value);
	setRawValue(HEALTH_PER_VIT_POINT
		* charakterInCombatBase.getCharakterMainParameters().getVitality().getCurrentValue());
	return this;
    }

    @Override
    public Health initPoints(CharakterInCombatBase charakterInCombatBase) {
	int value = START_HEALTH + (charakterInCombatBase.getCharakterMainParameters().getVitality().getCurrentValue()
		* HEALTH_PER_VIT_POINT) + this.getModValue() + this.getCurrentMod();
	charakterInCombatBase.getCharakterPoints().getHealth().setCurrentValue(value);
	setRawValue(
		HEALTH_PER_VIT_POINT * charakterInCombatBase.getCharakterMainParameters().getVitality().getRawValue());
	return this;
    }

    @Override
    public int getMaxValue() {
	// TODO Auto-generated method stub
	return START_HEALTH + getRawValue() + getModValue() + getCurrentMod();
    }

}
