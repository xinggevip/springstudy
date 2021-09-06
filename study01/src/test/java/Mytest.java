import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.MyFactoryBean;
import pojo.Person;

import java.sql.Connection;


public class Mytest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

    /**
     * set注入获取Bean
     */
    @Test
    public void test01() {
        Person p1 = applicationContext.getBean("p1", Person.class);
        System.out.println(p1);
    }

    /**
     * 构造器获取Bean
     */
    @Test
    public void test02() {
        Person p2 = applicationContext.getBean("p2", Person.class);
        System.out.println(p2);
    }

    /**
     * 工厂Bean获取Bean
     */
    @Test
    public void test03() {
        Connection conn = applicationContext.getBean("conn", Connection.class);

        System.out.println("conn" + conn);
    }

    /**
     * 获取工厂Bean
     */
    @Test
    public void test04() {
        MyFactoryBean factoryBean = applicationContext.getBean("&conn", MyFactoryBean.class);
        System.out.println("factoryBean" + factoryBean);
    }

    /**
     * 实例工厂获取Bena
     */
    @Test
    public void test05() {
        Connection conn2 = applicationContext.getBean("conn2", Connection.class);
        System.out.println("conn2" + conn2);
    }

    /**
     * 静态工厂获取Bean
     */
    @Test
    public void test06() {
        Connection conn3 = applicationContext.getBean("conn3", Connection.class);
        System.out.println("conn3" + conn3);
    }






}
