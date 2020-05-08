package com.scnu.zzq.factorybean;

import com.scnu.zzq.mapper.DemoMapper;
import com.scnu.zzq.proxy.MapperProxy;
import org.springframework.beans.factory.FactoryBean;


public class DemoMapperFactoryBean implements FactoryBean {

    public Object getObject() throws Exception {
        return MapperProxy.getMapper(DemoMapper.class);
    }

    public Class<?> getObjectType() {
        return DemoMapper.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
