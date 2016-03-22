package com.pilaf.tgl.api.charakter.attributes.defthrows;

import com.pilaf.tgl.api.enums.DefenceThrowType;
import com.pilaf.tgl.api.enums.ParameterValueType;

public class Reflex extends DefeceThrow {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public DefenceThrowType defenceThrowType() {
	return DefenceThrowType.Reflex;
    }

    public static String getMainAttributeName() {
	return ParameterValueType.DEXTERITY.name();
    }

}
