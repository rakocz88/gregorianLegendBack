package com.pilaf.tgl.effect.builder.condition.items;

import java.util.ArrayList;
import java.util.List;

import com.pilaf.tgl.api.effect.templates.ConditionEffect;
import com.pilaf.tgl.api.enums.CreatureType;

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
