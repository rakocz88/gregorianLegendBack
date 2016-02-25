package com.pilaf.tgl.api.charakter.attributes.main;

import com.pilaf.tgl.api.charakter.CharakterElems1;
import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.enums.ParameterValueType;

public abstract class MainAttribute implements CharakterElems1 {

    protected int rawValue = INIT_VALUE_PARAM;

    protected int modValue;

    protected int currentModValue;

    @Override
    public MainAttribute setRawValue(int rawValue) {
	this.rawValue = rawValue;
	return this;
    }

    @Override
    public int getRawValue() {
	return this.rawValue;
    }

    @Override
    public MainAttribute setModValue(int modValue) {
	this.modValue = modValue;
	return this;
    }

    @Override
    public int getModValue() {
	return this.modValue;
    }

    @Override
    public MainAttribute setCurrentMod(int currentMod) {
	this.currentModValue = currentMod;
	return this;
    }

    @Override
    public int getCurrentMod() {
	return this.currentModValue;
    }

    @Override
    public MainAttribute buildValues(CharakterInCombatBase charakter, String name) {
	// try {
	// Field field = CharakterInCombatBase.class.getField(name);
	// field.setAccessible(true);
	// int fieldValue =
	// } catch (NoSuchFieldException | SecurityException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }

	return this;
    }

    public abstract ParameterValueType parameterValueType();

}
