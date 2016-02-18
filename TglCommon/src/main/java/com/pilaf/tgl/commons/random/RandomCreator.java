package com.pilaf.tgl.commons.random;

import java.util.Random;

public class RandomCreator {

    public static int randInt(int min, int max) {

	Random rand = new Random();
	int randomNum = rand.nextInt((max - min) + 1) + min;
	return randomNum;
    }

    public static int oneToTen() {
	return randInt(1, 10);
    }

    public static int rollDiceNumber(int diceNumber) {
	int value = 0;
	for (int i = 0; i < diceNumber; i++) {

	    int rolledValue = oneToTen();
	    if (rolledValue == 10) {
		value = reRoll(value);
	    }
	    value = value + rolledValue;
	}
	return value;

    }

    private static int reRoll(int value) {
	int rolledValue = oneToTen();
	value = value + rolledValue;
	if (rolledValue == 10) {
	    reRoll(value);
	}
	return value;

    }

}
