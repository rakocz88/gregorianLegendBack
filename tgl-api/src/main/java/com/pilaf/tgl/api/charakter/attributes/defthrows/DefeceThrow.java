package com.pilaf.tgl.api.charakter.attributes.defthrows;

import java.io.Serializable;

import com.pilaf.tgl.api.enums.DefenceThrowType;

public abstract class DefeceThrow implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
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
