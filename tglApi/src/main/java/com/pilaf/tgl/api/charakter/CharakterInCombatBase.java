package com.pilaf.tgl.api.charakter;

import com.pilaf.tgl.api.charakter.atack.basic.CharakterBasicAtacks;
import com.pilaf.tgl.api.charakter.builders.CharakterDefenceThrows;
import com.pilaf.tgl.api.charakter.builders.CharakterMainParameters;
import com.pilaf.tgl.api.charakter.defences.CharakterDefences;
import com.pilaf.tgl.api.charakter.points.CharakterPoints;
import com.pilaf.tgl.api.charakter.resistances.CharakterResistances;

public class CharakterInCombatBase {

    // TODO MOVE TO CHARAKTER DESCRIPTIONS
    private String charName;

    private CharakterMainParameters charakterMainParameters = new CharakterMainParameters();
    private CharakterDefenceThrows charakterDefenceThrows = new CharakterDefenceThrows();
    private CharakterPoints charakterPoints = new CharakterPoints();
    private CharakterResistances charakterResistances = new CharakterResistances();
    private CharakterBasicAtacks charakterBasicAtacks = new CharakterBasicAtacks();
    private CharakterDefences charakterDefences = new CharakterDefences();

    public CharakterInCombatBase() {
	initChar();
    }

    public CharakterMainParameters getCharakterMainParameters() {
	return charakterMainParameters;
    }

    public void setCharakterMainParameters(CharakterMainParameters charakterMainParameters) {
	this.charakterMainParameters = charakterMainParameters;
    }

    public CharakterDefenceThrows getCharakterDefenceThrows() {
	return charakterDefenceThrows;
    }

    public void setCharakterDefenceThrows(CharakterDefenceThrows charakterDefenceThrows) {
	this.charakterDefenceThrows = charakterDefenceThrows;
    }

    public CharakterPoints getCharakterPoints() {
	return charakterPoints;
    }

    public void setCharakterPoints(CharakterPoints charakterPoints) {
	this.charakterPoints = charakterPoints;
    }

    public CharakterResistances getCharakterResistances() {
	return charakterResistances;
    }

    public void setCharakterResistances(CharakterResistances charakterResistances) {
	this.charakterResistances = charakterResistances;
    }

    public CharakterBasicAtacks getCharakterBasicAtacks() {
	return charakterBasicAtacks;
    }

    public void setCharakterBasicAtacks(CharakterBasicAtacks charakterBasicAtacks) {
	this.charakterBasicAtacks = charakterBasicAtacks;
    }

    public CharakterDefences getCharakterDefences() {
	return charakterDefences;
    }

    public void setCharakterDefences(CharakterDefences charakterDefences) {
	this.charakterDefences = charakterDefences;
    }

    public String getCharName() {
	return charName;
    }

    public void setCharName(String charName) {
	this.charName = charName;
    }

    public CharakterInCombatBase buildChar() {
	this.charakterMainParameters.buildParams();
	this.charakterDefenceThrows.buildDefenceThrows(this);
	this.charakterPoints.buildPoints(this);
	this.charakterResistances.buildResistances(this);
	this.charakterBasicAtacks.buildAtack(this);
	this.charakterDefences.buildDefences(this);
	return this;
    }

    public CharakterInCombatBase initChar() {
	this.charakterMainParameters.buildParams();
	this.charakterDefenceThrows.buildDefenceThrows(this);
	this.charakterPoints.initPoints(this);
	this.charakterResistances.initResistances(this);
	this.charakterBasicAtacks.initAtack(this);
	this.charakterDefences.initDefences(this);
	return this;
    }

}
