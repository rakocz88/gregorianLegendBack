package com.pilaf.tgl.api.charakter.other;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;

public class CharakterOtherFields {

    private CharakterSpeed charakterSpeed = new CharakterSpeed();

    public CharakterSpeed getCharakterSpeed() {
	return charakterSpeed;
    }

    public CharakterOtherFields setCharakterSpeed(CharakterSpeed charakterSpeed) {
	this.charakterSpeed = charakterSpeed;
	return this;
    }

    public CharakterOtherFields build(CharakterInCombatBase charakterInCombatBase) {
	getCharakterSpeed().build(charakterInCombatBase);
	return this;
    }

}
