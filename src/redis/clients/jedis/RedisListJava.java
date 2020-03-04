package redis.clients.jedis;

import java.util.Arrays;
import java.util.List;

public class RedisListJava {
    public static void main(String[] args) {
        //连接本地 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功！");
        //存储数据到列表中
        jedis.lpush("tutorial-list", "Redis", "MongoDB", "Mysql");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("tutorial-list", 0, 2);
        for (int i = 0; i < list.size(); i ++){
            System.out.println("列表项为：" + list.get(i));
        }
    }
}
