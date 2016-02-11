package com.pilaf.tgl.effect.builder.action.items;

import com.pilaf.tgl.effect.builder.enums.PhysicalDmgType;
import com.pilaf.tgl.effect.builder.templates.ActionEffect;

public class PhysicalDmg implements ActionEffect {

    private final PhysicalDmgType physicalDmgType;

    private final int physicalDmgDice;

    private final int physicalDmgModifier;
    private final int fixedBonusValue;

    private PhysicalDmg(PhysicalDmgBuilder builder) {
	this.physicalDmgType = builder.physicalDmgType;
	this.physicalDmgDice = builder.physicalDmgDice;
	this.physicalDmgModifier = builder.physicalDmgModifier;
	this.fixedBonusValue = builder.fixedBonusValue;
    }

    public PhysicalDmgType getPhysicalDmgType() {
	return physicalDmgType;
    }

    public int getPhysicalDmgDice() {
	return physicalDmgDice;
    }

    public int getPhysicalDmgModifier() {
	return physicalDmgModifier;
    }

    public int getFixedBonusValue() {
	return fixedBonusValue;
    }

    public static class PhysicalDmgBuilder {
	PhysicalDmgType physicalDmgType;
	int physicalDmgDice;
	int physicalDmgModifier;
	int fixedBonusValue;

	public PhysicalDmgBuilder physicalDmgType(PhysicalDmgType physicalDmgType) {
	    this.physicalDmgType = physicalDmgType;
	    return this;
	}

	public PhysicalDmgBuilder physicalDmgDice(int physicalDmgDice) {
	    this.physicalDmgDice = physicalDmgDice;
	    return this;
	}

	public PhysicalDmgBuilder physicalDmgModifier(int physicalDmgModifier) {
	    this.physicalDmgModifier = physicalDmgModifier;
	    return this;
	}

	public PhysicalDmgBuilder fixedBonusValue(int fixedBonusValue) {
	    this.fixedBonusValue = fixedBonusValue;
	    return this;
	}

	public PhysicalDmg build() {
	    return new PhysicalDmg(this);
	}

    }

}
