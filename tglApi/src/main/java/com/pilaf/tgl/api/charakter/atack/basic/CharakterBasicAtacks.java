package com.pilaf.tgl.api.charakter.atack.basic;

import java.lang.reflect.Field;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.attributes.main.MainAttribute;
import com.pilaf.tgl.api.charakter.builders.CharakterMainParameters;
import com.pilaf.tgl.api.weapons.Fists;
import com.pilaf.tgl.api.weapons.Weapon;
import com.pilaf.tgl.commons.random.RandomCreator;

public class CharakterBasicAtacks {
    private static final int BONUS_ATACK_DICE = 1;
    private Weapon mainWeapon1 = new Fists();
    private Weapon offHand1;
    private Weapon mainWeapon2 = new Fists();
    private Weapon offHand2;

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

    public CharakterBasicAtacks buildAtack(CharakterInCombatBase charakter) {
	String decAttributeName = getMainWeapon1().atackBonusParameter();
	Field mainAttrField;
	try {
	    mainAttrField = CharakterMainParameters.class.getDeclaredField(decAttributeName);
	    mainAttrField.setAccessible(true);
	    MainAttribute atr = (MainAttribute) mainAttrField.get(charakter.getCharakterMainParameters());
	    int atackValue = atr.getCurrentValue();
	    setRawAtackDice(BONUS_ATACK_DICE + (atackValue / 2));
	    setRawDmgDice(getMainWeapon1().dmgDice());
	    String weaponDmgAtr = getMainWeapon1().dmgBonusParameter();
	    Field mainDmgAttrField = CharakterMainParameters.class.getDeclaredField(weaponDmgAtr);
	    mainDmgAttrField.setAccessible(true);
	    MainAttribute atrDmg = (MainAttribute) mainDmgAttrField.get(charakter.getCharakterMainParameters());
	    int atrDmgValue = atrDmg.getCurrentValue();
	    int weaponDmgBonus = getMainWeapon1().dmgBonusValue();
	    setRawBonusDmg(atrDmgValue * weaponDmgBonus);

	} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return this;
    }

    public CharakterBasicAtacks initAtack(CharakterInCombatBase charakter) {
	String decAttributeName = getMainWeapon1().atackBonusParameter();
	Field mainAttrField;
	try {
	    mainAttrField = CharakterMainParameters.class.getDeclaredField(decAttributeName);
	    mainAttrField.setAccessible(true);
	    MainAttribute atr = (MainAttribute) mainAttrField.get(charakter.getCharakterMainParameters());
	    int atackValue = atr.getCurrentValue();
	    setRawAtackDice(BONUS_ATACK_DICE + (atackValue / 2));
	    setRawDmgDice(getMainWeapon1().dmgDice());
	    String weaponDmgAtr = getMainWeapon1().dmgBonusParameter();
	    Field mainDmgAttrField = CharakterMainParameters.class.getDeclaredField(weaponDmgAtr);
	    mainDmgAttrField.setAccessible(true);
	    MainAttribute atrDmg = (MainAttribute) mainDmgAttrField.get(charakter.getCharakterMainParameters());
	    int atrDmgValue = atrDmg.getCurrentValue();
	    int weaponDmgBonus = getMainWeapon1().dmgBonusValue();
	    setRawBonusDmg(atrDmgValue * weaponDmgBonus);
	} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return this;
    }

    public CharakterInCombatBase atack(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	atacker.getCharakterPoints().getActionPoints()
		.changeCurrentValue(-(atacker.getCharakterBasicAtacks().getMainWeapon1().atackPointsCosts()));
	int atackValue = RandomCreator.rollDiceNumber(atacker.getCharakterBasicAtacks().getCurrentAtackDice());
	atackValue = atackValue + atacker.getCharakterBasicAtacks().getCurrentBonusAtack();
	if (atackValue > target.getCharakterDefences().getDodgeCurrentValue()) {
	    System.out.println(atacker.getCharName() + " hits " + target.getCharName());
	    dealDmg(atacker, target);
	}
	return atacker;
    }

    private void dealDmg(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	int resistance = target.getCharakterResistances().getWeaponResistance().getCurrentValue();
	int dmgRolls = atacker.getCharakterBasicAtacks().getCurrentDmgDice();
	int dmgModyfier = atacker.getCharakterBasicAtacks().getCurrentBonusDmg();
	int dmgDealt = (RandomCreator.rollDiceNumber(dmgRolls) + dmgModyfier) / resistance;
	System.out.println(atacker.getCharName() + " deals " + dmgDealt
		+ atacker.getCharakterBasicAtacks().getMainWeapon1().physicalDmgType() + " to " + target.getCharName());
	target.getCharakterPoints().getHealth().changeCurrentValue(-(dmgDealt));
	if (target.getCharakterPoints().getHealth().getCurrentValue() <= 0) {
	    System.out.println(target.getCharName() + " is DEAD");
	}

    }

    public CharakterInCombatBase changeWeapon(CharakterInCombatBase charakter) {
	charakter.getCharakterPoints().getActionPoints().changeCurrentValue(-(mainWeapon1.switchCost()));
	Weapon weapon3 = mainWeapon2;
	mainWeapon2 = mainWeapon1;
	mainWeapon1 = weapon3;
	return charakter;
    }

    public Weapon getMainWeapon1() {
	return mainWeapon1;
    }

    public CharakterBasicAtacks setMainWeapon1(Weapon mainWeapon1) {
	this.mainWeapon1 = mainWeapon1;
	return this;
    }

    public Weapon getOffHand1() {
	return offHand1;
    }

    public CharakterBasicAtacks setOffHand1(Weapon offHand1) {
	this.offHand1 = offHand1;
	return this;
    }

    public Weapon getMainWeapon2() {
	return mainWeapon2;
    }

    public CharakterBasicAtacks setMainWeapon2(Weapon mainWeapon2) {
	this.mainWeapon2 = mainWeapon2;
	return this;
    }

    public Weapon getOffHand2() {
	return offHand2;
    }

    public CharakterBasicAtacks setOffHand2(Weapon offHand2) {
	this.offHand2 = offHand2;
	return this;
    }

    public int getRawAtackDice() {
	return rawAtackDice;
    }

    public CharakterBasicAtacks setRawAtackDice(int rawAtackDice) {
	this.rawAtackDice = rawAtackDice;
	return this;
    }

    public CharakterBasicAtacks changeRawAtackDice(int rawAtackDice) {
	this.rawAtackDice = ++rawAtackDice;
	return this;
    }

    public int getModAtackDice() {
	return modAtackDice;
    }

    public CharakterBasicAtacks setModAtackDice(int modAtackDice) {
	this.modAtackDice = modAtackDice;
	return this;
    }

    public CharakterBasicAtacks changeModAtackDice(int modAtackDice) {
	this.modAtackDice = ++modAtackDice;
	return this;
    }

    public int getCurAtackModDice() {
	return curAtackModDice;
    }

    public CharakterBasicAtacks setCurAtackModDice(int curAtackModDice) {
	this.curAtackModDice = curAtackModDice;
	return this;
    }

    public CharakterBasicAtacks changeCurAtackModDice(int curAtackModDice) {
	this.curAtackModDice = ++curAtackModDice;
	return this;
    }

    public int getRawBonusAtack() {
	return rawBonusAtack;
    }

    public CharakterBasicAtacks setRawBonusAtack(int rawBonusAtack) {
	this.rawBonusAtack = rawBonusAtack;
	return this;
    }

    public CharakterBasicAtacks changeRawBonusAtack(int rawBonusAtack) {
	this.rawBonusAtack = ++rawBonusAtack;
	return this;
    }

    public int getModBonusAtack() {
	return modBonusAtack;
    }

    public CharakterBasicAtacks setModBonusAtack(int modBonusAtack) {
	this.modBonusAtack = modBonusAtack;
	return this;
    }

    public CharakterBasicAtacks changeModBonusAtack(int modBonusAtack) {
	this.modBonusAtack = ++modBonusAtack;
	return this;
    }

    public int getCurModBonusAtack() {
	return curBonusModAtack;
    }

    public CharakterBasicAtacks setCurModBonusAtack(int curBonusAtack) {
	this.curBonusModAtack = curBonusAtack;
	return this;
    }

    public CharakterBasicAtacks changeCurModBonusAtack(int curBonusAtack) {
	this.curBonusModAtack = ++curBonusAtack;
	return this;
    }

    public int getRawDmgDice() {
	return rawDmgDice;
    }

    public CharakterBasicAtacks setRawDmgDice(int rawDmgDice) {
	this.rawDmgDice = rawDmgDice;
	return this;
    }

    public CharakterBasicAtacks changeRawDmgDice(int rawDmgDice) {
	this.rawDmgDice = ++rawDmgDice;
	return this;
    }

    public int getModDmgDice() {
	return modDmgDice;
    }

    public CharakterBasicAtacks setModDmgDice(int modDmgDice) {
	this.modDmgDice = modDmgDice;
	return this;
    }

    public CharakterBasicAtacks changeModDmgDice(int modDmgDice) {
	this.modDmgDice = ++modDmgDice;
	return this;
    }

    public int getCurDmgModDice() {
	return curDmgModDice;
    }

    public CharakterBasicAtacks setCurDmgModDice(int curDmgModDice) {
	this.curDmgModDice = curDmgModDice;
	return this;
    }

    public CharakterBasicAtacks changeCurDmgModDice(int curDmgModDice) {
	this.curDmgModDice = ++curDmgModDice;
	return this;
    }

    public int getRawBonusDmg() {
	return rawBonusDmg;
    }

    public CharakterBasicAtacks setRawBonusDmg(int rawBonusDmg) {
	this.rawBonusDmg = rawBonusDmg;
	return this;
    }

    public CharakterBasicAtacks changeRawBonusDmg(int rawBonusDmg) {
	this.rawBonusDmg = ++rawBonusDmg;
	return this;
    }

    public int getModBonusDmg() {
	return modBonusDmg;
    }

    public CharakterBasicAtacks setModBonusDmg(int modBonusDmg) {
	this.modBonusDmg = modBonusDmg;
	return this;
    }

    public CharakterBasicAtacks changeModBonusDmg(int modBonusDmg) {
	this.modBonusDmg = ++modBonusDmg;
	return this;
    }

    public int getCurBonusModDmg() {
	return curBonusModDmg;
    }

    public CharakterBasicAtacks setCurBonusModDmg(int curBonusDmg) {
	this.curBonusModDmg = curBonusDmg;
	return this;
    }

    public CharakterBasicAtacks changeCurBonusModDmg(int curBonusDmg) {
	this.curBonusModDmg = ++curBonusDmg;
	return this;
    }

}
