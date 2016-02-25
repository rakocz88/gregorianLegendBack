package com.pilaf.tgl.abilities.spells.fire.D;

import java.util.Arrays;
import java.util.List;

import com.pilaf.tgl.abilities.SpellItem;
import com.pilaf.tgl.abilities.annotations.Ability;
import com.pilaf.tgl.abilities.annotations.Spell;
import com.pilaf.tgl.abilities.annotations.magic.FireMagic;
import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.effect.templates.ActionEffect;
import com.pilaf.tgl.api.effect.templates.AreaEffect;
import com.pilaf.tgl.api.effect.templates.ConditionEffect;
import com.pilaf.tgl.api.effect.templates.TimeEffect;
import com.pilaf.tgl.api.enums.DefenceThrowType;
import com.pilaf.tgl.api.enums.MagicalDmgType;
import com.pilaf.tgl.api.enums.TargetType;
import com.pilaf.tgl.effect.builder.action.items.MagicalDmg;
import com.pilaf.tgl.effect.builder.area.items.CircleEffectArea;
import com.pilaf.tgl.effect.builder.condition.items.DefenceThrow;
import com.pilaf.tgl.effect.builder.time.items.Hit;

@Ability
@Spell
@FireMagic
public class FireBall implements SpellItem {

    public static EffectModel getEffect1() {
	ActionEffect actionEffect = new MagicalDmg.MagicDmgBuilder().magicalDmgDice(5).magicalDmgModyfier(5)
		.magicalDmgType(MagicalDmgType.FIRE).build();
	TimeEffect timeEffect = new Hit.HitBuilder().build();
	AreaEffect areaEffect = new CircleEffectArea.CircleEffectBuilder().areaOfEffect(3).target(TargetType.ALL)
		.build();
	EffectModel effectModel = new EffectModel.EffectModelBuilder().actionEffect(actionEffect).timeEffect(timeEffect).areaEffect(areaEffect).build();
	return effectModel;
    }
    
    public static EffectModel getEffect2() {
  	ActionEffect actionEffect = new MagicalDmg.MagicDmgBuilder().magicalDmgDice(5).magicalDmgModyfier(6)
  		.magicalDmgType(MagicalDmgType.FIRE).build();
  	TimeEffect timeEffect = new Hit.HitBuilder().build();
  	AreaEffect areaEffect = new CircleEffectArea.CircleEffectBuilder().areaOfEffect(5).target(TargetType.ALL)
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
	return 40;
    }

    @Override
    public int actionCost() {
	return 7;
    }

    @Override
    public int energyLevelNeeded() {
	return 2;
    }

}
