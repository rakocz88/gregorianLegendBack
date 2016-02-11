package com.pilaf.tgl.effect.builder.condition.items;

import java.util.ArrayList;
import java.util.List;

import com.pilaf.tgl.effect.builder.enums.CreatureType;
import com.pilaf.tgl.effect.builder.templates.ConditionEffect;

public class CreatureCondition implements ConditionEffect {

    private final List<CreatureType> creatureTypeList;

    private CreatureCondition(CreatureConditionBuilder builder) {
	this.creatureTypeList = builder.creatureTypeList;
    }

    public List<CreatureType> getCreatureTypeList() {
	return creatureTypeList;
    }

    public static class CreatureConditionBuilder {
	List<CreatureType> creatureTypeList = new ArrayList<CreatureType>();

	public CreatureConditionBuilder creatureTypeList(CreatureType creatureType) {
	    this.creatureTypeList.add(creatureType);
	    return this;
	}

	public CreatureCondition build() {
	    return new CreatureCondition(this);
	}
    }
}
