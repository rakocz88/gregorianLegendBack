package com.pilaf.tgl.api.charakter.other;

import java.io.Serializable;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;

public class CharakterOtherFields implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
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
