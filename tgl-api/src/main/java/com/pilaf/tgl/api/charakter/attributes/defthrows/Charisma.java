package com.pilaf.tgl.api.charakter.attributes.defthrows;

import com.pilaf.tgl.api.enums.DefenceThrowType;
import com.pilaf.tgl.api.enums.ParameterValueType;

public class Charisma extends DefeceThrow {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public DefenceThrowType defenceThrowType() {
	return DefenceThrowType.Charisma;
    }

    public static String getMainAttributeName() {
	return ParameterValueType.PERSONALITY.name();
    }

}
