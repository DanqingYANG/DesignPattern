package com.lena.designpattern.structural.facade;

public class Valid {
    public static boolean isAvailable(Pointsgift pointsgift, User user)
    {
        if(user.mypoints >= pointsgift.Points)
            return true;
        return false;
    }
}
