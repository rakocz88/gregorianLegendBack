package com.pilaf.tgl.api.charakter.action.basic;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.action.ActiveAction;
import com.pilaf.tgl.api.enums.ActionType;
import com.pilaf.tgl.api.equipment.Armor;
import com.pilaf.tgl.commons.random.RandomCreator;

public class MaleAtackAction implements ActiveAction {

    public CharakterInCombatBase atack(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	atacker.getCharakterPoints().getActionPoints().changeCurrentValue(-(getActionCost(atacker)));
	int atackValue = RandomCreator.rollDiceNumber(atacker.getCharakterBasicAtacksStats().getCurrentAtackDice());
	atackValue = atackValue + atacker.getCharakterBasicAtacksStats().getCurrentBonusAtack();
	int defenceValue = target.getCharakterDefences().getCharakterDodgeParam().getDodgeCurrentValue();
	System.out.println(atacker.getCharName() + " atacks with value " + atackValue);
	System.out.println(target.getCharName() + " has defence " + defenceValue);
	if (atackValue > defenceValue) {
	    System.out.println(atacker.getCharName() + " hits " + target.getCharName());
	    dealDmg(atacker, target);
	}
	return atacker;
    }

    protected void dealDmg(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	int resistance = target.getCharakterResistances().getWeaponResistance().getCurrentValue();
	int dmgRolls = atacker.getCharakterBasicAtacksStats().getCurrentDmgDice();
	int dmgModyfier = atacker.getCharakterBasicAtacksStats().getCurrentBonusDmg();
	int dmgDealt = (RandomCreator.rollDiceNumber(dmgRolls) + dmgModyfier) / resistance;
	System.out.println(atacker.getCharName() + " deals " + dmgDealt + " "
		+ atacker.getCharakterEquipment().getMainWeapon1().physicalDmgType() + " to " + target.getCharName());
	target.getCharakterPoints().getHealth().changeCurrentValue(-(dmgDealt));
	if (target.getCharakterPoints().getHealth().getCurrentValue() <= 0) {
	    System.out.println(target.getCharName() + " is DEAD");
	}

    }

    @Override
    public ActionType actionType() {
	return ActionType.MALE_ATACK;
    }

    @Override
    public void action(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	atack(atacker, target);

    }

    @Override
    public int getActionCost(CharakterInCombatBase charakter) {
	int armodModyfierIncriseCost = 0;
	Armor armor = charakter.getCharakterEquipment().getArmor();
	if (armor != null && armor.actionChangedCost().get(ActionType.MALE_ATACK) != null) {
	    armodModyfierIncriseCost = armor.actionChangedCost().get(ActionType.MALE_ATACK);
	}
	return charakter.getCharakterEquipment().getMainWeapon1().atackPointsCosts() + armodModyfierIncriseCost;
    }

    @Override
    public int getDistance(CharakterInCombatBase charakter) {
	return charakter.getCharakterEquipment().getMainWeapon1().getDistance();
    }
}
