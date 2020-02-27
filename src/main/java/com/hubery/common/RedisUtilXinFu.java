//package com.hubery.common;
//
//import io.lettuce.core.dynamic.annotation.Value;
//import org.springframework.stereotype.Component;
//import redis.clients.jedis.Jedis;
//
///**
//* 存储数据到缓存中,并制定过期时间和当Key存在时是否覆盖。
//* @author kgh
//* nxxx的值只能取NX或者XX,如果取NX,则只有当key不存在是才进行set,如果取XX,则只有当key已经存在时才进行set
//*  expx的值只能取EX或者PX,代表数据过期时间的单位,EX代表秒,PX代表毫秒。
//*  过期时间,单位是expx所代表的单位。
//* @return
//*/
//@Component
//public class RedisUtilXinFu {
//    //private static Logger  logger= Logger.getLogger(RedisUtil.class);
//
//
//	public static Boolean setKV(String key , String value, Boolean  ifOverride,String expx, int time) {
//
//	     String host =AliRedisConfig.aliRedisHost;
//	     int port = AliRedisConfig.aliRedisPort;
//	     Jedis jedis = new Jedis(host, port);
//	     //鉴权信息
//		//password
//	     jedis.auth(AliRedisConfig.aliRedisPassword);
//
//		//如果key已存在
//	     if(jedis.exists(key))
//	     {
//			 // 且不选择"覆盖原值"，则退出
//	    	 if(!ifOverride)
//	    	 {
//			     jedis.close();
//		    	 return false;
//	    	 }
//	     }
//
//	     //select db默认为0
//	     jedis.select(1);
//
//	     /*jedis.set(key, value);*/
//	     jedis.setex(key, time, value);
//	        logger.debug("【setKV】, key=:" + key + ", value=" + value);
//
//	     jedis.quit();
//	     jedis.close();
//
//    	 return true;
//
//	}
//
//	public static String getKV(String key) {
//
//	     String host =AliRedisConfig.aliRedisHost;
//	     int port = AliRedisConfig.aliRedisPort;
//	     Jedis jedis = new Jedis(host, port);
//	     //鉴权信息
//		//password
//	     jedis.auth(AliRedisConfig.aliRedisPassword);
//
//	     //select db默认为0
//	     jedis.select(1);
//
//
//	     String rtn = jedis.get(key);
//
//	     jedis.quit();
//	     jedis.close();
//
//    	 return rtn;
//
//	}
//}
