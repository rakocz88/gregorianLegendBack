package com.pilaf.tgl.api.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.speed.SpeedCalculator;

public class CharakterSpeedTest {

    static final int RUN_UNITS_AMOUNT = 10;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void standardCharakterSpeedTest() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	int speedStart = charakter.getCharakterOtherFields().getCharakterSpeed().getCurrentValue();
	int maxSPeed = SpeedCalculator.getMaxSpeed(charakter);
	int actionCostForTenUnits = SpeedCalculator.getActionCost(charakter, RUN_UNITS_AMOUNT);
	Assert.assertEquals(10, speedStart);
	Assert.assertEquals(8, maxSPeed);
	Assert.assertEquals(15, actionCostForTenUnits);

	charakter.getCharakterOtherFields().getCharakterSpeed().changeSpeedMod(2);
	charakter.buildChar();
    }

    @Test
    public void modyfiedSpeedCharakterSpeedTest() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterOtherFields().getCharakterSpeed().changeSpeedMod(2);
	int speedStart = charakter.getCharakterOtherFields().getCharakterSpeed().getCurrentValue();
	int maxSPeed = SpeedCalculator.getMaxSpeed(charakter);
	int actionCostForTenUnits = SpeedCalculator.getActionCost(charakter, RUN_UNITS_AMOUNT);
	Assert.assertEquals(12, speedStart);
	Assert.assertEquals(9, maxSPeed);
	Assert.assertEquals(14, actionCostForTenUnits);
    }

    @Test
    public void strongModyfiedSpeedCharakterSpeedTest() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterOtherFields().getCharakterSpeed().changeSpeedCurMod(10);
	int speedStart = charakter.getCharakterOtherFields().getCharakterSpeed().getCurrentValue();
	int maxSPeed = SpeedCalculator.getMaxSpeed(charakter);
	int actionCostForTenUnits = SpeedCalculator.getActionCost(charakter, RUN_UNITS_AMOUNT);
	Assert.assertEquals(20, speedStart);
	Assert.assertEquals(13, maxSPeed);
	Assert.assertEquals(10, actionCostForTenUnits);
    }

    @Test
    public void superModyfiedSpeedCharakterSpeedTest() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterOtherFields().getCharakterSpeed().changeSpeedCurMod(20);
	int speedStart = charakter.getCharakterOtherFields().getCharakterSpeed().getCurrentValue();
	int maxSPeed = SpeedCalculator.getMaxSpeed(charakter);
	int actionCostForTenUnits = SpeedCalculator.getActionCost(charakter, RUN_UNITS_AMOUNT);
	Assert.assertEquals(30, speedStart);
	Assert.assertEquals(18, maxSPeed);
	Assert.assertEquals(4, actionCostForTenUnits);
    }

    @Test
    public void modyfiedDexCharakterSpeedTest() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterMainParameters().getDexterity().changeCurrentMod(1);
	charakter.buildChar();
	int speedStart = charakter.getCharakterOtherFields().getCharakterSpeed().getCurrentValue();
	int maxSPeed = SpeedCalculator.getMaxSpeed(charakter);
	int actionCostForTenUnits = SpeedCalculator.getActionCost(charakter, RUN_UNITS_AMOUNT);
	Assert.assertEquals(12, speedStart);
	Assert.assertEquals(9, maxSPeed);
	Assert.assertEquals(14, actionCostForTenUnits);
    }

    @Test
    public void charakterReducedSpeed() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterMainParameters().getDexterity().changeCurrentMod(-5);
	charakter.buildChar();
	int speedStart = charakter.getCharakterOtherFields().getCharakterSpeed().getCurrentValue();
	int maxSPeed = SpeedCalculator.getMaxSpeed(charakter);
	int actionCostForTenUnits = SpeedCalculator.getActionCost(charakter, RUN_UNITS_AMOUNT);
	Assert.assertEquals(0, speedStart);
	Assert.assertEquals(0, maxSPeed);
	Assert.assertEquals(20, actionCostForTenUnits);
    }

}
