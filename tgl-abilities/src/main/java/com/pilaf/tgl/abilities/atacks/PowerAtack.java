package com.pilaf.tgl.abilities.atacks;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.action.basic.MaleAtackAction;
import com.pilaf.tgl.commons.random.RandomCreator;

public class PowerAtack extends MaleAtackAction {

    private static final int DMG_DICE_BONUS = 2;
    private static final int ACTION_POINTS_INCRISE = 4;
    private static final int ATACK_MOD_PENELTY = 4;

    @Override
    public CharakterInCombatBase atack(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	atacker.getCharakterPoints().getActionPoints().changeCurrentValue(-(-(getActionCost(atacker))));
	System.out.println("POWER ATACK USED BY " + atacker.getCharakterDescriptions().getName());
	int atackValue = RandomCreator.rollDiceNumber(atacker.getCharakterBasicAtacksStats().getCurrentAtackDice());
	atackValue = atackValue + atacker.getCharakterBasicAtacksStats().getCurrentBonusAtack();
	atackValue -= ATACK_MOD_PENELTY;
	int defenceValue = target.getCharakterDefences().getCharakterDodgeParam().getDodgeCurrentValue();
	System.out.println(atacker.getCharakterDescriptions().getName() + " atacks with value " + atackValue);
	System.out.println(target.getCharakterDescriptions().getName() + " has defence " + defenceValue);
	if (atackValue > defenceValue) {
	    System.out.println(atacker.getCharakterDescriptions().getName() + " hits "
		    + target.getCharakterDescriptions().getName());
	    dealDmg(atacker, target);
	}
	return atacker;
    }

    // TODO MOVE TO COMMON THINGS
    protected void dealDmg(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	int resistance = target.getCharakterResistances().getWeaponResistance().getCurrentValue();
	int dmgRolls = atacker.getCharakterBasicAtacksStats().getCurrentDmgDice();
	int dmgModyfier = atacker.getCharakterBasicAtacksStats().getCurrentBonusDmg();
	int dmgDealt = (RandomCreator.rollDiceNumber(dmgRolls + DMG_DICE_BONUS) + dmgModyfier) / resistance;
	System.out.println(atacker.getCharakterDescriptions().getName() + " deals " + dmgDealt
		+ atacker.getCharakterEquipment().getMainWeapon1().physicalDmgType() + " to "
		+ target.getCharakterDescriptions().getName());
	target.getCharakterPoints().getHealth().changeCurrentValue(-(dmgDealt));
	if (target.getCharakterPoints().getHealth().getCurrentValue() <= 0) {
	    System.out.println(target.getCharakterDescriptions().getName() + " is DEAD");
	}
    }

    @Override
    public int getActionCost(CharakterInCombatBase charakter) {
	return super.getActionCost(charakter) + ACTION_POINTS_INCRISE;
    }

}
