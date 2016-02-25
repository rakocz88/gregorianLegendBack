package com.pilaf.tgl.api.charakter.attributes.defthrows;

import com.pilaf.tgl.api.enums.DefenceThrowType;

public abstract class DefeceThrow {

    public int value = 0;

    public abstract DefenceThrowType defenceThrowType();

    public static String getMainAttributeName() {
	return null;
    }

    public int getValue() {
	return this.value;
    }

    public void setValue(int value) {
	this.value = value;
    }

}
