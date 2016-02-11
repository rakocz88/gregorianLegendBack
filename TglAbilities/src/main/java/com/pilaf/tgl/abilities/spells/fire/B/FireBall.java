package com.pilaf.tgl.abilities.spells.fire.B;

import java.util.List;

import com.pilaf.tgl.abilities.SpellItem;
import com.pilaf.tgl.abilities.annotations.Ability;
import com.pilaf.tgl.abilities.annotations.Spell;
import com.pilaf.tgl.abilities.annotations.magic.FireMagic;
import com.pilaf.tgl.effect.builder.EffectModel;
import com.pilaf.tgl.effect.builder.action.items.MagicalDmg;
import com.pilaf.tgl.effect.builder.enums.MagicalDmgType;
import com.pilaf.tgl.effect.builder.templates.ActionEffect;

@Ability
@Spell
@FireMagic
public class FireBall implements SpellItem{
    
    public static EffectModel initSpell(){
	ActionEffect actionEffect = new MagicalDmg.MagicDmgBuilder().magicalDmgDice(10).magicalDmgModyfier(11).magicalDmgType(MagicalDmgType.FIRE).build();
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
	return 0;
    }

    @Override
    public int actionCost() {
	// TODO Auto-generated method stub
	return 0;
    }


    @Override
    public int energyLevelNeeded() {
	// TODO Auto-generated method stub
	return 0;
    }

}
