package com.pilaf.tgl.effect.builder.effects;

import com.pilaf.tgl.effect.builder.Effect;
import com.pilaf.tgl.effect.builder.EffectItem;
import com.pilaf.tgl.effect.builder.EffectModel;
import com.pilaf.tgl.effect.builder.action.items.Heal;
import com.pilaf.tgl.effect.builder.area.items.Target;
import com.pilaf.tgl.effect.builder.enums.TargetType;
import com.pilaf.tgl.effect.builder.templates.ActionEffect;
import com.pilaf.tgl.effect.builder.templates.AreaEffect;
import com.pilaf.tgl.effect.builder.templates.TimeEffect;
import com.pilaf.tgl.effect.builder.time.items.TimePeriod;

@Effect
public class HealOverTime implements EffectItem {

    @Override
    public EffectItem init() {
	ActionEffect actionEffect = new Heal.HealBuilder().canHealOverHealth(false).dice(0).modyfier(0)
		.fixedBonusValue(20).build();
	TimeEffect timeEffect = new TimePeriod.TimePeriodBuilder().timeUnits(30).timeStamp(10).effectIfEnter(false)
		.effectStacks(false).build();
	AreaEffect areaEffect = new Target.TargetBuilder().target(TargetType.ALL).build();
	return new EffectModel.EffectModelBuilder().actionEffect(actionEffect).areaEffect(areaEffect)
		.timeEffect(timeEffect).build();
    }

}
