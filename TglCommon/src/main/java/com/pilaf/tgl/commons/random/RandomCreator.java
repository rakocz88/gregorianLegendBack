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
    
    public static int rollDiceNumber(int diceNumber){
	int value=0;
	for (int i=0; i<diceNumber; i++){
	    value= value+oneToTen();
	}
	return value;
	
    }

}
