package com.pilaf.test.abilities;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pilaf.tgl.abilities.spells.fire.F.FireBolt;
import com.pilaf.tgl.api.charakter.CharakterInCombatBase;

public class AbilityTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void test() {

	CharakterInCombatBase char1 = new CharakterInCombatBase.CharakterCombatBaseBuilder().build();
	CharakterInCombatBase char2 = new CharakterInCombatBase.CharakterCombatBaseBuilder().build();
	char1.getCharakterMainParameters().getStrength().getValue();
	int value = 0;
	int paramValue = 5;
	int iterationLength = 100;
	int reduction = 4;
	for (int i = 0; i < iterationLength; i++) {
	    // value = value +
	    // ChaosBall.initSpell().getActionEffect().returnValue(paramValue);
	    // value = value +
	    // BigFireBall.initSpell().getActionEffect().returnValue(paramValue);
	    // value = value +
	    // FireBall.initSpell().getActionEffect().returnValue(paramValue);
	    value = value + FireBolt.getEffect1().getActionEffect().returnValue(paramValue);
	    // FireBall.initSpell().getActionEffect().takeAction(7);
	    // FireBall.initSpell().getActionEffect().takeAction(15);
	}
	System.out.println((value / iterationLength) / reduction);
	// List<ExampleModel> list = new ArrayList<ExampleModel>();
	// list.add(new ExampleModel(20, "JA"));
	// modifyList(list);
	// System.out.println(list.get(0).name);
    }

}
