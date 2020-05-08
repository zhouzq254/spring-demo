package com.scnu.zzq.proxy;

import com.scnu.zzq.mapper.DemoMapper;
import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MapperInvocationHandler implements InvocationHandler {

    private Object obj;

    public MapperInvocationHandler(){}
    public MapperInvocationHandler(Object o){
        obj = o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //return method.invoke(proxy,args);
        System.out.println(method.getName());
        if(method.getName().equals("toString")){
            return null;
        }

        Select select = method.getAnnotation(Select.class);
        System.out.println(select.value()[0]);
        return null;
    }
}
