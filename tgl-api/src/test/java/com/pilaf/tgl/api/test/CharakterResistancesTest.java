package com.pilaf.tgl.api.test;

import org.junit.Assert;
import org.junit.Test;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.resistances.CharakterResistances;

public class CharakterResistancesTest {

    @Test
    public void standardResistances() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	CharakterResistances resitances = charakter.getCharakterResistances();

	Assert.assertEquals(4, resitances.getElementalsResistance().getCurrentValue());
	Assert.assertEquals(4, resitances.getEnergyResistance().getCurrentValue());
	Assert.assertEquals(4, resitances.getWeaponResistance().getCurrentValue());
    }

    @Test
    public void resistancesAfterBuf() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterResistances().getWeaponResistance().changeCurrentMod(2);
	charakter.buildChar();
	CharakterResistances resitances = charakter.getCharakterResistances();

	Assert.assertEquals(4, resitances.getElementalsResistance().getCurrentValue());
	Assert.assertEquals(4, resitances.getEnergyResistance().getCurrentValue());
	Assert.assertEquals(6, resitances.getWeaponResistance().getCurrentValue());
    }

    @Test
    public void resistancesAfterDebuf() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterResistances().getWeaponResistance().changeCurrentMod(-2);
	charakter.buildChar();
	CharakterResistances resitances = charakter.getCharakterResistances();

	Assert.assertEquals(4, resitances.getElementalsResistance().getCurrentValue());
	Assert.assertEquals(4, resitances.getEnergyResistance().getCurrentValue());
	Assert.assertEquals(2, resitances.getWeaponResistance().getCurrentValue());
    }

    @Test
    public void resistancesAfterAttrBuf() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterMainParameters().getVitality().changeCurrentMod(4);
	charakter.buildChar();
	CharakterResistances resitances = charakter.getCharakterResistances();

	Assert.assertEquals(4, resitances.getElementalsResistance().getCurrentValue());
	Assert.assertEquals(4, resitances.getEnergyResistance().getCurrentValue());
	Assert.assertEquals(6, resitances.getWeaponResistance().getCurrentValue());
    }

    @Test
    public void resistancesAfterAttrDebuf() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterMainParameters().getVitality().changeCurrentMod(-4);
	charakter.buildChar();
	CharakterResistances resitances = charakter.getCharakterResistances();

	Assert.assertEquals(4, resitances.getElementalsResistance().getCurrentValue());
	Assert.assertEquals(4, resitances.getEnergyResistance().getCurrentValue());
	Assert.assertEquals(2, resitances.getWeaponResistance().getCurrentValue());
    }

}
