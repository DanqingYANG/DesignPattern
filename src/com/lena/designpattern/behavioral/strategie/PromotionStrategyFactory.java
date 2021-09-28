package com.lena.designpattern.behavioral.strategie;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private static Map<String, IpromotionStrategy> promotionActivityMap= new HashMap<String, IpromotionStrategy>();

    private static final IpromotionStrategy NON_Promotion = new EmptyStrategy();

    private interface PromotionKey{
        String s1 = "s1";
        String s2 = "s2";
    }

    static {
        //promotionActivityMap.put("s2", new s2());
        promotionActivityMap.put(PromotionKey.s1, new s1());
        promotionActivityMap.put(PromotionKey.s2, new s2());
    }

    public PromotionStrategyFactory(){}

    public static IpromotionStrategy getPromotionStrategy(String key){
        IpromotionStrategy ipromotionStrategy = promotionActivityMap.get(key);
        return ipromotionStrategy == null? NON_Promotion: ipromotionStrategy;
    }
}
