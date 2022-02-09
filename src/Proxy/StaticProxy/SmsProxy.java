package Proxy.StaticProxy;

import Proxy.SmsService;

public class SmsProxy implements SmsService {

    private final SmsService smsService;

    public SmsProxy(SmsService smsService){
        this.smsService = smsService;
    }

    @Override
    public String send(String message){
        System.out.println("before sending");
        smsService.send(message);
        System.out.println("after sending");
        return message;
    }
}
