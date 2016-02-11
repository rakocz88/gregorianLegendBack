package com.pilaf.tgl.effect.builder.action.items;

import com.pilaf.tgl.commons.random.RandomCreator;
import com.pilaf.tgl.effect.builder.templates.ActionEffect;

public class Heal implements ActionEffect {

	private final boolean canHealOverHealth;
	private final int dice;
	private final double modyfier;
	private final int fixedBonusValue;

	public boolean isCanHealOverHealth() {
		return canHealOverHealth;
	}

	public int getDice() {
		return dice;
	}

	public double getModyfier() {
		return modyfier;
	}

	public int getFixedBonusValue() {
		return fixedBonusValue;
	}

	private Heal(HealBuilder healBuilder) {
		super();
		this.canHealOverHealth = healBuilder.canHealOverHealth;
		this.dice = healBuilder.dice;
		this.modyfier = healBuilder.modyfier;
		this.fixedBonusValue = healBuilder.fixedBonusValue;
	}

	public static class HealBuilder {
		boolean canHealOverHealth;
		int dice;
		double modyfier;
		int fixedBonusValue;

		public HealBuilder canHealOverHealth(boolean canHealOverHealth) {
			this.canHealOverHealth = canHealOverHealth;
			return this;
		}

		public HealBuilder dice(int dice) {
			this.dice = dice;
			return this;
		}

		public HealBuilder modyfier(double modyfier) {
			this.modyfier = modyfier;
			return this;
		}

		public HealBuilder fixedBonusValue(int fixedBonusValue) {
			this.fixedBonusValue = fixedBonusValue;
			return this;
		}

		public Heal build() {
			return new Heal(this);
		}
	}

	@Override
	public void takeAction(int paramValue) {
		System.out.println("Healed by " + (fixedBonusValue
				+ (RandomCreator.oneToTen() * dice) + (modyfier * paramValue)));

	}

	@Override
	public int returnValue(int paramValue) {
		double modyfierValue = modyfier * paramValue;
		int randValue = RandomCreator.rollDiceNumber(dice);
		return (int) (fixedBonusValue + (randValue) + (modyfierValue));
	}

}
