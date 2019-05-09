package com.qf.pet.common.util;

import com.google.common.annotations.Beta;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 *@Author feri
 *@Date Created in 2019/4/25 10:14
 */
@Configuration
public class JedisUtil {
    private JedisPool jedisPool;
    public JedisUtil(){
        JedisPoolConfig config=new JedisPoolConfig();
        config.setMaxIdle(300);//空闲时间
        config.setMaxTotal(1000);//最大连接
        config.setMinIdle(100);
        jedisPool=new JedisPool(config,"39.105.189.141",6379,1000,"qfjava");
    }
    //新增
    public String setStr(String key,String value){
        return jedisPool.getResource().set(key,value);
    }
    public String setStr(String key,String value,int seconds){
        return jedisPool.getResource().setex(key,seconds,value);
    }
    public Long setHash(String key,String field,String value){
        return jedisPool.getResource().hset(key,field,value);
    }
    //删除
    public void delKey(String... keys){
        jedisPool.getResource().del(keys);
    }

    //修改
    //查询
    public String getStr(String key){
        return jedisPool.getResource().get(key);
    }
    //系统
    public void setExpire(String key,int seconds){
        jedisPool.getResource().expire(key,seconds);
    }

   public boolean isExists(String key){
        return jedisPool.getResource().exists(key);
   }
}
