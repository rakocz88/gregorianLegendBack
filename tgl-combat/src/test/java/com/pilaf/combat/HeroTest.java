package com.pilaf.combat;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pilaf.tgl.abilities.atacks.PowerAtack;
import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.action.ActiveAction;
import com.pilaf.tgl.armor.HeavyLetherArmor;
import com.pilaf.tgl.weapons.LongSword;
import com.pilaf.tgl.weapons.Mace;

public class HeroTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void test() {
	long begin = System.currentTimeMillis();
	CharakterInCombatBase hero = new CharakterInCombatBase();
	hero.setCharName("Hero");
	hero.getCharakterMainParameters().getDexterity().setModValue(+3);
	hero.getCharakterDefences().getCharakterDodgeParam().setDodgeMod(3);
	hero.getCharakterBasicAtacksStats().changeModBonusAtack(6);
	hero.buildChar();
	hero.getCharakterMainParameters().getVitality().changeCurrentMod(+2);
	hero.buildChar();
	hero.getCharakterEquipment().setMainWeapon1(new LongSword());
	hero.getCharakterEquipment().setArmor(new HeavyLetherArmor());
	hero.buildChar();
	CharakterInCombatBase dobo = new CharakterInCombatBase();
	dobo.getCharakterMainParameters().getStrength().setRawValue(9);
	dobo.getCharakterMainParameters().getVitality().setRawValue(7);
	dobo.getCharakterMainParameters().getWisdom().setRawValue(5);
	dobo.getCharakterMainParameters().getKnowledge().setRawValue(2);
	dobo.getCharakterMainParameters().getPersonality().setRawValue(1);
	dobo.getCharakterMainParameters().getDexterity().setRawValue(2);
	dobo.getCharakterEquipment().setMainWeapon1(new Mace());
	dobo.getCharakterBasicAtacksStats().changeModBonusAtack(10);
	dobo.buildChar();

	dobo.setCharName("Dobo");
	dobo.getCharakterActiveActions().addToActionList(new PowerAtack());
	// BONUSES
	dobo.getCharakterResistances().getElementalsResistance().changeRawValue(1);
	while (dobo.getCharakterPoints().getHealth().getCurrentValue() > 0
		&& hero.getCharakterPoints().getHealth().getCurrentValue() > 0) {
	    dobo.getCharakterPoints().getActionPoints().initPoints(dobo);
	    hero.getCharakterPoints().getActionPoints().initPoints(hero);
	    hero.buildChar();
	    dobo.buildChar();

	    for (int i = 24; i > 0; i--) {
		if (dobo.getCharakterPoints().getActionPoints().getCurrentValue() >= i) {
		    ActiveAction activeAction = dobo.getCharakterActiveActions().getAvailableActions().get(0);
		    if (dobo.getCharakterActiveActions().getAvailableActions().size() == 3) {
			activeAction = dobo.getCharakterActiveActions().getAvailableActions().get(2);
		    }
		    activeAction.invokeAction(dobo, hero);

		    if (hero.getCharakterPoints().getHealth().getCurrentValue() < 1) {
			System.out.println(" Hero dies ");
			// return;
		    }
		}
		if (hero.getCharakterPoints().getActionPoints().getCurrentValue() >= i) {
		    ActiveAction activeAction = hero.getCharakterActiveActions().getAvailableActions().get(0);
		    activeAction.invokeAction(hero, dobo);
		    if (dobo.getCharakterPoints().getHealth().getCurrentValue() < 1) {
			System.out.println(" Dobo dies ");
			// return;
		    }
		}
	    }
	}
	long end = System.currentTimeMillis();
	System.out.println("TIME " + (end - begin));
    }

}
