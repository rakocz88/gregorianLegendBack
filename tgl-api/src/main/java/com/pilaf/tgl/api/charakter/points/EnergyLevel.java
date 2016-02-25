package com.pilaf.tgl.api.charakter.points;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.enums.ParameterValueType;

public class EnergyLevel extends CharakterPointsCommon {

    private ParameterValueType parameterValueType = ParameterValueType.ENERGY_LEVEL;

    public ParameterValueType getParameterValueType() {
	return parameterValueType;
    }

    @Override
    public EnergyLevel buildPoints(CharakterInCombatBase charakterInCombatBase) {
	return this;
    }

    @Override
    public EnergyLevel initPoints(CharakterInCombatBase charakterInCombatBase) {
	int value = this.getCurrentMod() + this.getModValue();
	charakterInCombatBase.getCharakterPoints().getEnergyLevel().setCurrentValue(value);
	return this;
    }

}
