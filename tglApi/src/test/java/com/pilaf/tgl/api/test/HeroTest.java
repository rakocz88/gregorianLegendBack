package com.pilaf.tgl.api.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.weapons.LongSword;
import com.pilaf.tgl.api.weapons.Mace;

public class HeroTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void test() {
	CharakterInCombatBase hero = new CharakterInCombatBase();
	hero.setCharName("Hero");
	hero.getCharakterMainParameters().getDexterity().setModValue(+3);
	hero.getCharakterDefences().setDodgeMod(5);
	hero.getCharakterBasicAtacks().changeModBonusAtack(6);
	hero.buildChar();
	hero.getCharakterMainParameters().getVitality().changeCurrentMod(+2);
	hero.buildChar();
	hero.getCharakterBasicAtacks().setMainWeapon1(new LongSword());
	hero.buildChar();
	CharakterInCombatBase dobo = new CharakterInCombatBase();
	dobo.getCharakterMainParameters().getStrength().setRawValue(9);
	dobo.getCharakterMainParameters().getVitality().setRawValue(7);
	dobo.getCharakterMainParameters().getWisdom().setRawValue(5);
	dobo.getCharakterMainParameters().getKnowledge().setRawValue(2);
	dobo.getCharakterMainParameters().getPersonality().setRawValue(1);
	dobo.getCharakterMainParameters().getDexterity().setRawValue(2);
	dobo.getCharakterBasicAtacks().setMainWeapon1(new Mace());
	dobo.getCharakterBasicAtacks().changeModBonusAtack(10);
	dobo.buildChar();

	dobo.setCharName("Dobo");
	// BONUSES
	dobo.getCharakterResistances().getElementalsResistance().changeRawValue(1);
	while (dobo.getCharakterPoints().getHealth().getCurrentValue() > 0
		&& hero.getCharakterPoints().getHealth().getCurrentValue() > 0) {
	    dobo.getCharakterPoints().getActionPoints().initPoints(dobo);
	    hero.getCharakterPoints().getActionPoints().initPoints(hero);
	    for (int i = 24; i > 0; i--) {
		if (dobo.getCharakterPoints().getActionPoints().getCurrentValue() >= i) {
		    dobo.getCharakterBasicAtacks().atack(dobo, hero);
		}
		if (hero.getCharakterPoints().getActionPoints().getCurrentValue() >= i) {
		    hero.getCharakterBasicAtacks().atack(hero, dobo);
		}
	    }
	}
	System.out.println(" Somebody died");
	// int heroStrength =
	// hero.getCharakterMainParameters().getStrength().getValue();
	// int heroVitality =
	// hero.getCharakterMainParameters().getVitality().getValue();
	// int enduranceDF =
	// hero.getCharakterDefenceThrows().getEndurance().value;
	// hero.getCharakterDefenceThrows().
    }

}
