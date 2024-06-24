package cn.edu.zust.se;

import cn.edu.zust.se.dto.User;
import cn.edu.zust.se.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: ShenYi
 * @Date: 2024-06-24-21:07
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class IUserServiceTest {
    @Autowired
    private IUserService userService;
    @Test
    public void testSaveUser(){
        User user = new User();
        user.setLoginName("leo");
        user.setPassword("12345678");
        user.setRealName("李豪");
        userService.save(user);
    }
}
