package com.pilaf.tgl.abilities.spells.fire.C;

import java.util.Arrays;
import java.util.List;

import com.pilaf.tgl.abilities.SpellItem;
import com.pilaf.tgl.abilities.annotations.Ability;
import com.pilaf.tgl.abilities.annotations.Spell;
import com.pilaf.tgl.abilities.annotations.magic.FireMagic;
import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.effect.templates.ActionEffect;
import com.pilaf.tgl.api.effect.templates.AreaEffect;
import com.pilaf.tgl.api.effect.templates.TimeEffect;
import com.pilaf.tgl.api.effect.templates.TriggerEffect;
import com.pilaf.tgl.api.enums.ParameterChangeValueType;
import com.pilaf.tgl.api.enums.ParameterValueType;
import com.pilaf.tgl.api.enums.TargetType;
import com.pilaf.tgl.api.enums.TriggerEffectType;
import com.pilaf.tgl.effect.builder.action.items.MagicalDmg;
import com.pilaf.tgl.effect.builder.action.items.ParameterChange;
import com.pilaf.tgl.effect.builder.area.items.Target;
import com.pilaf.tgl.effect.builder.time.items.Hit;
import com.pilaf.tgl.effect.builder.time.items.TimePeriod;
import com.pilaf.tgl.effect.builder.trigger.items.TriggerCurEffect;

@Ability
@FireMagic
@Spell
public class InnerFire implements SpellItem {

    private EffectModel initEffect1() {
	ActionEffect actionEffect = new ParameterChange.ParameterChangeBuilder().fixedValueChange(2)
		.parameterChangeValueType(ParameterChangeValueType.INCREASE)
		.parameterValueType(ParameterValueType.SPEED).build();
	TimeEffect timeEffect = new TimePeriod.TimePeriodBuilder().effectStacks(true).timeUnits(50).build();
	AreaEffect areaEffect = new Target.TargetBuilder().target(TargetType.SELF).build();
	return new EffectModel.EffectModelBuilder().actionEffect(actionEffect).areaEffect(areaEffect)
		.timeEffect(timeEffect).build();
    }

    private EffectModel initEffect2() {
	ActionEffect actionEffect = new ParameterChange.ParameterChangeBuilder().fixedValueChange(2)
		.parameterChangeValueType(ParameterChangeValueType.INCREASE)
		.parameterValueType(ParameterValueType.DEXTERITY).build();
	TimeEffect timeEffect = new TimePeriod.TimePeriodBuilder().effectStacks(true).timeUnits(50).build();
	AreaEffect areaEffect = new Target.TargetBuilder().target(TargetType.SELF).build();
	return new EffectModel.EffectModelBuilder().actionEffect(actionEffect).areaEffect(areaEffect)
		.timeEffect(timeEffect).build();
    }

    private EffectModel initEffect3() {
	ActionEffect actionEffect = new ParameterChange.ParameterChangeBuilder().fixedValueChange(2)
		.parameterChangeValueType(ParameterChangeValueType.INCREASE)
		.parameterValueType(ParameterValueType.DODGE).build();
	TimeEffect timeEffect = new TimePeriod.TimePeriodBuilder().effectStacks(true).timeUnits(50).build();
	AreaEffect areaEffect = new Target.TargetBuilder().target(TargetType.SELF).build();
	return new EffectModel.EffectModelBuilder().actionEffect(actionEffect).areaEffect(areaEffect)
		.timeEffect(timeEffect).build();
    }

    private EffectModel initEffect4() {
	//TODO Create default trigger buf Action Event
	ActionEffect actionEffect = new ParameterChange.ParameterChangeBuilder().build();
	TimeEffect timeEffect = new TimePeriod.TimePeriodBuilder().effectStacks(true).timeUnits(50).build();
	AreaEffect areaEffect = new Target.TargetBuilder().target(TargetType.SELF).build();
	ActionEffect afterHitEffect = new MagicalDmg.MagicDmgBuilder().magicalDmgDice(2).magicalDmgModyfier(2).build();
	TimeEffect timeEffect2 = new Hit.HitBuilder().build();
	AreaEffect areaEffect2 = new Target.TargetBuilder().target(TargetType.ALL).build();
	EffectModel afterHitEffectModel = new EffectModel.EffectModelBuilder().actionEffect(afterHitEffect).timeEffect(timeEffect2).areaEffect(areaEffect2).build();
	TriggerEffect triggerEffect = new TriggerCurEffect.TriggerEffectBuilder().effectTrigered(afterHitEffectModel)
		.triggerEffectType(TriggerEffectType.ON_HIT).build();
	return new EffectModel.EffectModelBuilder().actionEffect(actionEffect).timeEffect(timeEffect)
		.areaEffect(areaEffect).triggerEffect(triggerEffect).build();
    }

    @Override
    public List<EffectModel> effectsList() {
	return Arrays.asList(initEffect1(), initEffect2(), initEffect3(), initEffect4());
    }

    @Override
    public int distance() {
	return 0;
    }

    @Override
    public int actionCost() {
	return 7;
    }

    @Override
    public int energyLevelNeeded() {
	return 1;
    }

}
