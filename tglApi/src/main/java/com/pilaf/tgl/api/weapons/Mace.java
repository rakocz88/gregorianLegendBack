package com.pilaf.tgl.api.weapons;

import java.util.List;

import com.pilaf.tgl.api.charakter.attributes.main.Strength;
import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.effect.enums.PhysicalDmgType;
import com.pilaf.tgl.api.effect.enums.WeaponType;

public class Mace implements Weapon {

    @Override
    public int atackPointsCosts() {
	return 12;
    }

    @Override
    public int switchCost() {
	return 5;
    }

    @Override
    public String dmgBonusParameter() {
	return Strength.class.getSimpleName().toLowerCase();
    }

    @Override
    public String atackBonusParameter() {
	return Strength.class.getSimpleName().toLowerCase();
    }

    @Override
    public int dmgBonusValue() {
	return 5;
    }

    @Override
    public int dmgDice() {
	return 2;
    }

    @Override
    public WeaponType weaponType() {
	return WeaponType.MACE;
    }

    @Override
    public int weight() {
	return 12;
    }

    @Override
    public List<EffectModel> effects() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public PhysicalDmgType physicalDmgType() {
	return PhysicalDmgType.CRUSH;
    }

}
