package cn.edu.zust.se.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: ShenYi
 * @Date: 2024-06-20-14:19
 * @Description:
 */
@Data
@TableName("course")
public class Course {
    private Long id;
    private String name;
    private Float credit;
    private Integer type;
}
