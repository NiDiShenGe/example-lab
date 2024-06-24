package cn.edu.zust.se.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: ShenYi
 * @Date: 2024-06-20-14:15
 * @Description:
 */
@Data
@TableName("user")
public class User {
    private Long id;
    private String loginName;
    private String password;
    private String realName;
    private Integer type;
}
