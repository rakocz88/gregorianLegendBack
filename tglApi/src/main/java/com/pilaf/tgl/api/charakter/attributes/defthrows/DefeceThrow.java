package com.pilaf.tgl.api.charakter.attributes.defthrows;

import com.pilaf.tgl.api.effect.enums.DefenceThrowType;

public abstract class DefeceThrow {

    public int value = 0;

    public abstract DefenceThrowType defenceThrowType();

    public static String getMainAttributeName() {
	return null;
    }

}
