package com.pilaf.tgl.api.charakter.attributes.defthrows;

import com.pilaf.tgl.api.effect.enums.DefenceThrowType;
import com.pilaf.tgl.api.effect.enums.ParameterValueType;

public class Search extends DefeceThrow {

    public int value = 0;

    @Override
    public DefenceThrowType defenceThrowType() {
	return DefenceThrowType.Search;
    }

    public static String getMainAttributeName() {
	return ParameterValueType.PERCEPTION.name();
    }

}
