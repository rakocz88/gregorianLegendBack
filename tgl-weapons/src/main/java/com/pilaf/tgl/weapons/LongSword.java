package com.pilaf.tgl.weapons;

import java.util.List;

import com.pilaf.tgl.api.charakter.attributes.main.Strength;
import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.enums.PhysicalDmgType;
import com.pilaf.tgl.api.enums.WeaponType;
import com.pilaf.tgl.api.equipment.Weapon;

public class LongSword implements Weapon {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public int atackPointsCosts() {
	return 11;
    }

    public int switchCost() {
	return 4;
    }

    public String dmgBonusParameter() {
	return Strength.class.getSimpleName().toLowerCase();
    }

    public int dmgBonusValue() {
	return 4;
    }

    public int dmgDice() {
	return 3;
    }

    public WeaponType weaponType() {
	return WeaponType.SWORD;
    }

    public int weight() {
	return 8;
    }

    public List<EffectModel> effects() {
	return null;
    }

    public String atackBonusParameter() {
	return Strength.class.getSimpleName().toLowerCase();
    }

    public PhysicalDmgType physicalDmgType() {
	return PhysicalDmgType.SLASH;
    }

    @Override
    public int getDistance() {
	return 0;
    }

}
