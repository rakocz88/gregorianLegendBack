package com.pilaf.tgl.effect.builder.effects;

import com.pilaf.tgl.effect.builder.Effect;
import com.pilaf.tgl.effect.builder.EffectItem;
import com.pilaf.tgl.effect.builder.EffectModel;
import com.pilaf.tgl.effect.builder.action.items.MagicalDmg;
import com.pilaf.tgl.effect.builder.area.items.CircleEffectArea;
import com.pilaf.tgl.effect.builder.condition.items.CreatureCondition;
import com.pilaf.tgl.effect.builder.enums.CreatureType;
import com.pilaf.tgl.effect.builder.enums.MagicalDmgType;
import com.pilaf.tgl.effect.builder.enums.TargetType;
import com.pilaf.tgl.effect.builder.templates.ActionEffect;
import com.pilaf.tgl.effect.builder.templates.AreaEffect;
import com.pilaf.tgl.effect.builder.templates.ConditionEffect;
import com.pilaf.tgl.effect.builder.templates.TimeEffect;
import com.pilaf.tgl.effect.builder.time.items.TimePeriod;

@Effect
public class BurnUndeadCircle implements EffectItem {

    @Override
    public EffectModel init() {
	ActionEffect actionEffect = new MagicalDmg.MagicDmgBuilder().magicalDmgDice(3).magicalDmgModyfier(2)
		.magicalDmgType(MagicalDmgType.FIRE).build();
	AreaEffect areaEffect = new CircleEffectArea.CircleEffectBuilder().areaOfEffect(5).target(TargetType.ALL)
		.build();
	ConditionEffect conditionEffect = new CreatureCondition.CreatureConditionBuilder()
		.creatureTypeList(CreatureType.DEMON).creatureTypeList(CreatureType.DEVIL)
		.creatureTypeList(CreatureType.UNDEAD).build();
	TimeEffect timeEffect = new TimePeriod.TimePeriodBuilder().timeUnits(5).build();
	return new EffectModel.EffectModelBuilder().actionEffect(actionEffect).areaEffect(areaEffect)
		.conditionEffect(conditionEffect).timeEffect(timeEffect).build();
    }

}
