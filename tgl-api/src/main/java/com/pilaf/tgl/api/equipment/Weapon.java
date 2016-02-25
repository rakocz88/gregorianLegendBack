package com.pilaf.tgl.api.equipment;

import java.util.List;

import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.enums.PhysicalDmgType;
import com.pilaf.tgl.api.enums.WeaponType;

public interface Weapon extends Equipment {

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

    int getDistance();

}
