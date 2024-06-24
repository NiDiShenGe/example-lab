package cn.edu.zust.se.service.impl;

import cn.edu.zust.se.dto.User;
import cn.edu.zust.se.mapper.UserMapper;
import cn.edu.zust.se.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author: ShenYi
 * @Date: 2024-06-24-21:03
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
