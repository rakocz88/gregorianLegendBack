package com.pilaf.tgl.api.charakter.speed;

import java.util.HashMap;
import java.util.Map;

import com.pilaf.tgl.api.charakter.CharakterInCombatBase;

public class SpeedCalculator {

    public static final double STROLL_COST = 2;
    public static final double WALK_COST = 1.25;
    public static final double RUN_COST = 0.75;
    public static final double SPRING_COST = 0.25;

    static Map<Integer, SpeedLimits> speedMap = initSpeedMap();

    static private Map<Integer, SpeedLimits> initSpeedMap() {
	Map<Integer, SpeedLimits> speedMaps = new HashMap<>();
	speedMaps.put(0, new SpeedLimits(1000, 0, 0, 0, 0));
	speedMaps.put(1, new SpeedLimits(20, 40, 60, 80, 2));
	speedMaps.put(2, new SpeedLimits(15, 20, 60, 80, 4));
	speedMaps.put(3, new SpeedLimits(12, 19, 40, 0, 4));
	speedMaps.put(4, new SpeedLimits(10, 15, 30, 0, 5));
	speedMaps.put(5, new SpeedLimits(8, 40, 60, 80, 5));
	speedMaps.put(6, new SpeedLimits(6, 13, 19, 99, 6));
	speedMaps.put(7, new SpeedLimits(6, 12, 18, 99, 6));
	speedMaps.put(8, new SpeedLimits(5, 11, 17, 99, 7));
	speedMaps.put(9, new SpeedLimits(5, 10, 16, 99, 7));
	speedMaps.put(10, new SpeedLimits(4, 10, 15, 99, 8));
	speedMaps.put(11, new SpeedLimits(4, 9, 14, 99, 8));
	speedMaps.put(12, new SpeedLimits(3, 8, 12, 99, 9));
	speedMaps.put(13, new SpeedLimits(3, 7, 12, 99, 9));
	speedMaps.put(14, new SpeedLimits(3, 6, 12, 99, 10));
	speedMaps.put(15, new SpeedLimits(3, 6, 11, 99, 10));
	speedMaps.put(16, new SpeedLimits(2, 6, 10, 99, 11));
	speedMaps.put(17, new SpeedLimits(2, 5, 10, 99, 11));
	speedMaps.put(18, new SpeedLimits(2, 4, 10, 99, 12));
	speedMaps.put(19, new SpeedLimits(2, 4, 9, 99, 12));
	speedMaps.put(20, new SpeedLimits(1, 4, 8, 99, 13));
	speedMaps.put(21, new SpeedLimits(1, 3, 8, 99, 13));
	speedMaps.put(22, new SpeedLimits(1, 2, 8, 99, 14));
	speedMaps.put(23, new SpeedLimits(1, 2, 7, 99, 14));
	speedMaps.put(24, new SpeedLimits(0, 2, 6, 99, 15));
	speedMaps.put(25, new SpeedLimits(0, 1, 6, 99, 15));
	speedMaps.put(26, new SpeedLimits(0, 0, 6, 99, 16));
	speedMaps.put(27, new SpeedLimits(0, 0, 5, 99, 16));
	speedMaps.put(28, new SpeedLimits(0, 0, 4, 99, 17));
	speedMaps.put(29, new SpeedLimits(0, 0, 4, 99, 17));
	speedMaps.put(30, new SpeedLimits(0, 0, 3, 99, 18));
	speedMaps.put(31, new SpeedLimits(0, 0, 3, 99, 18));
	speedMaps.put(32, new SpeedLimits(0, 0, 2, 99, 19));
	speedMaps.put(33, new SpeedLimits(0, 0, 2, 99, 19));
	speedMaps.put(33, new SpeedLimits(0, 0, 1, 99, 19));
	speedMaps.put(34, new SpeedLimits(0, 0, 0, 99, 20));
	speedMaps.put(35, new SpeedLimits(0, 0, 0, 99, 21));
	return speedMaps;
    }

    public static int getMaxSpeed(CharakterInCombatBase charakter) {
	return speedMap.get(charakter.getCharakterOtherFields().getCharakterSpeed().getCurrentValue()).maxSpeed;
    }

    public static int getActionCost(CharakterInCombatBase charakter, int distanse) {
	int charSpeed = charakter.getCharakterOtherFields().getCharakterSpeed().getCurrentValue();
	SpeedLimits limit = speedMap.get(charSpeed);
	double actionCost = 0;
	if (distanse < limit.strollLimit) {
	    return (int) (distanse * STROLL_COST);
	} else {
	    actionCost = actionCost + (STROLL_COST * limit.strollLimit);
	    distanse = distanse - limit.strollLimit;
	}

	if (distanse < limit.walkLimit) {
	    return (int) (actionCost + (distanse * WALK_COST));
	} else {
	    actionCost = actionCost + (WALK_COST * limit.walkLimit);
	    distanse = distanse - limit.walkLimit;
	}

	if (distanse < limit.runLimit) {
	    return (int) (actionCost + (distanse * RUN_COST));
	} else {
	    actionCost = actionCost + (RUN_COST * limit.runLimit);
	    distanse = distanse - limit.runLimit;
	}

	actionCost = actionCost + (SPRING_COST * distanse);

	return (int) actionCost;

	// double strollPoints = distanse - limit.strollLimit;
	// if (strollPoints<=0){
	// double actionPointsValue = distanse * STROLL_COST;
	// return (int) actionPointsValue;
	// }
	// distanse = (int) (distanse- strollPoints);
	// double walkPoints = distanse - limit.walkLimit;
	// if (walkPoints<=0){
	// double actionPointsValue = distanse * WALK_COST;
	// return (int) actionPointsValue;
	// }
	// actionCost = actionCost + (strollPoints * STROLL_COST);
	// if ()
    }

}
