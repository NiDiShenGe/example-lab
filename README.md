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

### 3.Lombok

- `@NoArgsConstructor`：自动生成无参构造方法。

- `@AllArgsConstructor`：自动生成全参构造方法。

- `@Data`：结合了 `@Getter`、`@Setter`、`@ToString`、`@EqualsAndHashCode` 的功能，简化了实体类的编写。

- `@Builder` ：可以自动生成一个建造者模式相关的代码，使得对象的构建更加简洁和易读。

  ```Java
  @Builder
  public class Person {
      private String name;
      private int age;
      private String address;
  }
  Person person = Person.builder()
                        .name("张三")
                        .age(25)
                        .address("北京")
                        .build();
  ```
  
- @SneakyThrows ：用于在方法上自动添加异常处理。它的作用是在方法体中自动捕获并处理异常，将异常转换为非受检异常（Unchecked Exception）并抛出。简化代码，避免在方法体中显式地编写 try-catch 块来处理异常。

  ```Java
  public class Example {
      @SneakyThrows
      public void doSomething() {
          // 可能会抛出受检异常的代码
      }
  }
  ```

  

### 4.JSON（主要以jackson为主）

json是一个字符串。jsonNode是一个对象，jsonNode中都是键值对形式，可以根据Key取出对应的值。jsonObject是一个对象。
