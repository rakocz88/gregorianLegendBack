package com.pilaf.tgl.api.charakter.attributes.defthrows;

import com.pilaf.tgl.api.enums.DefenceThrowType;
import com.pilaf.tgl.api.enums.ParameterValueType;

public class Search extends DefeceThrow {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public DefenceThrowType defenceThrowType() {
	return DefenceThrowType.Search;
    }

    public static String getMainAttributeName() {
	return ParameterValueType.PERCEPTION.name();
    }

}
