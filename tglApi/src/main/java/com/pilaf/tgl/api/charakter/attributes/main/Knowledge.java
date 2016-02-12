package com.pilaf.tgl.api.charakter.attributes.main;

import com.pilaf.tgl.api.effect.enums.ParameterValueType;

public class Knowledge implements MainAttribute {

    int value = 4;

    @Override
    public int getValue() {
	return value;
    }

    @Override
    public ParameterValueType parameterValueType() {
	return ParameterValueType.KNOWLEDGE;
    }

}
