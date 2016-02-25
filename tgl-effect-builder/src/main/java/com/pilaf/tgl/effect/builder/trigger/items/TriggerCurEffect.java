package com.pilaf.tgl.effect.builder.trigger.items;

import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.effect.templates.TriggerEffect;
import com.pilaf.tgl.api.enums.TriggerEffectType;

public class TriggerCurEffect implements TriggerEffect {

	private final TriggerEffectType triggerEffectType;

	private final EffectModel effectTrigered;

	private TriggerCurEffect(TriggerEffectBuilder builder) {
		this.triggerEffectType = builder.triggerEffectType;
		this.effectTrigered = builder.effectTrigered;
	}

	public TriggerEffectType getTriggerEffectType() {
		return triggerEffectType;
	}

	public EffectModel getEffectTrigered() {
		return effectTrigered;
	}

	public static class TriggerEffectBuilder {
		TriggerEffectType triggerEffectType;

		EffectModel effectTrigered;

		public TriggerEffectBuilder triggerEffectType(
				TriggerEffectType triggerEffectType) {
			this.triggerEffectType = triggerEffectType;
			return this;
		}

		public TriggerEffectBuilder effectTrigered(EffectModel effectTrigered) {
			this.effectTrigered = effectTrigered;
			return this;
		}

		public TriggerCurEffect build() {
			return new TriggerCurEffect(this);
		}

	}

}
