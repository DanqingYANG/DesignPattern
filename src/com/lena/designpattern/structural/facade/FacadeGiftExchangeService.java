package com.lena.designpattern.structural.facade;

public class FacadeGiftExchangeService {
    private Valid valid = new Valid();
    private Payment payment = new Payment();
    private ShippingService shippingService = new ShippingService();

    public void Service(Pointsgift pointsgift, User user)
    {
        String message = "not work";
        if(valid.isAvailable(pointsgift, user))
        {
            if(payment.Success())
            {
                String shippingNo = shippingService.shipGift(pointsgift);
                message = "Order Finished";
            }
        }

        System.out.println(message);
    }

}
