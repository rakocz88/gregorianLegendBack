package com.pilaf.tgl.abilities.spells.fire.B;

import java.util.Arrays;
import java.util.List;

import com.pilaf.tgl.abilities.SpellItem;
import com.pilaf.tgl.abilities.annotations.Ability;
import com.pilaf.tgl.abilities.annotations.Spell;
import com.pilaf.tgl.abilities.annotations.magic.FireMagic;
import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.effect.enums.DefenceThrowType;
import com.pilaf.tgl.api.effect.enums.MagicalDmgType;
import com.pilaf.tgl.api.effect.enums.TargetType;
import com.pilaf.tgl.api.effect.templates.ActionEffect;
import com.pilaf.tgl.api.effect.templates.AreaEffect;
import com.pilaf.tgl.api.effect.templates.ConditionEffect;
import com.pilaf.tgl.api.effect.templates.TimeEffect;
import com.pilaf.tgl.effect.builder.action.items.MagicalDmg;
import com.pilaf.tgl.effect.builder.area.items.CircleEffectArea;
import com.pilaf.tgl.effect.builder.condition.items.DefenceThrow;
import com.pilaf.tgl.effect.builder.time.items.Hit;

@Ability
@Spell
@FireMagic
public class BigFireBall implements SpellItem {

    public static EffectModel getEffect1() {
	ActionEffect actionEffect = new MagicalDmg.MagicDmgBuilder().magicalDmgDice(7).magicalDmgModyfier(7)
		.magicalDmgType(MagicalDmgType.FIRE).build();
	TimeEffect timeEffect = new Hit.HitBuilder().build();
	AreaEffect areaEffect = new CircleEffectArea.CircleEffectBuilder().areaOfEffect(4).target(TargetType.ALL)
		.build();
	EffectModel effectModel = new EffectModel.EffectModelBuilder().actionEffect(actionEffect).timeEffect(timeEffect).areaEffect(areaEffect).build();
	return effectModel;
    }
    
    public static EffectModel getEffect2() {
  	ActionEffect actionEffect = new MagicalDmg.MagicDmgBuilder().magicalDmgDice(7).magicalDmgModyfier(8)
  		.magicalDmgType(MagicalDmgType.FIRE).build();
  	TimeEffect timeEffect = new Hit.HitBuilder().build();
  	AreaEffect areaEffect = new CircleEffectArea.CircleEffectBuilder().areaOfEffect(6).target(TargetType.ALL)
  		.build();
  	ConditionEffect conditionEffect = new DefenceThrow.DefenceThrowBuilder().defenceThrowType(DefenceThrowType.Reflex).defenceThrowValue(20).build();
  	EffectModel effectModel = new EffectModel.EffectModelBuilder().actionEffect(actionEffect).timeEffect(timeEffect).areaEffect(areaEffect).conditionEffect(conditionEffect).build();
  	return effectModel;
      }

    @Override
    public List<EffectModel> effectsList() {
	return Arrays.asList(getEffect1(), getEffect2());
    }

    @Override
    public int distance() {
	return 50;
    }

    @Override
    public int actionCost() {
	return 10;
    }

    @Override
    public int energyLevelNeeded() {
	return 3;
    }

}
