package com.pilaf.tgl.effect.builder.effects;

import com.pilaf.tgl.api.effect.Effect;
import com.pilaf.tgl.api.effect.EffectItem;
import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.effect.enums.DefenceThrowType;
import com.pilaf.tgl.api.effect.enums.MagicalDmgType;
import com.pilaf.tgl.api.effect.enums.TargetType;
import com.pilaf.tgl.api.effect.templates.ActionEffect;
import com.pilaf.tgl.api.effect.templates.AreaEffect;
import com.pilaf.tgl.api.effect.templates.ConditionEffect;
import com.pilaf.tgl.effect.builder.action.items.MagicalDmg;
import com.pilaf.tgl.effect.builder.area.items.CircleEffectArea;
import com.pilaf.tgl.effect.builder.condition.items.DefenceThrow;
import com.pilaf.tgl.effect.builder.time.items.Hit;

@Effect
public class FireCircleAbility implements EffectItem {

    @Override
    public EffectItem init() {
	ActionEffect actionEffect = new MagicalDmg.MagicDmgBuilder().magicalDmgDice(3).magicalDmgModyfier(2)
		.magicalDmgType(MagicalDmgType.FIRE).build();
	AreaEffect areaEffect = new CircleEffectArea.CircleEffectBuilder().areaOfEffect(5).target(TargetType.ALL)
		.build();
	ConditionEffect conditionEffect = new DefenceThrow.DefenceThrowBuilder()
		.defenceThrowType(DefenceThrowType.Reflex).defenceThrowValue(20).build();
	return new EffectModel.EffectModelBuilder().actionEffect(actionEffect).areaEffect(areaEffect)
		.conditionEffect(conditionEffect).timeEffect(new Hit.HitBuilder().build()).build();
    }

}
