package com.pilaf.tgl.api.charakter.defences;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;

//TODO RETHINK
public class CharakterDefences {

    static final int STANDARD_DODGE_VALUE = 15;

    private CharakterDodgeParam charakterDodgeParam = new CharakterDodgeParam();

    private CharakterShieldParam charakterShieldParam = new CharakterShieldParam();

    private CharakterParryParam charakterParryParam = new CharakterParryParam();

    public CharakterDodgeParam getCharakterDodgeParam() {
	return charakterDodgeParam;
    }

    public void setCharakterDodgeParam(CharakterDodgeParam charakterDodgeParam) {
	this.charakterDodgeParam = charakterDodgeParam;
    }

    public CharakterShieldParam getCharakterShieldParam() {
	return charakterShieldParam;
    }

    public void setCharakterShieldParam(CharakterShieldParam charakterShieldParam) {
	this.charakterShieldParam = charakterShieldParam;
    }

    public CharakterParryParam getCharakterParryParam() {
	return charakterParryParam;
    }

    public void setCharakterParryParam(CharakterParryParam charakterParryParam) {
	this.charakterParryParam = charakterParryParam;
    }

    public CharakterDefences initDefences(CharakterInCombatBase charakterInCombatBase) {
	charakterDodgeParam.initDefences(charakterInCombatBase);
	return this;
    }

    public CharakterDefences buildDefences(CharakterInCombatBase charakterInCombatBase) {
	charakterDodgeParam.buildDefences(charakterInCombatBase);
	return this;
    }

}
