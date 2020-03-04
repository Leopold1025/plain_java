package redis.clients.jedis;

import java.util.Iterator;
import java.util.Set;

public class RedisKeysJava {
    public static void main(String[] args) {
        //连接本地 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功！");
        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it = keys.iterator();
        System.out.println("Redis服务器上共有" + keys.size() + "个key: ");
        while (it.hasNext()){
            String key = it.next();
            System.out.print(key + "/ ");
        }
    }
}
