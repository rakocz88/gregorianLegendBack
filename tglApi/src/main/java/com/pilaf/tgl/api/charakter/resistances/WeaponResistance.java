package com.pilaf.tgl.api.charakter.resistances;

import com.pilaf.tgl.api.charakter.attributes.main.Vitality;
import com.pilaf.tgl.api.effect.enums.Resistances;

public class WeaponResistance extends Resistance {

    @Override
    public Resistances resistanceType() {
	return Resistances.WEAPON;
    }

    @Override
    public String getAttributeModyfier() {
	return Vitality.class.getSimpleName().toLowerCase();
    }

}
