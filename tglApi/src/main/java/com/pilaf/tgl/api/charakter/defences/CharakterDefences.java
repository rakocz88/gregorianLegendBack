package com.pilaf.tgl.api.charakter.defences;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;

//TODO RETHINK
public class CharakterDefences {

    private static final int STANDARD_DODGE_VALUE = 15;
    private int dodgeRawValue;
    private int dodgeMod;
    private int dodgeCurMod;

    // TODO SHIELD
    private int shieldRawValue;
    private int shieldMod;
    private int shieldCurValue;

    public int getDodgeRawValue() {
	return dodgeRawValue;
    }

    public CharakterDefences setDodgeRawValue(int dodgeRawValue) {
	this.dodgeRawValue = dodgeRawValue;
	return this;
    }

    public int getDodgeMod() {
	return dodgeMod;
    }

    public CharakterDefences setDodgeMod(int dodgeMod) {
	this.dodgeMod = dodgeMod;
	return this;
    }

    public int getDodgeCurMod() {
	return dodgeCurMod;
    }

    public CharakterDefences setDodgeCurMod(int dodgeCurMod) {
	this.dodgeCurMod = dodgeCurMod;
	return this;
    }

    public int getDodgeCurrentValue() {
	return dodgeRawValue + dodgeCurMod + dodgeMod;
    }

    public CharakterDefences initDefences(CharakterInCombatBase charakterInCombatBase) {
	int value = STANDARD_DODGE_VALUE
		+ (charakterInCombatBase.getCharakterMainParameters().getDexterity().getCurrentValue() * 3);
	setDodgeRawValue(value);
	return this;
    }

    public CharakterDefences buildDefences(CharakterInCombatBase charakterInCombatBase) {
	int value = STANDARD_DODGE_VALUE
		+ (charakterInCombatBase.getCharakterMainParameters().getDexterity().getCurrentValue() * 3);
	setDodgeRawValue(value);
	return this;
    }

}
