package com.pilaf.tgl.abilities.spells.fire.D;

import java.util.List;

import com.pilaf.tgl.abilities.SpellItem;
import com.pilaf.tgl.effect.builder.EffectModel;
import com.pilaf.tgl.effect.builder.action.items.MagicalDmg;
import com.pilaf.tgl.effect.builder.enums.MagicalDmgType;
import com.pilaf.tgl.effect.builder.templates.ActionEffect;

public class ChaosBall implements SpellItem{
    
    public static EffectModel initSpell(){
	ActionEffect actionEffect = new MagicalDmg.MagicDmgBuilder().magicalDmgDice(30).magicalDmgModyfier(0).magicalDmgType(MagicalDmgType.FIRE).build();
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
