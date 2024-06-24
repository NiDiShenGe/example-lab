package cn.edu.zust.se.mapper;

import cn.edu.zust.se.dto.Course;
import cn.edu.zust.se.dto.User;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @Author: ShenYi
 * @Date: 2024-06-20-15:52
 * @Description:
 */

public interface UserMapper extends BaseMapper<User>{
    List<User> queryUserById(@Param("ids") List<Long> ids);
}
