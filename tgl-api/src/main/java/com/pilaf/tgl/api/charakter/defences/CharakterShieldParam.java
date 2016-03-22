package com.pilaf.tgl.api.charakter.defences;

import java.io.Serializable;

public class CharakterShieldParam implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    // TODO SHIELD
    private int shieldRawValue;
    private int shieldMod;
    private int shieldCurValue;

    private int shieldResistRawValue;
    private int shieldResistMod;
    private int shieldResistCurValue;

    public int getShieldRawValue() {
	return shieldRawValue;
    }

    public CharakterShieldParam setShieldRawValue(int shieldRawValue) {
	this.shieldRawValue = shieldRawValue;
	return this;
    }

    public CharakterShieldParam changeShieldRawValue(int shieldRawValue) {
	this.shieldRawValue = ++shieldRawValue;
	return this;
    }

    public int getShieldMod() {
	return shieldMod;
    }

    public CharakterShieldParam setShieldMod(int shieldMod) {
	this.shieldMod = shieldMod;
	return this;
    }

    public CharakterShieldParam changeShieldMod(int shieldMod) {
	this.shieldMod = ++shieldMod;
	return this;
    }

    public int getShieldCurValue() {
	return shieldCurValue;
    }

    public CharakterShieldParam setShieldCurValue(int shieldCurValue) {
	this.shieldCurValue = shieldCurValue;
	return this;
    }

    public CharakterShieldParam changeShieldCurValue(int shieldCurValue) {
	this.shieldCurValue = ++shieldCurValue;
	return this;
    }

    public int getShieldResistRawValue() {
	return shieldResistRawValue;
    }

    public CharakterShieldParam setShieldResistRawValue(int shieldResistRawValue) {
	this.shieldResistRawValue = shieldResistRawValue;
	return this;
    }

    public CharakterShieldParam changeShieldResistRawValue(int shieldResistRawValue) {
	this.shieldResistRawValue = ++shieldResistRawValue;
	return this;
    }

    public int getShieldResistMod() {
	return shieldResistMod;
    }

    public CharakterShieldParam setShieldResistMod(int shieldResistMod) {
	this.shieldResistMod = shieldResistMod;
	return this;
    }

    public CharakterShieldParam changeShieldResistMod(int shieldResistMod) {
	this.shieldResistMod = shieldResistMod;
	return this;
    }

    public int getShieldResistCurValue() {
	return shieldResistCurValue;
    }

    public CharakterShieldParam setShieldResistCurValue(int shieldResistCurValue) {
	this.shieldResistCurValue = shieldResistCurValue;
	return this;
    }

    public CharakterShieldParam changeShieldResistCurValue(int shieldResistCurValue) {
	this.shieldResistCurValue = ++shieldResistCurValue;
	return this;
    }

}
