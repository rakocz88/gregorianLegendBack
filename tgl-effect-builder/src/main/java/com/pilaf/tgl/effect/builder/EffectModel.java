package com.pilaf.tgl.effect.builder;

import com.pilaf.tgl.effect.builder.templates.ActionEffect;
import com.pilaf.tgl.effect.builder.templates.AreaEffect;
import com.pilaf.tgl.effect.builder.templates.ConditionEffect;
import com.pilaf.tgl.effect.builder.templates.TimeEffect;

public class EffectModel implements EffectItem {

    private final ActionEffect actionEffect;
    private final AreaEffect areaEffect;
    private final ConditionEffect conditionEffect;
    private final TimeEffect timeEffect;

    private EffectModel(EffectModelBuilder builder) {
	this.actionEffect = builder.actionEffect;
	this.areaEffect = builder.areaEffect;
	this.conditionEffect = builder.conditionEffect;
	this.timeEffect = builder.timeEffect;
    }

    public ActionEffect getActionEffect() {
	return actionEffect;
    }

    public AreaEffect getAreaEffect() {
	return areaEffect;
    }

    public ConditionEffect getConditionEffect() {
	return conditionEffect;
    }

    public TimeEffect getTimeEffect() {
	return timeEffect;
    }

    public static class EffectModelBuilder {

	ActionEffect actionEffect;
	AreaEffect areaEffect;
	ConditionEffect conditionEffect;
	TimeEffect timeEffect;

	public EffectModelBuilder actionEffect(ActionEffect effect) {
	    this.actionEffect = effect;
	    return this;
	}

	public EffectModelBuilder areaEffect(AreaEffect areaEffect) {
	    this.areaEffect = areaEffect;
	    return this;
	}

	public EffectModelBuilder conditionEffect(ConditionEffect conditionEffect) {
	    this.conditionEffect = conditionEffect;
	    return this;
	}

	public EffectModelBuilder timeEffect(TimeEffect timeEffect) {
	    this.timeEffect = timeEffect;
	    return this;
	}

	public EffectModel build() {
	    return new EffectModel(this);
	}

    }

    @Override
    public EffectItem init() {
	return this;
    }
}