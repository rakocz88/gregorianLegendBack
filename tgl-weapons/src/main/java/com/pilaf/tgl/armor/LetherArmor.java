package com.pilaf.tgl.armor;

import java.util.HashMap;
import java.util.Map;

import com.pilaf.tgl.api.enums.ActionType;
import com.pilaf.tgl.api.enums.ArmorType;
import com.pilaf.tgl.api.equipment.Armor;

public class LetherArmor implements Armor {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public int weaponResistance() {
	return 1;
    }

    @Override
    public int elementsResistance() {
	return 2;
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
	return 5;
    }

    @Override
    public double speedPanelty() {
	return 1;
    }

    @Override
    public int defencePenelty() {
	return 2;
    }

    @Override
    public Map<ActionType, Integer> actionChangedCost() {
	Map<ActionType, Integer> actionChangedCost = new HashMap<>();
	actionChangedCost.put(ActionType.CAST, 1);
	actionChangedCost.put(ActionType.ENERGY_LOAD, 1);
	return actionChangedCost;
    }

}
