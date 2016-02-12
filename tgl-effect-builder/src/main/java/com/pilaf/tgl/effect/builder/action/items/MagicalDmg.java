package com.pilaf.tgl.effect.builder.action.items;

import com.pilaf.tgl.api.effect.enums.MagicalDmgType;
import com.pilaf.tgl.api.effect.templates.ActionEffect;
import com.pilaf.tgl.commons.random.RandomCreator;

public class MagicalDmg implements ActionEffect {

	private final MagicalDmgType magicalDmgType;

	private final int magicalDmgDice;

	private final double magicalDmgModyfier;
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

	public double getMagicalDmgModyfier() {
		return magicalDmgModyfier;
	}

	public int getFixedBonusValue() {
		return fixedBonusValue;
	}

	public static class MagicDmgBuilder {
		MagicalDmgType magicalDmgType;
		int magicalDmgDice;
		double magicalDmgModyfier;
		int fixedBonusValue;

		public MagicDmgBuilder magicalDmgType(MagicalDmgType magicalDmgType) {
			this.magicalDmgType = magicalDmgType;
			return this;
		}

		public MagicDmgBuilder magicalDmgDice(int magicalDmgDice) {
			this.magicalDmgDice = magicalDmgDice;
			return this;
		}

		public MagicDmgBuilder magicalDmgModyfier(double magicalDmgModyfier) {
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

	@Override
	public void takeAction(int paramValue) {
		double modyfierValue = magicalDmgModyfier * paramValue;
		int randValue = RandomCreator.rollDiceNumber(magicalDmgDice);
		System.out.println(
				"Deals " + (fixedBonusValue + (randValue) + (modyfierValue))
						+ " " + magicalDmgType);

	}

	@Override
	public int returnValue(int paramValue) {
		double modyfierValue = magicalDmgModyfier * paramValue;
		int randValue = RandomCreator.rollDiceNumber(magicalDmgDice);
		return (int) (fixedBonusValue + (randValue) + (modyfierValue));

	}

}
