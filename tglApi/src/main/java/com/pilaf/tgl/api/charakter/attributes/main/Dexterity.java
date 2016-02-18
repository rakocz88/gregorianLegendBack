package com.pilaf.tgl.api.charakter.attributes.main;

import com.pilaf.tgl.api.effect.enums.ParameterValueType;

public class Dexterity extends MainAttribute {

    @Override
    public ParameterValueType parameterValueType() {
	return ParameterValueType.STRENGTH;
    }

}
