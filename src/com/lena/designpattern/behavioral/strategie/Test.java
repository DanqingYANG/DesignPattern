package com.lena.designpattern.behavioral.strategie;

public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(new s1());
        promotionActivity.executePromotionStrategy();

        //v2,PromotionStrategyFactory
        String key = "s1";
        PromotionActivity promotionActivity1;
        promotionActivity1 = new PromotionActivity(new PromotionStrategyFactory().getPromotionStrategy(key));
        promotionActivity1.executePromotionStrategy();
        key = "s2";
        promotionActivity1 = new PromotionActivity(new PromotionStrategyFactory().getPromotionStrategy(key));
        promotionActivity1.executePromotionStrategy();
    }
}
