package com.pilaf.tgl.api.charakter.attributes.main;

import com.pilaf.tgl.api.enums.ParameterValueType;

public class Vitality extends MainAttribute {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public ParameterValueType parameterValueType() {
	return ParameterValueType.VITALITY;
    }

}
