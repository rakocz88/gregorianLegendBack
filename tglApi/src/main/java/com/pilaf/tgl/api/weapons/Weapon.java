package com.pilaf.tgl.api.weapons;

import java.util.List;

import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.effect.enums.PhysicalDmgType;
import com.pilaf.tgl.api.effect.enums.WeaponType;

public interface Weapon {

    int atackPointsCosts();

    int switchCost();

    String dmgBonusParameter();

    String atackBonusParameter();

    int dmgBonusValue();

    int dmgDice();

    WeaponType weaponType();

    int weight();

    List<EffectModel> effects();

    PhysicalDmgType physicalDmgType();

}
