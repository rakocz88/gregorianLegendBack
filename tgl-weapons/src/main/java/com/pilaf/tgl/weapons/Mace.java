package com.pilaf.tgl.weapons;

import java.util.List;

import com.pilaf.tgl.api.charakter.attributes.main.Strength;
import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.enums.PhysicalDmgType;
import com.pilaf.tgl.api.enums.WeaponType;
import com.pilaf.tgl.api.equipment.Weapon;

public class Mace implements Weapon {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public int atackPointsCosts() {
	return 12;
    }

    public int switchCost() {
	return 5;
    }

    public String dmgBonusParameter() {
	return Strength.class.getSimpleName().toLowerCase();
    }

    public String atackBonusParameter() {
	return Strength.class.getSimpleName().toLowerCase();
    }

    public int dmgBonusValue() {
	return 5;
    }

    public int dmgDice() {
	return 2;
    }

    public WeaponType weaponType() {
	return WeaponType.MACE;
    }

    public int weight() {
	return 12;
    }

    public List<EffectModel> effects() {
	return null;
    }

    public PhysicalDmgType physicalDmgType() {
	return PhysicalDmgType.CRUSH;
    }

    @Override
    public int getDistance() {
	return 0;
    }

}
