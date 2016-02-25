package com.pilaf.tgl.api.charakter.attributes.defthrows;

import com.pilaf.tgl.api.enums.DefenceThrowType;
import com.pilaf.tgl.api.enums.ParameterValueType;

public class Charisma extends DefeceThrow {

    public DefenceThrowType defenceThrowType() {
	return DefenceThrowType.Charisma;
    }

    public static String getMainAttributeName() {
	return ParameterValueType.PERSONALITY.name();
    }

}