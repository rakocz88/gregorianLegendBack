package com.pilaf.tgl.api.effect;

import com.pilaf.tgl.api.effect.templates.ActionEffect;
import com.pilaf.tgl.api.effect.templates.AreaEffect;
import com.pilaf.tgl.api.effect.templates.ConditionEffect;
import com.pilaf.tgl.api.effect.templates.TimeEffect;
import com.pilaf.tgl.api.effect.templates.TriggerEffect;

public class EffectModel implements EffectItem {

    private final ActionEffect actionEffect;
    private final AreaEffect areaEffect;
    private final ConditionEffect conditionEffect;
    private final TimeEffect timeEffect;
    private final TriggerEffect triggerEffect;

    private EffectModel(EffectModelBuilder builder) {
	this.actionEffect = builder.actionEffect;
	this.areaEffect = builder.areaEffect;
	this.conditionEffect = builder.conditionEffect;
	this.timeEffect = builder.timeEffect;
	this.triggerEffect = builder.triggerEffect;
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

    public TriggerEffect getTriggerEffect() {
	return triggerEffect;
    }

    public static class EffectModelBuilder {

	ActionEffect actionEffect;
	AreaEffect areaEffect;
	ConditionEffect conditionEffect;
	TimeEffect timeEffect;
	TriggerEffect triggerEffect;

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

	public EffectModelBuilder triggerEffect(TriggerEffect triggerEffect) {
	    this.triggerEffect = triggerEffect;
	    return this;
	}

	public EffectModel build() {
	    return new EffectModel(this);
	}

    }

    public EffectItem init() {
	return this;
    }
}