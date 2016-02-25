package com.pilaf.tgl.abilities.atacks;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.action.basic.MaleAtackAction;
import com.pilaf.tgl.commons.random.RandomCreator;

public class PrescisiveAtack extends MaleAtackAction {

    private static final int ATACK_MOD_BONUS = 5;
    private static final int ACTION_COST_INCRISE = 3;

    @Override
    public CharakterInCombatBase atack(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	System.out.println(atacker.getCharName() + " invokes precisive atack");
	atacker.getCharakterPoints().getActionPoints().changeCurrentValue(-(-(getActionCost(atacker))));
	int atackValue = RandomCreator.rollDiceNumber(atacker.getCharakterBasicAtacksStats().getCurrentAtackDice());
	atackValue = atackValue + atacker.getCharakterBasicAtacksStats().getCurrentBonusAtack();
	atackValue += ATACK_MOD_BONUS;
	int defenceValue = target.getCharakterDefences().getCharakterDodgeParam().getDodgeCurrentValue();
	System.out.println(atacker.getCharName() + " atacks with value " + atackValue);
	System.out.println(target.getCharName() + " has defence " + defenceValue);
	if (atackValue > target.getCharakterDefences().getCharakterDodgeParam().getDodgeCurrentValue()) {
	    System.out.println(atacker.getCharName() + " hits " + target.getCharName());
	    dealDmg(atacker, target);
	}
	return atacker;
    }

    @Override
    public int getActionCost(CharakterInCombatBase charakter) {
	return super.getActionCost(charakter) + ACTION_COST_INCRISE;
    }

}
