package com.pilaf.tgl.effect.builder.condition.items;

import com.pilaf.tgl.api.effect.enums.ParameterValueType;
import com.pilaf.tgl.api.effect.enums.ValueCondition;
import com.pilaf.tgl.api.effect.templates.ConditionEffect;

public class ParameterValue implements ConditionEffect {

	private final ParameterValueType parameterValueType;
	private final int paramValue;
	private final ValueCondition valueCondition;

	private ParameterValue(ParameterValueBuilder defenceThrowBuilder) {
		this.parameterValueType = defenceThrowBuilder.parameterValueType;
		this.paramValue = defenceThrowBuilder.paramValue;
		this.valueCondition = defenceThrowBuilder.valueCondition;
	}

	public static class ParameterValueBuilder {
		ParameterValueType parameterValueType;
		int paramValue;
		ValueCondition valueCondition;

		public ParameterValueBuilder parameterValueType(ParameterValueType parameterValueType) {
			this.parameterValueType = parameterValueType;
			return this;
		}

		public ParameterValueBuilder paramValue(int paramValue) {
			this.paramValue = paramValue;
			return this;
		}

		public ParameterValueBuilder valueCondition(ValueCondition valueCondition) {
			this.valueCondition = valueCondition;
			return this;
		}

		public ParameterValue build() {
			return new ParameterValue(this);
		}

	}

}
