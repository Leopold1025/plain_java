package redis.clients.jedis;

public class RedisStringJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功！");
        //设置 redis 字符串数据
        jedis.set("w3ckey", "www.w3cschool.cn");
        jedis.set("myname", "Lipeng");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: " + jedis.get("w3ckey"));
    }
}
