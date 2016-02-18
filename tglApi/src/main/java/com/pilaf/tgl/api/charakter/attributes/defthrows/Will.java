package com.pilaf.tgl.api.charakter.attributes.defthrows;

import com.pilaf.tgl.api.effect.enums.DefenceThrowType;
import com.pilaf.tgl.api.effect.enums.ParameterValueType;

public class Will extends DefeceThrow {

    @Override
    public DefenceThrowType defenceThrowType() {
	return DefenceThrowType.Will;
    }

    public static String getMainAttributeName() {
	return ParameterValueType.WISDOM.name();
    }

}
