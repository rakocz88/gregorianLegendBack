package com.pilaf.tgl.abilities.spells.fire.B;

import java.util.Arrays;
import java.util.List;

import com.pilaf.tgl.abilities.SpellItem;
import com.pilaf.tgl.api.effect.EffectModel;
import com.pilaf.tgl.api.effect.templates.ActionEffect;
import com.pilaf.tgl.api.effect.templates.AreaEffect;
import com.pilaf.tgl.api.effect.templates.ConditionEffect;
import com.pilaf.tgl.api.effect.templates.TimeEffect;
import com.pilaf.tgl.api.enums.DefenceThrowType;
import com.pilaf.tgl.api.enums.MagicalDmgType;
import com.pilaf.tgl.api.enums.TargetType;
import com.pilaf.tgl.effect.builder.action.items.MagicalDmg;
import com.pilaf.tgl.effect.builder.area.items.Target;
import com.pilaf.tgl.effect.builder.condition.items.DefenceThrow;
import com.pilaf.tgl.effect.builder.time.items.Hit;

public class ChaosBall implements SpellItem{
    
    public static EffectModel initSpell(){
	ActionEffect actionEffect = new MagicalDmg.MagicDmgBuilder().magicalDmgDice(30).magicalDmgModyfier(0).magicalDmgType(MagicalDmgType.FIRE).build();
	AreaEffect areaEffect = new Target.TargetBuilder().target(TargetType.ALL).build();
	TimeEffect timeEffect = new Hit.HitBuilder().build();
	ConditionEffect conditionEffect = new DefenceThrow.DefenceThrowBuilder().defenceThrowType(DefenceThrowType.Reflex).defenceThrowValue(20).build();
	EffectModel effectModel = new EffectModel.EffectModelBuilder().actionEffect(actionEffect).areaEffect(areaEffect).conditionEffect(conditionEffect).timeEffect(timeEffect).build();
	return effectModel;
    }

    @Override
    public List<EffectModel> effectsList() {
	return Arrays.asList(initSpell());
    }

    @Override
    public int distance() {
	return 40;
    }

    @Override
    public int actionCost() {
	return 8;
    }


    @Override
    public int energyLevelNeeded() {
	return 3;
    }

}
