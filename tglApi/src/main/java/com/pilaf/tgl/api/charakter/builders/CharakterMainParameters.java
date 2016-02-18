package com.pilaf.tgl.api.charakter.builders;

import com.pilaf.tgl.api.charakter.attributes.main.Dexterity;
import com.pilaf.tgl.api.charakter.attributes.main.Knowledge;
import com.pilaf.tgl.api.charakter.attributes.main.Perception;
import com.pilaf.tgl.api.charakter.attributes.main.Personality;
import com.pilaf.tgl.api.charakter.attributes.main.Strength;
import com.pilaf.tgl.api.charakter.attributes.main.Vitality;
import com.pilaf.tgl.api.charakter.attributes.main.Wisdom;

public class CharakterMainParameters {

    private Strength strength = new Strength();
    private Dexterity dexterity = new Dexterity();
    private Vitality vitality = new Vitality();
    private Wisdom wisdom = new Wisdom();
    private Knowledge knowledge = new Knowledge();
    private Perception perception = new Perception();
    private Personality personality = new Personality();

    public CharakterMainParameters() {
	super();
    }

    public CharakterMainParameters(Strength strength, Dexterity dexterity, Vitality vitality, Wisdom wisdom,
	    Knowledge knowledge, Perception perception, Personality personality) {
	super();
	this.strength = strength;
	this.dexterity = dexterity;
	this.vitality = vitality;
	this.wisdom = wisdom;
	this.knowledge = knowledge;
	this.perception = perception;
	this.personality = personality;
    }

    public Strength getStrength() {
	return strength;
    }

    public CharakterMainParameters setStrength(Strength strength) {
	this.strength = strength;
	return this;
    }

    public Dexterity getDexterity() {
	return dexterity;
    }

    public CharakterMainParameters setDexterity(Dexterity dexterity) {
	this.dexterity = dexterity;
	return this;
    }

    public Vitality getVitality() {
	return vitality;
    }

    public CharakterMainParameters setVitality(Vitality vitality) {
	this.vitality = vitality;
	return this;
    }

    public Wisdom getWisdom() {
	return wisdom;
    }

    public CharakterMainParameters setWisdom(Wisdom wisdom) {
	this.wisdom = wisdom;
	return this;
    }

    public Knowledge getKnowledge() {
	return knowledge;
    }

    public CharakterMainParameters setKnowledge(Knowledge knowledge) {
	this.knowledge = knowledge;
	return this;
    }

    public Perception getPerception() {
	return perception;
    }

    public CharakterMainParameters setPerception(Perception perception) {
	this.perception = perception;
	return this;
    }

    public Personality getPersonality() {
	return personality;
    }

    public CharakterMainParameters setPersonality(Personality personality) {
	this.personality = personality;
	return this;
    }

    public CharakterMainParameters buildParams() {
	return this;
    }

}
