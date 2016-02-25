package com.pilaf.tgl.api.test;

import org.junit.Assert;
import org.junit.Test;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.attributes.defthrows.CharakterDefenceThrows;

public class DefenceThrowsTest {

    @Test
    public void standardDefenceThrows() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	CharakterDefenceThrows defenceThrows = charakter.getCharakterDefenceThrows();
	Assert.assertEquals(20, defenceThrows.getCharisma().getValue());
	Assert.assertEquals(20, defenceThrows.getEndurance().getValue());
	Assert.assertEquals(20, defenceThrows.getReflex().getValue());
    }

    @Test
    public void buffedDefenceThrows() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterDefenceThrows().setReflexMod(2);
	CharakterDefenceThrows defenceThrows = charakter.getCharakterDefenceThrows();
	charakter.buildChar();
	Assert.assertEquals(20, defenceThrows.getCharisma().getValue());
	Assert.assertEquals(20, defenceThrows.getEndurance().getValue());
	Assert.assertEquals(22, defenceThrows.getReflex().getValue());
    }

    @Test
    public void debufedDefenceThrows() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterDefenceThrows().setReflexMod(-2);
	CharakterDefenceThrows defenceThrows = charakter.getCharakterDefenceThrows();
	charakter.buildChar();
	Assert.assertEquals(20, defenceThrows.getCharisma().getValue());
	Assert.assertEquals(20, defenceThrows.getEndurance().getValue());
	Assert.assertEquals(18, defenceThrows.getReflex().getValue());
    }

    @Test
    public void bufedAttributeDefenceThrows() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterMainParameters().getDexterity().changeCurrentMod(2);
	CharakterDefenceThrows defenceThrows = charakter.getCharakterDefenceThrows();
	charakter.buildChar();
	Assert.assertEquals(20, defenceThrows.getCharisma().getValue());
	Assert.assertEquals(20, defenceThrows.getEndurance().getValue());
	Assert.assertEquals(24, defenceThrows.getReflex().getValue());
    }

    @Test
    public void debufedAttributeDefenceThrows() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	charakter.getCharakterMainParameters().getDexterity().changeCurrentMod(-2);
	CharakterDefenceThrows defenceThrows = charakter.getCharakterDefenceThrows();
	charakter.buildChar();
	Assert.assertEquals(20, defenceThrows.getCharisma().getValue());
	Assert.assertEquals(20, defenceThrows.getEndurance().getValue());
	Assert.assertEquals(16, defenceThrows.getReflex().getValue());
    }

}
