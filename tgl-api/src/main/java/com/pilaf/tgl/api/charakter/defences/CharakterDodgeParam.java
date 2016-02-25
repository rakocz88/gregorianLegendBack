package com.pilaf.tgl.api.charakter.defences;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;

public class CharakterDodgeParam {

    private int dodgeRawValue;
    private int dodgeMod;
    private int dodgeCurMod;

    public CharakterDodgeParam initDefences(CharakterInCombatBase charakterInCombatBase) {
	int value = CharakterDefences.STANDARD_DODGE_VALUE
		+ (charakterInCombatBase.getCharakterMainParameters().getDexterity().getCurrentValue() * 3);
	setDodgeRawValue(value);
	return this;
    }

    public CharakterDodgeParam buildDefences(CharakterInCombatBase charakterInCombatBase) {
	int value = CharakterDefences.STANDARD_DODGE_VALUE
		+ (charakterInCombatBase.getCharakterMainParameters().getDexterity().getCurrentValue() * 3);
	setDodgeRawValue(value);
	return this;
    }

    public int getDodgeRawValue() {
	return dodgeRawValue;
    }

    public CharakterDodgeParam setDodgeRawValue(int dodgeRawValue) {
	this.dodgeRawValue = dodgeRawValue;
	return this;
    }

    public int getDodgeMod() {
	return dodgeMod;
    }

    public CharakterDodgeParam setDodgeMod(int dodgeMod) {
	this.dodgeMod = dodgeMod;
	return this;
    }

    public int getDodgeCurMod() {
	return dodgeCurMod;
    }

    public CharakterDodgeParam setDodgeCurMod(int dodgeCurMod) {
	this.dodgeCurMod = dodgeCurMod;
	return this;
    }

    public int getDodgeCurrentValue() {
	return this.dodgeCurMod + this.dodgeMod + this.dodgeRawValue;
    }

}
