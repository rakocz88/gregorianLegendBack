package com.pilaf.tgl.api.charakter.resistances;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.attributes.main.Dexterity;
import com.pilaf.tgl.api.enums.Resistances;

public class ElementalsResistance extends Resistance {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public Resistances resistanceType() {
	return Resistances.ELEMENTS;
    }

    @Override
    public String getAttributeModyfier() {
	return Dexterity.class.getSimpleName().toLowerCase();
    }

    @Override
    protected int getArmorResValue(CharakterInCombatBase charakter) {
	return charakter.getCharakterEquipment().getArmor().elementsResistance();
    }

}
