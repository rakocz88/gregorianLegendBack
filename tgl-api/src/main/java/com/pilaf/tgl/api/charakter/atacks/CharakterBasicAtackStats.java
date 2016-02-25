package com.pilaf.tgl.api.charakter.atacks;

import java.lang.reflect.Field;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.attributes.main.MainAttribute;
import com.pilaf.tgl.api.charakter.builders.CharakterMainParameters;

public class CharakterBasicAtackStats {
    private static final int BONUS_ATACK_DICE = 1;

    private int rawAtackDice;
    private int modAtackDice;
    private int curAtackModDice;

    private int rawBonusAtack;
    private int modBonusAtack;
    private int curBonusModAtack;

    private int rawDmgDice;
    private int modDmgDice;
    private int curDmgModDice;

    private int rawBonusDmg;
    private int modBonusDmg;
    private int curBonusModDmg;

    public int getCurrentBonusDmg() {
	return rawBonusDmg + modBonusDmg + curBonusModDmg;
    }

    public int getCurrentDmgDice() {
	return rawDmgDice + modDmgDice + curDmgModDice;
    }

    public int getCurrentAtackDice() {
	return rawAtackDice + modAtackDice + curAtackModDice;
    }

    public int getCurrentBonusAtack() {
	return rawBonusAtack + modBonusAtack + curBonusModAtack;
    }

    public CharakterBasicAtackStats buildAtack(CharakterInCombatBase charakter) {
	String decAttributeName = charakter.getCharakterEquipment().getMainWeapon1().atackBonusParameter();
	Field mainAttrField;
	try {
	    mainAttrField = CharakterMainParameters.class.getDeclaredField(decAttributeName);
	    mainAttrField.setAccessible(true);
	    MainAttribute atr = (MainAttribute) mainAttrField.get(charakter.getCharakterMainParameters());
	    int atackValue = atr.getCurrentValue();
	    setRawAtackDice(BONUS_ATACK_DICE + (atackValue / 2));
	    setRawDmgDice(charakter.getCharakterEquipment().getMainWeapon1().dmgDice());
	    String weaponDmgAtr = charakter.getCharakterEquipment().getMainWeapon1().dmgBonusParameter();
	    Field mainDmgAttrField = CharakterMainParameters.class.getDeclaredField(weaponDmgAtr);
	    mainDmgAttrField.setAccessible(true);
	    MainAttribute atrDmg = (MainAttribute) mainDmgAttrField.get(charakter.getCharakterMainParameters());
	    int atrDmgValue = atrDmg.getCurrentValue();
	    int weaponDmgBonus = charakter.getCharakterEquipment().getMainWeapon1().dmgBonusValue();
	    setRawBonusDmg(atrDmgValue * weaponDmgBonus);

	} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return this;
    }

    public CharakterBasicAtackStats initAtack(CharakterInCombatBase charakter) {
	String decAttributeName = charakter.getCharakterEquipment().getMainWeapon1().atackBonusParameter();
	Field mainAttrField;
	try {
	    mainAttrField = CharakterMainParameters.class.getDeclaredField(decAttributeName);
	    mainAttrField.setAccessible(true);
	    MainAttribute atr = (MainAttribute) mainAttrField.get(charakter.getCharakterMainParameters());
	    int atackValue = atr.getCurrentValue();
	    setRawAtackDice(BONUS_ATACK_DICE + (atackValue / 2));
	    setRawDmgDice(charakter.getCharakterEquipment().getMainWeapon1().dmgDice());
	    String weaponDmgAtr = charakter.getCharakterEquipment().getMainWeapon1().dmgBonusParameter();
	    Field mainDmgAttrField = CharakterMainParameters.class.getDeclaredField(weaponDmgAtr);
	    mainDmgAttrField.setAccessible(true);
	    MainAttribute atrDmg = (MainAttribute) mainDmgAttrField.get(charakter.getCharakterMainParameters());
	    int atrDmgValue = atrDmg.getCurrentValue();
	    int weaponDmgBonus = charakter.getCharakterEquipment().getMainWeapon1().dmgBonusValue();
	    setRawBonusDmg(atrDmgValue * weaponDmgBonus);
	} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return this;
    }

    public CharakterInCombatBase changeWeapon(CharakterInCombatBase charakter) {
	// charakter.getCharakterPoints().getActionPoints().changeCurrentValue(-(mainWeapon1.switchCost()));
	// Weapon weapon3 = mainWeapon2;
	// mainWeapon2 = mainWeapon1;
	// mainWeapon1 = weapon3;
	return charakter;
    }

    public int getRawAtackDice() {
	return rawAtackDice;
    }

    public CharakterBasicAtackStats setRawAtackDice(int rawAtackDice) {
	this.rawAtackDice = rawAtackDice;
	return this;
    }

    public CharakterBasicAtackStats changeRawAtackDice(int rawAtackDice) {
	this.rawAtackDice = ++rawAtackDice;
	return this;
    }

    public int getModAtackDice() {
	return modAtackDice;
    }

    public CharakterBasicAtackStats setModAtackDice(int modAtackDice) {
	this.modAtackDice = modAtackDice;
	return this;
    }

    public CharakterBasicAtackStats changeModAtackDice(int modAtackDice) {
	this.modAtackDice = ++modAtackDice;
	return this;
    }

    public int getCurAtackModDice() {
	return curAtackModDice;
    }

    public CharakterBasicAtackStats setCurAtackModDice(int curAtackModDice) {
	this.curAtackModDice = curAtackModDice;
	return this;
    }

    public CharakterBasicAtackStats changeCurAtackModDice(int curAtackModDice) {
	this.curAtackModDice = ++curAtackModDice;
	return this;
    }

    public int getRawBonusAtack() {
	return rawBonusAtack;
    }

    public CharakterBasicAtackStats setRawBonusAtack(int rawBonusAtack) {
	this.rawBonusAtack = rawBonusAtack;
	return this;
    }

    public CharakterBasicAtackStats changeRawBonusAtack(int rawBonusAtack) {
	this.rawBonusAtack = ++rawBonusAtack;
	return this;
    }

    public int getModBonusAtack() {
	return modBonusAtack;
    }

    public CharakterBasicAtackStats setModBonusAtack(int modBonusAtack) {
	this.modBonusAtack = modBonusAtack;
	return this;
    }

    public CharakterBasicAtackStats changeModBonusAtack(int modBonusAtack) {
	this.modBonusAtack = ++modBonusAtack;
	return this;
    }

    public int getCurModBonusAtack() {
	return curBonusModAtack;
    }

    public CharakterBasicAtackStats setCurModBonusAtack(int curBonusAtack) {
	this.curBonusModAtack = curBonusAtack;
	return this;
    }

    public CharakterBasicAtackStats changeCurModBonusAtack(int curBonusAtack) {
	this.curBonusModAtack = ++curBonusAtack;
	return this;
    }

    public int getRawDmgDice() {
	return rawDmgDice;
    }

    public CharakterBasicAtackStats setRawDmgDice(int rawDmgDice) {
	this.rawDmgDice = rawDmgDice;
	return this;
    }

    public CharakterBasicAtackStats changeRawDmgDice(int rawDmgDice) {
	this.rawDmgDice = ++rawDmgDice;
	return this;
    }

    public int getModDmgDice() {
	return modDmgDice;
    }

    public CharakterBasicAtackStats setModDmgDice(int modDmgDice) {
	this.modDmgDice = modDmgDice;
	return this;
    }

    public CharakterBasicAtackStats changeModDmgDice(int modDmgDice) {
	this.modDmgDice = ++modDmgDice;
	return this;
    }

    public int getCurDmgModDice() {
	return curDmgModDice;
    }

    public CharakterBasicAtackStats setCurDmgModDice(int curDmgModDice) {
	this.curDmgModDice = curDmgModDice;
	return this;
    }

    public CharakterBasicAtackStats changeCurDmgModDice(int curDmgModDice) {
	this.curDmgModDice = ++curDmgModDice;
	return this;
    }

    public int getRawBonusDmg() {
	return rawBonusDmg;
    }

    public CharakterBasicAtackStats setRawBonusDmg(int rawBonusDmg) {
	this.rawBonusDmg = rawBonusDmg;
	return this;
    }

    public CharakterBasicAtackStats changeRawBonusDmg(int rawBonusDmg) {
	this.rawBonusDmg = ++rawBonusDmg;
	return this;
    }

    public int getModBonusDmg() {
	return modBonusDmg;
    }

    public CharakterBasicAtackStats setModBonusDmg(int modBonusDmg) {
	this.modBonusDmg = modBonusDmg;
	return this;
    }

    public CharakterBasicAtackStats changeModBonusDmg(int modBonusDmg) {
	this.modBonusDmg = ++modBonusDmg;
	return this;
    }

    public int getCurBonusModDmg() {
	return curBonusModDmg;
    }

    public CharakterBasicAtackStats setCurBonusModDmg(int curBonusDmg) {
	this.curBonusModDmg = curBonusDmg;
	return this;
    }

    public CharakterBasicAtackStats changeCurBonusModDmg(int curBonusDmg) {
	this.curBonusModDmg = ++curBonusDmg;
	return this;
    }

}
