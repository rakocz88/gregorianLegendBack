package com.pilaf.tgl.api.charakter.action.basic;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.pilaf.tgl.api.charakter.CharakterInCombatBase;
import com.pilaf.tgl.api.charakter.action.ActiveAction;
import com.pilaf.tgl.api.enums.ActionType;
import com.pilaf.tgl.api.equipment.Armor;
import com.pilaf.tgl.commons.random.RandomCreator;

@JsonInclude(Include.NON_NULL)
public class MaleAtackAction implements ActiveAction {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    public CharakterInCombatBase atack(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	atacker.getCharakterPoints().getActionPoints().changeCurrentValue(-(getActionCost(atacker)));
	int atackValue = RandomCreator.rollDiceNumber(atacker.getCharakterBasicAtacksStats().getCurrentAtackDice());
	atackValue = atackValue + atacker.getCharakterBasicAtacksStats().getCurrentBonusAtack();
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

    @JsonIgnore
    protected void dealDmg(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	int resistance = target.getCharakterResistances().getWeaponResistance().getCurrentValue();
	int dmgRolls = atacker.getCharakterBasicAtacksStats().getCurrentDmgDice();
	int dmgModyfier = atacker.getCharakterBasicAtacksStats().getCurrentBonusDmg();
	int dmgDealt = (RandomCreator.rollDiceNumber(dmgRolls) + dmgModyfier) / resistance;
	System.out.println(atacker.getCharakterDescriptions().getName() + " deals " + dmgDealt + " "
		+ atacker.getCharakterEquipment().getMainWeapon1().physicalDmgType() + " to "
		+ target.getCharakterDescriptions().getName());
	target.getCharakterPoints().getHealth().changeCurrentValue(-(dmgDealt));
	if (target.getCharakterPoints().getHealth().getCurrentValue() <= 0) {
	    System.out.println(target.getCharakterDescriptions().getName() + " is DEAD");
	}

    }

    @Override
    @JsonIgnore
    public ActionType actionType() {
	return ActionType.MALE_ATACK;
    }

    @Override
    @JsonIgnore
    public void action(CharakterInCombatBase atacker, CharakterInCombatBase target) {
	atack(atacker, target);

    }

    @Override
    @JsonIgnore
    public int getActionCost(CharakterInCombatBase charakter) {
	int armodModyfierIncriseCost = 0;
	Armor armor = charakter.getCharakterEquipment().getArmor();
	if (armor != null && armor.actionChangedCost().get(ActionType.MALE_ATACK) != null) {
	    armodModyfierIncriseCost = armor.actionChangedCost().get(ActionType.MALE_ATACK);
	}
	return charakter.getCharakterEquipment().getMainWeapon1().atackPointsCosts() + armodModyfierIncriseCost;
    }

    @Override
    @JsonIgnore
    public int getDistance(CharakterInCombatBase charakter) {
	return charakter.getCharakterEquipment().getMainWeapon1().getDistance();
    }

}
