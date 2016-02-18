package com.pilaf.tgl.api.weapons;

import java.util.List;

import com.pilaf.tgl.api.charakter.attributes.main.Strength;
import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.effect.enums.PhysicalDmgType;
import com.pilaf.tgl.api.effect.enums.WeaponType;

//TODO MOVE TO WEAPON MODULE
public class LongSword implements Weapon {

    @Override
    public int atackPointsCosts() {
	return 11;
    }

    @Override
    public int switchCost() {
	return 4;
    }

    @Override
    public String dmgBonusParameter() {
	return Strength.class.getSimpleName().toLowerCase();
    }

    @Override
    public int dmgBonusValue() {
	return 4;
    }

    @Override
    public int dmgDice() {
	return 3;
    }

    @Override
    public WeaponType weaponType() {
	return WeaponType.SWORD;
    }

    @Override
    public int weight() {
	return 8;
    }

    @Override
    public List<EffectModel> effects() {
	return null;
    }

    @Override
    public String atackBonusParameter() {
	return Strength.class.getSimpleName().toLowerCase();
    }

    @Override
    public PhysicalDmgType physicalDmgType() {
	return PhysicalDmgType.SLASH;
    }

}
