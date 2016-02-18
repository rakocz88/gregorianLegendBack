package com.pilaf.tgl.api.charakter.resistances;

import com.pilaf.tgl.api.charakter.attributes.main.Dexterity;
import com.pilaf.tgl.api.effect.enums.Resistances;

public class ElementalsResistance extends Resistance {

    @Override
    public Resistances resistanceType() {
	return Resistances.ELEMENTS;
    }

    @Override
    public String getAttributeModyfier() {
	return Dexterity.class.getSimpleName().toLowerCase();
    }

}
