package cn.edu.zust.se;

import cn.edu.zust.se.dto.Course;
import cn.edu.zust.se.dto.User;
import cn.edu.zust.se.mapper.CourseMapper;
import cn.edu.zust.se.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShenYi
 * @Date: 2024-06-20-15:54
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MyBatisPlusDemo {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- queryUserById method test ------"));
        List<Long> ids = List.of(1L, 2L, 3L);
        List<User> userList = userMapper.queryUserById(ids);
        userList.forEach(System.out::println);
    }
    @Test
    public void testQueryWrapper(){
        //1.构建查询条件
        QueryWrapper<User> wrapper = new QueryWrapper<User>()
                .select("login_name", "password","real_name")
                .like("real_name", "沈");
        List<User> userList = userMapper.selectList(wrapper);
        System.out.println(userList);
    }
    @Test
    public void testUpdateByQueryWrapper(){
        User user = new User();
        user.setPassword("123456");
        QueryWrapper<User> wrapper = new QueryWrapper<User>()
                .eq("real_name", "张三");
        userMapper.update(user, wrapper);
    }
    @Test
    public void testUpdateWrapper(){
        List<Long> ids = List.of(1L, 2L, 3L);
        UpdateWrapper<Course> wrapper = new UpdateWrapper<Course>()
                .setSql("credit = credit + 1")
                .in("id", ids);
        courseMapper.update(null, wrapper);
    }
    @Test
    public void testLambdaQueryWrapper(){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>()
                .select(User::getLoginName,User::getPassword,User::getRealName)//利用反射机制
                .like(User::getRealName, "沈");
        List<User> userList = userMapper.selectList(wrapper);
        System.out.println(userList);
    }
    @Test
    public void testCustomSqlUpdate(){
        List<Long> ids = List.of(1L, 2L, 3L);
        int amount = 1;
        LambdaUpdateWrapper<Course> wrapper= new LambdaUpdateWrapper<Course>().in(Course::getId, ids);
        courseMapper.updateCourseByIds(wrapper, amount);
    }
}
