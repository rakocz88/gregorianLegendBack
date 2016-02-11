package com.pilaf.test.abilities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pilaf.tgl.abilities.spells.fire.B.FireBall;
import com.pilaf.tgl.abilities.spells.fire.D.BigFireBall;
import com.pilaf.tgl.abilities.spells.fire.D.ChaosBall;
import com.pilaf.tgl.abilities.spells.fire.F.FireBalt;

public class AbilityTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void test() {
	int value = 0;
	int paramValue = 5;
	int iterationLength=100;
	int reduction=4;
	for (int i = 0; i < iterationLength; i++) {
//	    value = value + ChaosBall.initSpell().getActionEffect().returnValue(paramValue);
//	    value = value + BigFireBall.initSpell().getActionEffect().returnValue(paramValue);
//	    value = value + FireBall.initSpell().getActionEffect().returnValue(paramValue);
	    value = value + FireBalt.initSpell().getActionEffect().returnValue(paramValue);
//	    FireBall.initSpell().getActionEffect().takeAction(7);
//	    FireBall.initSpell().getActionEffect().takeAction(15);
	}
	System.out.println((value/iterationLength)/reduction);
//	List<ExampleModel> list = new ArrayList<ExampleModel>();
//	list.add(new ExampleModel(20, "JA"));
//	modifyList(list);
//	System.out.println(list.get(0).name);
    }

    private void modifyList(List<ExampleModel> list) {
	Consumer<ExampleModel> cons = (ExampleModel ex) -> {
	    ex.name = ex.name.concat("a");
	    ex.value--;
	};
	list.stream().forEach(cons);

    }

}
