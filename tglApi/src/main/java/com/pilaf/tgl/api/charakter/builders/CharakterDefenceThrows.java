package com.pilaf.tgl.api.charakter.builders;

import java.lang.reflect.Field;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.attributes.defthrows.Charisma;
import com.pilaf.tgl.api.charakter.attributes.defthrows.Endurance;
import com.pilaf.tgl.api.charakter.attributes.defthrows.Reflex;
import com.pilaf.tgl.api.charakter.attributes.defthrows.Search;
import com.pilaf.tgl.api.charakter.attributes.defthrows.Will;
import com.pilaf.tgl.api.charakter.attributes.main.MainAttribute;

public class CharakterDefenceThrows {

    private Will will = new Will();
    private Search search = new Search();
    private Reflex reflex = new Reflex();
    private Endurance endurance = new Endurance();
    private Charisma charisma = new Charisma();
    private int willMod;
    private int searchMod;
    private int reflexMod;
    private int enduranceMod;
    private int charismaMod;

    public CharakterDefenceThrows() {
	super();
    }

    public Will getWill() {
	return will;
    }

    public void setWill(Will will) {
	this.will = will;
    }

    public Search getSearch() {
	return search;
    }

    public void setSearch(Search search) {
	this.search = search;
    }

    public Reflex getReflex() {
	return reflex;
    }

    public void setReflex(Reflex reflex) {
	this.reflex = reflex;
    }

    public Endurance getEndurance() {
	return endurance;
    }

    public void setEndurance(Endurance endurance) {
	this.endurance = endurance;
    }

    public Charisma getCharisma() {
	return charisma;
    }

    public void setCharisma(Charisma charisma) {
	this.charisma = charisma;
    }

    public int getWillMod() {
	return willMod;
    }

    public void setWillMod(int willMod) {
	this.willMod = willMod;
    }

    public int getSearchMod() {
	return searchMod;
    }

    public void setSearchMod(int searchMod) {
	this.searchMod = searchMod;
    }

    public int getReflexMod() {
	return reflexMod;
    }

    public void setReflexMod(int reflexMod) {
	this.reflexMod = reflexMod;
    }

    public int getEnduranceMod() {
	return enduranceMod;
    }

    public void setEnduranceMod(int enduranceMod) {
	this.enduranceMod = enduranceMod;
    }

    public int getCharismaMod() {
	return charismaMod;
    }

    public void setCharismaMod(int charismaMod) {
	this.charismaMod = charismaMod;
    }

    public void buildDefenceThrows(CharakterInCombatBase charakterInCombatBase) {
	this.charisma.value = calculateDefanceThrows(charakterInCombatBase, Charisma.getMainAttributeName(),
		this.charismaMod);
	this.endurance.value = calculateDefanceThrows(charakterInCombatBase, Endurance.getMainAttributeName(),
		this.enduranceMod);
	this.will.value = calculateDefanceThrows(charakterInCombatBase, Will.getMainAttributeName(), this.willMod);
	this.reflex.value = calculateDefanceThrows(charakterInCombatBase, Reflex.getMainAttributeName(),
		this.reflexMod);
	this.search.value = calculateDefanceThrows(charakterInCombatBase, Search.getMainAttributeName(),
		this.searchMod);
    }

    public int calculateDefanceThrows(CharakterInCombatBase charakterInCombatBase, String fieldName, int modyfier) {
	try {
	    Field field = CharakterMainParameters.class.getDeclaredField(fieldName.toLowerCase());
	    field.setAccessible(true);
	    MainAttribute obj = (MainAttribute) field.get(charakterInCombatBase.getCharakterMainParameters());
	    return 4 + (obj.getCurrentValue() * 2) + modyfier;
	} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
	    // TODO EXCEPTION HANDLING
	    throw new RuntimeException("Error in getting Attribute");

	}
    }
}
