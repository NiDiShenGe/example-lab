package cn.edu.zust.se.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: ShenYi
 * @Date: 2024-06-20-14:22
 * @Description:
 */
@Data
@TableName("course_arrange")
public class CourseArrange {
    private Long id;
    private Long courseId;
    private Long teacherId;
    private String courseTime;
    private String coursePlace;
    private Integer maxNum;
    private Integer selectedNum;
}
