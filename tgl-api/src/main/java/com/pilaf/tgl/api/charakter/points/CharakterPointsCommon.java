package com.pilaf.tgl.api.charakter.points;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.enums.ParameterValueType;

public abstract class CharakterPointsCommon {

    private int currentValue;
    private int rawValue;
    private int modValue;
    private int currentMod;

    public int getCurrentMod() {
	return currentMod;
    }

    public CharakterPointsCommon setCurrentMod(int currentMod) {
	this.currentMod = currentMod;
	return this;
    }

    public CharakterPointsCommon changeCurrentMod(int valueChange) {
	setCurrentMod(getCurrentMod() + valueChange);
	return this;
    }

    public int getCurrentValue() {
	return currentValue;
    }

    public CharakterPointsCommon setCurrentValue(int currentValue) {
	this.currentValue = currentValue;
	return this;
    }

    public CharakterPointsCommon changeCurrentValue(int valueChange) {
	setCurrentValue(getCurrentValue() + valueChange);
	return this;
    }

    public int getRawValue() {
	return rawValue;
    }

    public CharakterPointsCommon setRawValue(int rawValue) {
	this.rawValue = rawValue;
	return this;
    }

    public CharakterPointsCommon changeRawValue(int valueChange) {
	setRawValue(getRawValue() + valueChange);
	return this;
    }

    public int getModValue() {
	return modValue;
    }

    public CharakterPointsCommon setModValue(int modValue) {
	this.modValue = modValue;
	return this;
    }

    public CharakterPointsCommon changeModValue(int valueChange) {
	setModValue(getModValue() + valueChange);
	return this;
    }

    public int getMaxValue() {
	return getModValue() + getRawValue() + getCurrentMod();
    }

    public abstract ParameterValueType getParameterValueType();

    public abstract CharakterPointsCommon buildPoints(CharakterInCombatBase charakterInCombatBase);

    public abstract CharakterPointsCommon initPoints(CharakterInCombatBase charakterInCombatBase);

}
