package com.pilaf.tgl.api.charakter.resistances;

import java.lang.reflect.Field;

import com.pilaf.tgl.api.charakter.CharakterElems1;
import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.attributes.main.MainAttribute;
import com.pilaf.tgl.api.charakter.builders.CharakterMainParameters;
import com.pilaf.tgl.api.effect.enums.Resistances;

public abstract class Resistance implements CharakterElems1 {

    public static final int INIT_START_RESISTANCE = 2;

    protected int rawValue;

    protected int modValue;

    protected int currentModValue;

    @Override
    public Resistance setRawValue(int rawValue) {
	this.rawValue = rawValue;
	return this;
    }

    @Override
    public int getRawValue() {
	return this.rawValue;
    }

    @Override
    public Resistance setModValue(int modValue) {
	this.modValue = modValue;
	return this;
    }

    @Override
    public int getModValue() {
	return this.modValue;
    }

    @Override
    public Resistance setCurrentMod(int currentMod) {
	this.currentModValue = currentMod;
	return this;
    }

    @Override
    public int getCurrentMod() {
	return this.currentModValue;
    }

    public Resistance initValue(CharakterInCombatBase charakterInCombatBase, String name) {

	Field mainParam;
	try {
	    mainParam = charakterInCombatBase.getCharakterMainParameters().getClass().getField(name);
	    mainParam.setAccessible(true);
	    MainAttribute mainAttribute = (MainAttribute) mainParam
		    .get(charakterInCombatBase.getCharakterMainParameters());
	    setRawValue(INIT_START_RESISTANCE + mainAttribute.getCurrentValue());
	    return this;
	} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
	    e.printStackTrace();
	    throw new RuntimeException("Błąd w resistance init");
	}

    }

    // public Resistance initValue(CharakterInCombatBase charakterInCombatBase,
    // Class<? extends MainAttribute> clazz) {
    //
    // Field mainParam;
    // try {
    // mainParam = charakterInCombatBase.getCharakterMainParameters().getClass()
    // .getField(clazz.getName().toLowerCase());
    // mainParam.setAccessible(true);
    // MainAttribute mainAttribute = (MainAttribute) mainParam
    // .get(charakterInCombatBase.getCharakterMainParameters());
    // setRawValue(INIT_START_RESISTANCE + mainAttribute.getCurrentValue());
    // return this;
    // } catch (NoSuchFieldException | SecurityException |
    // IllegalArgumentException | IllegalAccessException e) {
    // e.printStackTrace();
    // throw new RuntimeException("Błąd w resistance init");
    // }
    //
    // }

    @Override
    public CharakterElems1 buildValues(CharakterInCombatBase charakter, String name) {
	try {
	    Field mainParam = CharakterMainParameters.class.getDeclaredField(name);
	    mainParam.setAccessible(true);
	    MainAttribute mainAttribute = (MainAttribute) mainParam.get(charakter.getCharakterMainParameters());
	    setRawValue(INIT_START_RESISTANCE + (mainAttribute.getCurrentValue() / 2));
	    return this;
	} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
	    e.printStackTrace();
	    throw new RuntimeException("Błąd w resistance build");
	}
    }

    public abstract String getAttributeModyfier();

    public abstract Resistances resistanceType();

}
