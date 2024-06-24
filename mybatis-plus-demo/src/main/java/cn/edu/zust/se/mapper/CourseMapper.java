package cn.edu.zust.se.mapper;

import cn.edu.zust.se.dto.Course;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: ShenYi
 * @Date: 2024-06-24-20:09
 * @Description:
 */
public interface CourseMapper extends BaseMapper<Course> {
    public void updateCourseByIds(@Param("ew")LambdaUpdateWrapper<Course> updateWrapper, @Param("amount") int amount);
}
