package com.pilaf.tgl.abilities;

import java.util.List;

import com.pilaf.tgl.api.effect.EffectModel;

public interface AbilityInterface {
    
    List<EffectModel> effectsList();
    
    int distance();
    
    int actionCost();

}
