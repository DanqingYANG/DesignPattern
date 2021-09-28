package com.lena.designpattern.structural.facade;

public class ShippingService {
    public String shipGift(Pointsgift pointsgift)
    {
        System.out.println(pointsgift.Giftname + " shipGift");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
