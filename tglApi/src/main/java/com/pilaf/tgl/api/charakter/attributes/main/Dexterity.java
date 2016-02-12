package com.pilaf.tgl.api.charakter.attributes.main;

import com.pilaf.tgl.api.effect.enums.ParameterValueType;

public class Dexterity implements MainAttribute {

    int value = 4;

    @Override
    public int getValue() {
	return value;
    }

    @Override
    public ParameterValueType parameterValueType() {
	return ParameterValueType.DEXTERITY;
    }

}
