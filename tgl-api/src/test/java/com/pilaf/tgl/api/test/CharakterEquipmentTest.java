package com.pilaf.tgl.api.test;

import org.junit.Assert;
import org.junit.Test;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.enums.PhysicalDmgType;
import com.pilaf.tgl.api.equipment.Weapon;

public class CharakterEquipmentTest {

    @Test
    public void standardWeaponTest() {
	CharakterInCombatBase charakter = new CharakterInCombatBase();
	Weapon mainWeapon = charakter.getCharakterEquipment().getMainWeapon1();
	Assert.assertEquals(1, mainWeapon.dmgDice());
	Assert.assertEquals(PhysicalDmgType.CRUSH, mainWeapon.physicalDmgType());
	Assert.assertEquals(2, mainWeapon.dmgBonusValue());
    }

}
