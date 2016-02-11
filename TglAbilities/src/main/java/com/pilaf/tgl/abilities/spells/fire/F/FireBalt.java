package com.pilaf.tgl.abilities.spells.fire.F;

import java.util.List;

import com.pilaf.tgl.abilities.SpellItem;
import com.pilaf.tgl.abilities.annotations.Ability;
import com.pilaf.tgl.abilities.annotations.Spell;
import com.pilaf.tgl.abilities.annotations.magic.FireMagic;
import com.pilaf.tgl.effect.builder.EffectModel;
import com.pilaf.tgl.effect.builder.action.items.MagicalDmg;
import com.pilaf.tgl.effect.builder.area.items.ArreaNoTarget;
import com.pilaf.tgl.effect.builder.area.items.CircleEffectArea;
import com.pilaf.tgl.effect.builder.enums.MagicalDmgType;
import com.pilaf.tgl.effect.builder.enums.TargetType;
import com.pilaf.tgl.effect.builder.templates.ActionEffect;
import com.pilaf.tgl.effect.builder.templates.AreaEffect;
import com.pilaf.tgl.effect.builder.templates.TimeEffect;
import com.pilaf.tgl.effect.builder.time.items.Hit;
import com.pilaf.tgl.effect.builder.time.items.TimePeriod;

@Ability
@Spell
@FireMagic
public class FireBalt implements SpellItem {

    public static EffectModel initSpell() {
	ActionEffect actionEffect = new MagicalDmg.MagicDmgBuilder().magicalDmgDice(7).magicalDmgModyfier(5)
		.magicalDmgType(MagicalDmgType.FIRE).build();
	TimeEffect timeEffect = new Hit.HitBuilder().build();
	AreaEffect areaEffect = new CircleEffectArea.CircleEffectBuilder().areaOfEffect(3).target(TargetType.ALL)
		.build();
	
	EffectModel effectModel = new EffectModel.EffectModelBuilder().actionEffect(actionEffect).build();
	return effectModel;
    }

    @Override
    public List<EffectModel> effectsList() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int distance() {
	// TODO Auto-generated method stub
	return 10;
    }

    @Override
    public int actionCost() {
	// TODO Auto-generated method stub
	return 6;
    }

    @Override
    public int energyLevelNeeded() {
	return 1;
    }

}
