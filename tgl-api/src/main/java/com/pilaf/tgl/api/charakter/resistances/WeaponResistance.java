package com.pilaf.tgl.api.charakter.resistances;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.attributes.main.Vitality;
import com.pilaf.tgl.api.enums.Resistances;

public class WeaponResistance extends Resistance {

    @Override
    public Resistances resistanceType() {
	return Resistances.WEAPON;
    }

    @Override
    public String getAttributeModyfier() {
	return Vitality.class.getSimpleName().toLowerCase();
    }

    @Override
    protected int getArmorResValue(CharakterInCombatBase charakter) {
	return charakter.getCharakterEquipment().getArmor().weaponResistance();
    }

}
