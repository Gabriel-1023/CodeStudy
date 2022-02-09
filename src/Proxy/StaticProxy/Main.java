package Proxy.StaticProxy;

import Proxy.SmsService;
import Proxy.SmsServiceImpl;

public class Main {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("Hello");
    }
}
