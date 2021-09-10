package pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean, DisposableBean {

    public User() {
        System.out.println("User 构造器");
    }

    // 初始化该Bean时会调用此方法，给Bean注入属性之后调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("User 实现Spring初始化方法 -- afterPropertiesSet");
    }

    public void myInit() {
        System.out.println("User 自定义初始化方法 -- myInit");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("User 实现Spring销毁前方法 -- destroy");
    }

    public void myDestroy() {
        System.out.println("User 自定义销毁前方法 -- myDestory");
    }
}
