package 高级配置.profile.player.自动装配中的歧义;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AutoWiredConfig.class})
public class DessertTest {
    @Autowired
    @Qualifier("myFavoriteDessert")      //优先级高于primary属性即@Primary注解
    @MyFavoriteDessert("cake")
    private Dessert dessert;

    @Autowired
    private ApplicationContext context;
    @Autowired
    private Environment environment;
    @Test
    public void eatDessert() {
        dessert.eat();
    }
    @Test
    public void testScope(){
        Dessert cakeA = context.getBean("cake", Dessert.class);
        Dessert cookiesA = context.getBean("cookies", Dessert.class);
        Dessert cakeB = context.getBean("cake", Dessert.class);
        Dessert cookiesB = context.getBean("cookies", Dessert.class);
        System.out.println(cakeA + " " + cakeB);
        System.out.println(cookiesA + " " + cookiesB );
    }
    @Test
    public void testProperties(){
        Dessert cake = context.getBean("cake", Dessert.class);
        cake.eat();
    }
}
