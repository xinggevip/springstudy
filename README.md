## Spring study
### stydy01 注入到spring容器的方式
### study02 bean的生命周期
分为创建、初始化、销毁三个阶段
#### 创建
分为单例模式和多例模式

单例模式：Spring默认配置就是单例，此模式下bean随着Spring的创建而创建,想要达到多例的效果机getBean时才创建可以配置bean的lazy-init="true"

多例模式：getBean的时候才会创建

#### 初始化
在Spring创建对象完之后执行的操作
- 实现方式：
  - 实现Spring接口：实现InitializingBean接口的afterPropertiesSet方法
  - 自定义方法：在配置文件中指定初始化方法 init-method="myInit"
- 执行顺序
  先执行实现Spring接口的方法，再执行自定义的方法
### 销毁
在Spring关闭之前执行
- 实现方式
  - 实现Spring接口：实现DisposableBean接口的的方法
  - 自定义方法：在配置文件中指定销毁前方法 destroy-method="myDestroy"
- 销毁细节
  - 销毁方法的操作只适用于 scope="singleton"，初始化操作都适用
  
### 生命周期图示
![](http://img.qiangssvip.com/img/everyday/Spring%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F.png)

### 配置文件参数化
把Spring的xml中配置的参数抽到properities文件中
```properties
jdbc.driverClassName = com.mysql.jdbc.Driver
jdbc.url = jdbc:mysql://localhost:3306/spring?useSSL=false
jdbc.username = root
jdbc.password = 1234
```
Spring 的配置文件与小配置文件进行整合：
```xml
<!--Spring的配置文件与⼩配置文件进行整合-->
<!--resources 下的文件在整个程序编译完后会被放到 classpath 目录下，src.main.java中的文件也是-->
<context:property-placeholder location="classpath:/db.properties"/>
```