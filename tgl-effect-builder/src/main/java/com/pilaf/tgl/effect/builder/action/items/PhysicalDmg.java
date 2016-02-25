package com.pilaf.tgl.effect.builder.action.items;

import com.pilaf.tgl.api.effect.templates.ActionEffect;
import com.pilaf.tgl.api.enums.PhysicalDmgType;
import com.pilaf.tgl.commons.random.RandomCreator;

public class PhysicalDmg implements ActionEffect {

	private final PhysicalDmgType physicalDmgType;
	private final int physicalDmgDice;
	private final double physicalDmgModifier;
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

	public double getPhysicalDmgModifier() {
		return physicalDmgModifier;
	}

	public int getFixedBonusValue() {
		return fixedBonusValue;
	}

	public static class PhysicalDmgBuilder {
		PhysicalDmgType physicalDmgType;
		int physicalDmgDice;
		double physicalDmgModifier;
		int fixedBonusValue;

		public PhysicalDmgBuilder physicalDmgType(
				PhysicalDmgType physicalDmgType) {
			this.physicalDmgType = physicalDmgType;
			return this;
		}

		public PhysicalDmgBuilder physicalDmgDice(int physicalDmgDice) {
			this.physicalDmgDice = physicalDmgDice;
			return this;
		}

		public PhysicalDmgBuilder physicalDmgModifier(
				double physicalDmgModifier) {
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

	@Override
	public void takeAction(int paramValue) {
		System.out.println("Deals "
				+ (fixedBonusValue
						+ (RandomCreator.oneToTen() * physicalDmgDice)
						+ (physicalDmgModifier * paramValue))
				+ " " + physicalDmgType);

	}

	@Override
	public int returnValue(int paramValue) {
		double modyfierValue = physicalDmgModifier * paramValue;
		int randValue = RandomCreator.rollDiceNumber(physicalDmgDice);
		return (int) (fixedBonusValue + (randValue) + (modyfierValue));
	}
}
