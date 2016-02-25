package com.pilaf.tgl.api.charakter.other;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;

public class CharakterSpeed {

    private static final int STARTING_SPEED = 2;

    private int rawSpeed;
    private int speedMod;
    private int speedCurMod;

    public int getRawSpeed() {
	return rawSpeed;
    }

    public CharakterSpeed setRawSpeed(int rawSpeed) {
	this.rawSpeed = rawSpeed;
	return this;
    }

    public CharakterSpeed changeRawSpeed(int rawSpeed) {
	this.rawSpeed += rawSpeed;
	return this;
    }

    public int getSpeedMod() {
	return speedMod;
    }

    public CharakterSpeed setSpeedMod(int speedMod) {
	this.speedMod = speedMod;
	return this;
    }

    public CharakterSpeed changeSpeedMod(int speedMod) {
	this.speedMod += speedMod;
	return this;
    }

    public int getSpeedCurMod() {
	return speedCurMod;
    }

    public CharakterSpeed setSpeedCurMod(int speedCurMod) {
	this.speedCurMod = speedCurMod;
	return this;
    }

    public CharakterSpeed changeSpeedCurMod(int speedCurMod) {
	this.speedCurMod += speedCurMod;
	return this;
    }

    public int getCurrentValue() {
	return getRawSpeed() + getSpeedCurMod() + getSpeedMod() + STARTING_SPEED;
    }

    public void build(CharakterInCombatBase charakterInCombatBase) {
	setRawSpeed(charakterInCombatBase.getCharakterMainParameters().getDexterity().getCurrentValue() * 2);
    }

}
