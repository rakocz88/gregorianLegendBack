package com.pilaf.tgl.api.charakter;

import java.io.Serializable;

import com.pilaf.tgl.api.charakter.action.CharakterActiveActions;
import com.pilaf.tgl.api.charakter.atacks.CharakterBasicAtackStats;
import com.pilaf.tgl.api.charakter.attributes.defthrows.CharakterDefenceThrows;
import com.pilaf.tgl.api.charakter.builders.CharakterMainParameters;
import com.pilaf.tgl.api.charakter.defences.CharakterDefences;
import com.pilaf.tgl.api.charakter.other.CharakterOtherFields;
import com.pilaf.tgl.api.charakter.points.CharakterPoints;
import com.pilaf.tgl.api.charakter.resistances.CharakterResistances;

public class CharakterInCombatBase implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    // TODO MOVE TO CHARAKTER DESCRIPTIONS

    private CharakterMainParameters charakterMainParameters = new CharakterMainParameters();
    private CharakterDefenceThrows charakterDefenceThrows = new CharakterDefenceThrows();
    private CharakterPoints charakterPoints = new CharakterPoints();
    private CharakterResistances charakterResistances = new CharakterResistances();
    private CharakterBasicAtackStats charakterBasicAtacksStats = new CharakterBasicAtackStats();
    private CharakterDefences charakterDefences = new CharakterDefences();
    private CharakterDescriptions charakterDescriptions = new CharakterDescriptions();
    private CharakterActiveActions charakterActiveActions = new CharakterActiveActions();
    private CharakterEquipment charakterEquipment = new CharakterEquipment();
    private CharakterOtherFields charakterOtherFields = new CharakterOtherFields();

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

    public CharakterDefences getCharakterDefences() {
	return charakterDefences;
    }

    public void setCharakterDefences(CharakterDefences charakterDefences) {
	this.charakterDefences = charakterDefences;
    }

    public CharakterDescriptions getCharakterDescriptions() {
	return charakterDescriptions;
    }

    public void setCharakterDescriptions(CharakterDescriptions charakterDescriptions) {
	this.charakterDescriptions = charakterDescriptions;
    }

    public CharakterActiveActions getCharakterActiveActions() {
	return charakterActiveActions;
    }

    public void setCharakterActiveActions(CharakterActiveActions charakterActiveAtacks) {
	charakterActiveActions = charakterActiveAtacks;
    }

    public CharakterBasicAtackStats getCharakterBasicAtacksStats() {
	return charakterBasicAtacksStats;
    }

    public void setCharakterBasicAtacksStats(CharakterBasicAtackStats charakterBasicAtacksStats) {
	this.charakterBasicAtacksStats = charakterBasicAtacksStats;
    }

    public CharakterEquipment getCharakterEquipment() {
	return charakterEquipment;
    }

    public void setCharakterEquipment(CharakterEquipment charakterEquipment) {
	this.charakterEquipment = charakterEquipment;
    }

    public CharakterOtherFields getCharakterOtherFields() {
	return charakterOtherFields;
    }

    public void setCharakterOtherFields(CharakterOtherFields charakterOtherFields) {
	this.charakterOtherFields = charakterOtherFields;
    }

    public CharakterInCombatBase buildChar() {
	this.charakterMainParameters.buildParams();
	this.charakterDefenceThrows.buildDefenceThrows(this);
	this.charakterPoints.buildPoints(this);
	this.charakterResistances.buildResistances(this);
	this.charakterBasicAtacksStats.buildAtack(this);
	this.charakterDefences.buildDefences(this);
	this.charakterActiveActions.initAvailableActions(this);
	this.charakterOtherFields.build(this);
	return this;
    }

    public CharakterInCombatBase initChar() {
	this.charakterMainParameters.buildParams();
	this.charakterDefenceThrows.buildDefenceThrows(this);
	this.charakterPoints.initPoints(this);
	this.charakterResistances.initResistances(this);
	this.charakterBasicAtacksStats.initAtack(this);
	this.charakterDefences.initDefences(this);
	this.charakterActiveActions.initAvailableActions(this);
	this.charakterOtherFields.build(this);
	return this;
    }

}
