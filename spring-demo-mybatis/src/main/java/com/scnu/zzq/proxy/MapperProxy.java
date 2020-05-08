package com.scnu.zzq.proxy;

import java.lang.reflect.Proxy;

public class MapperProxy {


    public static Object getMapper(Class clz){
        Class[] classes = new Class[]{clz};
        return Proxy.newProxyInstance(MapperProxy.class.getClassLoader(),classes,new MapperInvocationHandler());
    }


}
