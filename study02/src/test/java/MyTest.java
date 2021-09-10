import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class MyTest {

    @Test
    public void test01() {
        /**
         * User 构造器
         * User 实现Spring初始化方法 -- afterPropertiesSet
         * User 自定义初始化方法 -- myInit
         * User 实现Spring销毁前方法 -- destroy
         * User 自定义销毁前方法 -- myDestory
         */
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        User user1 = classPathXmlApplicationContext.getBean("user1", User.class);
        classPathXmlApplicationContext.close();


    }
}
