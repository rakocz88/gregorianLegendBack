package com.pilaf.tgl.api.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;

public class MainAtacksTest {

    @Test
    public void basticActionCountTest() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	int actionCount = charakter.getCharakterActiveActions().getActionList().size();
	Assert.assertEquals(3, actionCount);
    }

    @Test
    public void addedActionCountTest() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterActiveActions().setActionList(new ArrayList<>());

	int actionCount = charakter.getCharakterActiveActions().getActionList().size();
	Assert.assertEquals(0, actionCount);
    }

}
