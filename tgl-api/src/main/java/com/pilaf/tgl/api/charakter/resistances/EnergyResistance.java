package com.pilaf.tgl.api.charakter.resistances;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.attributes.main.Wisdom;
import com.pilaf.tgl.api.enums.Resistances;

public class EnergyResistance extends Resistance {

    @Override
    public Resistances resistanceType() {
	return Resistances.ENERGY;
    }

    @Override
    public String getAttributeModyfier() {
	return Wisdom.class.getSimpleName().toLowerCase();
    }

    @Override
    protected int getArmorResValue(CharakterInCombatBase charakter) {
	return charakter.getCharakterEquipment().getArmor().energyResistance();
    }

}
