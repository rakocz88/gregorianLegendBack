package com.pilaf.tgl.api.charakter.attributes.defthrows;

import com.pilaf.tgl.api.effect.enums.DefenceThrowType;
import com.pilaf.tgl.api.effect.enums.ParameterValueType;

public class Endurance extends DefeceThrow {

    public int value = 0;

    public DefenceThrowType defenceThrowType() {
	return DefenceThrowType.Endurance;
    }

    public static String getMainAttributeName() {
	return ParameterValueType.VITALITY.name();
    }

}
