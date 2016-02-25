package com.pilaf.tgl.effect.builder.action.items;

import com.pilaf.tgl.api.effect.templates.ActionEffect;
import com.pilaf.tgl.api.enums.ParameterChangeValueType;
import com.pilaf.tgl.api.enums.ParameterValueType;
import com.pilaf.tgl.commons.random.RandomCreator;

public class ParameterChange implements ActionEffect {

	private final ParameterValueType parameterValueType;
	private final int fixedValueChange;
	private final int dice;
	private final double modyfier;
	private final ParameterChangeValueType parameterChangeValueType;

	private ParameterChange(ParameterChangeBuilder parameterChangeBuilder) {
		this.parameterValueType = parameterChangeBuilder.parameterValueType;
		this.fixedValueChange = parameterChangeBuilder.fixedValueChange;
		this.dice = parameterChangeBuilder.dice;
		this.modyfier = parameterChangeBuilder.modyfier;
		this.parameterChangeValueType = parameterChangeBuilder.parameterChangeValueType;
	}

	public ParameterValueType getParameterValueType() {
		return parameterValueType;
	}

	public int getFixedValueChange() {
		return fixedValueChange;
	}

	public int getDice() {
		return dice;
	}

	public double getModyfier() {
		return modyfier;
	}

	public ParameterChangeValueType getParameterChangeValueType() {
		return parameterChangeValueType;
	}

	public static class ParameterChangeBuilder {
		ParameterValueType parameterValueType;
		int fixedValueChange;
		int dice;
		double modyfier;
		ParameterChangeValueType parameterChangeValueType;

		public ParameterChangeBuilder parameterValueType(
				ParameterValueType parameterValueType) {
			this.parameterValueType = parameterValueType;
			return this;
		}

		public ParameterChangeBuilder fixedValueChange(int fixedValueChange) {
			this.fixedValueChange = fixedValueChange;
			return this;
		}

		public ParameterChangeBuilder dice(int dice) {
			this.dice = dice;
			return this;
		}

		public ParameterChangeBuilder modyfier(double modyfier) {
			this.modyfier = modyfier;
			return this;
		}

		public ParameterChangeBuilder parameterChangeValueType(
				ParameterChangeValueType parameterChangeValueType) {
			this.parameterChangeValueType = parameterChangeValueType;
			return this;
		}

		public ParameterChange build() {
			return new ParameterChange(this);
		}

	}

	@Override
	public void takeAction(int paramValue) {
		System.out
				.println(
						"Changed  parameter " + parameterValueType
								+ parameterChangeValueType + " by "
								+ (fixedValueChange
										+ (RandomCreator.oneToTen() * dice)
										+ (modyfier * paramValue)));

	}

	@Override
	public int returnValue(int paramValue) {
		double modyfierValue = modyfier * paramValue;
		int randValue = RandomCreator.rollDiceNumber(dice);
		return (int) (fixedValueChange + (randValue) + (modyfierValue));
	}

}
