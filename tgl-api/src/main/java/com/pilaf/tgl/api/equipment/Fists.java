package com.pilaf.tgl.api.equipment;

import java.util.List;

import com.pilaf.tgl.api.charakter.attributes.main.Strength;
import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.enums.PhysicalDmgType;
import com.pilaf.tgl.api.enums.WeaponType;

public class Fists implements Weapon {

    public int atackPointsCosts() {
	return 8;
    }

    public int switchCost() {
	return 1;
    }

    public String dmgBonusParameter() {
	return Strength.class.getSimpleName().toLowerCase();
    }

    public int dmgBonusValue() {
	return 2;
    }

    public int dmgDice() {
	return 1;
    }

    public WeaponType weaponType() {
	return WeaponType.FISTS;
    }

    public int weight() {
	return 0;
    }

    public List<EffectModel> effects() {
	return null;
    }

    public String atackBonusParameter() {
	return Strength.class.getSimpleName().toLowerCase();
    }

    public PhysicalDmgType physicalDmgType() {
	return PhysicalDmgType.CRUSH;
    }

    @Override
    public int getDistance() {
	return 0;
    }

}
