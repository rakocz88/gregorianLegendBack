package com.pilaf.tgl.api.charakter.attributes.person;

import java.lang.reflect.Field;

import com.pilaf.tgl.api.charakter.attributes.defthrows.Charisma;
import com.pilaf.tgl.api.charakter.attributes.defthrows.Endurance;
import com.pilaf.tgl.api.charakter.attributes.defthrows.Reflex;
import com.pilaf.tgl.api.charakter.attributes.defthrows.Search;
import com.pilaf.tgl.api.charakter.attributes.defthrows.Will;
import com.pilaf.tgl.api.charakter.attributes.main.Dexterity;
import com.pilaf.tgl.api.charakter.attributes.main.Knowledge;
import com.pilaf.tgl.api.charakter.attributes.main.MainAttribute;
import com.pilaf.tgl.api.charakter.attributes.main.Perception;
import com.pilaf.tgl.api.charakter.attributes.main.Personality;
import com.pilaf.tgl.api.charakter.attributes.main.Strength;
import com.pilaf.tgl.api.charakter.attributes.main.Vitality;
import com.pilaf.tgl.api.charakter.attributes.main.Wisdom;

public class CharakterInCombatBase {

    private Will will;
    private Search search;
    private Reflex reflex;
    private Endurance endurance;
    private Charisma charisma;
    private Strength strength;
    private Dexterity dexterity;
    private Vitality vitality;
    private Wisdom wisdom;
    private Knowledge knowledge;
    private Perception perception;
    private Personality personality;

    public CharakterInCombatBase(CharakterCombatBaseBuilder charakterCombatBaseBuilder) {
	this.strength = charakterCombatBaseBuilder.strength;
	this.dexterity = charakterCombatBaseBuilder.dexterity;
	this.vitality = charakterCombatBaseBuilder.vitality;
	this.wisdom = charakterCombatBaseBuilder.wisdom;
	this.knowledge = charakterCombatBaseBuilder.knowledge;
	this.perception = charakterCombatBaseBuilder.perception;
	this.personality = charakterCombatBaseBuilder.personality;
	this.charisma = charakterCombatBaseBuilder.charisma;
	this.endurance = charakterCombatBaseBuilder.endurance;
	this.reflex = charakterCombatBaseBuilder.reflex;
	this.search = charakterCombatBaseBuilder.search;
	this.will = charakterCombatBaseBuilder.will;
    }

    public Charisma getCharisma() {
	return charisma;
    }

    public Endurance getEndurance() {
	return endurance;
    }

    public Reflex getReflex() {
	return reflex;
    }

    public Search getSearch() {
	return search;
    }

    public Will getWill() {
	return will;
    }

    public Strength getStrength() {
	return strength;
    }

    public Dexterity getDexterity() {
	return dexterity;
    }

    public Vitality getVitality() {
	return vitality;
    }

    public Wisdom getWisdom() {
	return wisdom;
    }

    public Knowledge getKnowledge() {
	return knowledge;
    }

    public Perception getPerception() {
	return perception;
    }

    public Personality getPersonality() {
	return personality;
    }

    public static class CharakterCombatBaseBuilder {

	private Strength strength = new Strength();
	private Dexterity dexterity = new Dexterity();
	private Vitality vitality = new Vitality();
	private Wisdom wisdom = new Wisdom();
	private Knowledge knowledge = new Knowledge();
	private Perception perception = new Perception();
	private Personality personality = new Personality();

	private Charisma charisma = new Charisma();
	private Endurance endurance = new Endurance();
	private Reflex reflex = new Reflex();
	private Search search = new Search();
	private Will will = new Will();

	public CharakterCombatBaseBuilder strength(Strength strength) {
	    this.strength = strength;
	    return this;
	}

	public CharakterCombatBaseBuilder dexterity(Dexterity dexterity) {
	    this.dexterity = dexterity;
	    return this;
	}

	public CharakterCombatBaseBuilder vitality(Vitality vitality) {
	    this.vitality = vitality;
	    return this;
	}

	public CharakterCombatBaseBuilder wisdom(Wisdom wisdom) {
	    this.wisdom = wisdom;
	    return this;
	}

	public CharakterCombatBaseBuilder knowledge(Knowledge knowledge) {
	    this.knowledge = knowledge;
	    return this;
	}

	public CharakterCombatBaseBuilder perception(Perception perception) {
	    this.perception = perception;
	    return this;
	}

	public CharakterCombatBaseBuilder personality(Personality personality) {
	    this.personality = personality;
	    return this;
	}

	public CharakterCombatBaseBuilder will(Will will) {
	    this.will = will;
	    return this;
	}

	public CharakterCombatBaseBuilder search(Search search) {
	    this.search = search;
	    return this;
	}

	public CharakterCombatBaseBuilder reflex(Reflex reflex) {
	    this.reflex = reflex;
	    return this;
	}

	public CharakterCombatBaseBuilder endurance(Endurance endurance) {
	    this.endurance = endurance;
	    return this;
	}

	public CharakterCombatBaseBuilder charisma(Charisma charisma) {
	    this.charisma = charisma;
	    return this;
	}

	public CharakterInCombatBase build() {
	    this.charisma.value = calculateDefanceThrows(this, Charisma.getMainAttributeName());
	    this.endurance.value = calculateDefanceThrows(this, Endurance.getMainAttributeName());
	    this.reflex.value = calculateDefanceThrows(this, Reflex.getMainAttributeName());
	    this.search.value = calculateDefanceThrows(this, Search.getMainAttributeName());
	    this.will.value = calculateDefanceThrows(this, Will.getMainAttributeName());
	    return new CharakterInCombatBase(this);
	}

	// TODO REFACTOR IT- MOVE TO ANOTHER CLASS
	public int calculateDefanceThrows(CharakterCombatBaseBuilder charakterInCombatBase, String fieldName) {
	    try {
		Field field = charakterInCombatBase.getClass().getDeclaredField(fieldName.toLowerCase());
		field.setAccessible(true);
		MainAttribute obj = (MainAttribute) field.get(charakterInCombatBase);
		return 4 + (obj.getValue() * 2);
	    } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
		// TODO EXCEPTION HANDLING
		throw new RuntimeException("Error in getting Attribute");
	    }
	};

    }

}
