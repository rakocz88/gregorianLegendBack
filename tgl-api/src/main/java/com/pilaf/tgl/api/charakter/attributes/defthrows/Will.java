package com.pilaf.tgl.api.charakter.attributes.defthrows;

import com.pilaf.tgl.api.enums.DefenceThrowType;
import com.pilaf.tgl.api.enums.ParameterValueType;

public class Will extends DefeceThrow {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public DefenceThrowType defenceThrowType() {
	return DefenceThrowType.Will;
    }

    public static String getMainAttributeName() {
	return ParameterValueType.WISDOM.name();
    }

}
