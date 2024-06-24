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





```

```

​			

​		
