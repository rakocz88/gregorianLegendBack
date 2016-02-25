package com.pilaf.tgl.api.equipment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pilaf.tgl.api.abilities.statics.StaticAbility;
import com.pilaf.tgl.api.charakter.action.ActiveAction;
import com.pilaf.tgl.api.charakter.resistances.Resistance;
import com.pilaf.tgl.api.enums.ActionType;
import com.pilaf.tgl.api.enums.ArmorType;

public interface Armor extends Equipment {

    int weaponResistance();

    int elementsResistance();

    int energyResistance();

    ArmorType armorType();

    double weight();

    default Map<Resistance, Integer> additionalResistances() {
	return new HashMap<>();
    }

    default List<StaticAbility> staticAbilities() {
	return null;
    }

    default List<ActiveAction> activeActions() {
	return null;
    }

    Map<ActionType, Integer> actionChangedCost();

    double speedPanelty();

    int defencePenelty();

}
