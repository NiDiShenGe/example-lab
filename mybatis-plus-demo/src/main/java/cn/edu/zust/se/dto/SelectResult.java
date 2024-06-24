package cn.edu.zust.se.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

/**
 * @Author: ShenYi
 * @Date: 2024-06-20-14:25
 * @Description:
 */
@Data
@TableName("select_result")
public class SelectResult {
    private Long id;
    private Long courseArrangeId;
    private Long studentId;
    private LocalDateTime selectTime;
}
