package com.pilaf.tgl.api.charakter;

import java.io.Serializable;

/**
 * Interface for Main Attributes and Resistances
 * 
 * @author filip
 *
 */
public interface CharakterElems1 extends Serializable {

    public static final int INIT_VALUE_PARAM = 4;

    public CharakterElems1 setRawValue(int rawValue);

    public int getRawValue();

    default public CharakterElems1 changeRawValue(int modValue) {
	setRawValue(getRawValue() + modValue);
	return this;
    }

    public CharakterElems1 setModValue(int modValue);

    public int getModValue();

    default public CharakterElems1 changeModValue(int modValue) {
	setModValue(getModValue() + modValue);
	return this;
    }

    public CharakterElems1 setCurrentMod(int currentMod);

    public int getCurrentMod();

    default public CharakterElems1 changeCurrentMod(int modValue) {
	setCurrentMod(getCurrentMod() + modValue);
	return this;
    }

    default public int getCurrentValue() {
	return this.getCurrentMod() + this.getModValue() + this.getRawValue();
    }

    public CharakterElems1 buildValues(CharakterInCombatBase charakter, String name);

}
