# 技术小册

### 1.设计模式

​	目前实现了七种设计模式（课程实验要求）以后会尽量补全

​	参考链接：[设计模式 | 菜鸟教程 (runoob.com)](https://www.runoob.com/design-pattern/design	-pattern-tutorial.html)

### 2.Mybatis-Plus Demo

@TableField的常见场景：

成员变量名与数据库字段名不一致

成员变量名以is开头，且是布尔值

成员变量名与数据库关键字冲突，使用转义字符，如：

```java
@TableFidld("`order`")
private Integer order;

```

成员变量不是数据库字段

```java
@TableField(exist = false)
```

Mapper的xml文件要放在resources目录下，不然不会被编译



##### Wrapper条件构造器

包含四种构造器：

- QueryWrapper
- UpdateWrapper
- LambdaQueryWrapper
- LambdaUpdateWrapper



##### Service接口

###### 删和改

update/remove的ByIds和BatchByIds的区别：

- ByIds在sql语句上使用的是 id in（）
- BatchByIds在sql语句上使用的是 id = ，然后进行批量提交
- 在大批量的数据情况下，BatchByIds的性能优于ByIds

###### 查

查一个调用get，查多个调用list，查数量调count

###### 使用流程

- 自定义Service接口继承IService接口

  ```java
  public interface IUserService extends IService<User>{}
    
  ```

- 自定义Service实现类，实现自定义接口并继承ServiceImpl类

  ```java
  public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {}
  
  ```

##### 关于数据库create_time、update_time和deleted的处理

对于create_time和update_time，在数据库里设置默认值为CURRENT_TIMESTAMP。deleted设置默认值为0

建议在创建DO的时候先创建一个BaseDO，然后其他的全部继承BaseDO

```java
@TableField(fill = FieldFill.INSERT)
private LocalDateTime createTime;
  
@TableField(fill = FieldFill.INSERT_UPDATE)
private LocalDateTime updateTime;
    
@TableLogic
private Boolean deleted;
```

​		

​		
