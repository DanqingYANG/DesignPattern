package com.lena.designpattern.behavioral.strategie;

public class PromotionActivity {
    public PromotionActivity(IpromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    private IpromotionStrategy promotionStrategy;

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}
