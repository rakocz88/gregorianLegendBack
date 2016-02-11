package com.pilaf.tgl.effect.builder.action.items;

import com.pilaf.tgl.effect.builder.enums.MagicalDmgType;
import com.pilaf.tgl.effect.builder.templates.ActionEffect;

public class MagicalDmg implements ActionEffect {

    private final MagicalDmgType magicalDmgType;

    private final int magicalDmgDice;

    private final int magicalDmgModyfier;
    private final int fixedBonusValue;

    private MagicalDmg(MagicDmgBuilder builder) {
	this.magicalDmgType = builder.magicalDmgType;
	this.magicalDmgDice = builder.magicalDmgDice;
	this.magicalDmgModyfier = builder.magicalDmgModyfier;
	this.fixedBonusValue = builder.fixedBonusValue;
    }

    public MagicalDmgType getMagicalDmgType() {
	return magicalDmgType;
    }

    public int getMagicalDmgDice() {
	return magicalDmgDice;
    }

    public int getMagicalDmgModyfier() {
	return magicalDmgModyfier;
    }

    public int getFixedBonusValue() {
	return fixedBonusValue;
    }

    public static class MagicDmgBuilder {
	MagicalDmgType magicalDmgType;
	int magicalDmgDice;
	int magicalDmgModyfier;
	int fixedBonusValue;

	public MagicDmgBuilder magicalDmgType(MagicalDmgType magicalDmgType) {
	    this.magicalDmgType = magicalDmgType;
	    return this;
	}

	public MagicDmgBuilder magicalDmgDice(int magicalDmgDice) {
	    this.magicalDmgDice = magicalDmgDice;
	    return this;
	}

	public MagicDmgBuilder magicalDmgModyfier(int magicalDmgModyfier) {
	    this.magicalDmgModyfier = magicalDmgModyfier;
	    return this;
	}

	public MagicDmgBuilder fixedBonusValue(int fixedBonusValue) {
	    this.fixedBonusValue = fixedBonusValue;
	    return this;
	}

	public MagicalDmg build() {
	    return new MagicalDmg(this);
	}

    }

}
