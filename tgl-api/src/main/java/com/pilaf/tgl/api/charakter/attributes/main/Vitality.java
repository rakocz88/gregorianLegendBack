package com.pilaf.tgl.api.charakter.attributes.main;

import com.pilaf.tgl.api.enums.ParameterValueType;

public class Vitality extends MainAttribute {

    @Override
    public ParameterValueType parameterValueType() {
	return ParameterValueType.VITALITY;
    }

}