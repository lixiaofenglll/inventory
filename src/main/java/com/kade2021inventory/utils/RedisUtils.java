package com.kade2021inventory.utils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtils {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    /**
     * 判断key是否存在
     * @param key
     * @return
     */
    public Boolean exists(String key){
        if(!"".equals(key) && null != key){
            return redisTemplate.hasKey(key);
        }
        return false;
    }
    /**
     * 设置key和value以及有效期
     * @param key
     * @param obj
     * @param time
     */
    public  void set(String key,Object obj,long time){
        if(time >0){
            redisTemplate.opsForValue().set(key, obj);
        }else{
            redisTemplate.opsForValue().set(key,obj,time, TimeUnit.SECONDS);
        }
    }
    /**
     * 设置key  value
     * @param key
     * @param obj
     */
    public  void set(String key,Object obj){
        redisTemplate.opsForValue().set(key, obj);
    }
    /**
     * 获取key对应的值
     * @param key
     * @return
     */
    public String get(String key){
        if(!"".equals(key) && null != key){
            Object obj = redisTemplate.opsForValue().get(key);
            return obj!= null ? obj.toString() :"";
        }
        return "";
    }

    /**
     * 从redis中获取对象
     * @param key
     * @return
     */
    public Object getByKey(String key){
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 根据key删除数据
     * @param key
     * @return
     */
    public Boolean delete(String key){
        return  redisTemplate.delete(key);
    }

    /**
     * 设置key的有效期
     * @param key
     * @param time
     * @return
     */
    public Boolean expire(String key,long time){
        if(!"".equals(key) && null != key && time >0){
            return redisTemplate.expire(key,time, TimeUnit.SECONDS);
        }
        return false;
    }
}
