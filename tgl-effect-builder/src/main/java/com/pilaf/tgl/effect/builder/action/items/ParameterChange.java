package com.pilaf.tgl.effect.builder.action.items;

import com.pilaf.tgl.effect.builder.enums.ParameterValueType;
import com.pilaf.tgl.effect.builder.templates.ActionEffect;

public class ParameterChange implements ActionEffect {

    private final ParameterValueType parameterValueType;
    private final int fixedValueChange;
    private final int dice;
    private final int modyfier;

    private ParameterChange(ParameterChangeBuilder parameterChangeBuilder) {
	this.parameterValueType = parameterChangeBuilder.parameterValueType;
	this.fixedValueChange = parameterChangeBuilder.fixedValueChange;
	this.dice = parameterChangeBuilder.dice;
	this.modyfier = parameterChangeBuilder.modyfier;
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

    public int getModyfier() {
	return modyfier;
    }

    public static class ParameterChangeBuilder {
	ParameterValueType parameterValueType;
	int fixedValueChange;
	int dice;
	int modyfier;

	public ParameterChangeBuilder parameterValueType(ParameterValueType parameterValueType) {
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

	public ParameterChangeBuilder modyfier(int modyfier) {
	    this.modyfier = modyfier;
	    return this;
	}

	public ParameterChange build() {
	    return new ParameterChange(this);
	}

    };

}
