package Proxy.JDKProxy;

import Proxy.SmsService;
import Proxy.SmsServiceImpl;

import java.util.ArrayList;
import java.util.List;

/*
JDK 动态代理有一个最致命的问题是其只能代理实现了接口的类
效率来说，大部分情况都是 JDK 动态代理更优秀，随着 JDK 版本的升级，这个优势更加明显。
 */

public class Main {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("Hello");

        List<Integer> list = (List<Integer>) JdkProxyFactory.getProxy(new ArrayList<Integer>());

        list.add(123);
    }
}
