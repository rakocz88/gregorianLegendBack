package com.pilaf.tgl.armor;

import java.util.HashMap;
import java.util.Map;

import com.pilaf.tgl.api.enums.ActionType;
import com.pilaf.tgl.api.enums.ArmorType;
import com.pilaf.tgl.api.equipment.Armor;

public class HeavyLetherArmor implements Armor {

    @Override
    public int weaponResistance() {
	return 2;
    }

    @Override
    public int elementsResistance() {
	return 3;
    }

    @Override
    public int energyResistance() {
	return 0;
    }

    @Override
    public ArmorType armorType() {
	return ArmorType.LEATHER;
    }

    @Override
    public double weight() {
	return 15;
    }

    @Override
    public double speedPanelty() {
	return 2;
    }

    @Override
    public int defencePenelty() {
	return 3;
    }

    @Override
    public Map<ActionType, Integer> actionChangedCost() {
	Map<ActionType, Integer> actionChangedCost = new HashMap<>();
	actionChangedCost.put(ActionType.CAST, 2);
	actionChangedCost.put(ActionType.ENERGY_LOAD, 2);
	actionChangedCost.put(ActionType.MALE_ATACK, 1);
	actionChangedCost.put(ActionType.RANGE_ATACK, 1);
	return actionChangedCost;
    }

}
