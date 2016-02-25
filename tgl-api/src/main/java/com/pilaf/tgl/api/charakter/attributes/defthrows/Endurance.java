package com.pilaf.tgl.api.charakter.attributes.defthrows;

import com.pilaf.tgl.api.enums.DefenceThrowType;
import com.pilaf.tgl.api.enums.ParameterValueType;

public class Endurance extends DefeceThrow {

    public DefenceThrowType defenceThrowType() {
	return DefenceThrowType.Endurance;
    }

    public static String getMainAttributeName() {
	return ParameterValueType.VITALITY.name();
    }

}
