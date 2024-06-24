package cn.edu.zust.se;

import cn.edu.zust.se.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: ShenYi
 * @Date: 2024-06-20-16:17
 * @Description:
 */
@SpringBootApplication
@MapperScan("cn.edu.zust.se.mapper")
public class MybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }
}
