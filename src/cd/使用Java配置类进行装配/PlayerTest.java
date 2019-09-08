package cd.使用Java配置类进行装配;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author : S K Y
 * @version :0.0.1
 */
public class PlayerTest {
    @Test
    public void runWithJavaConfig(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(PlayerConfig.class);
        MediaPlayer player = applicationContext.getBean("player", MediaPlayer.class);
        player.play();
    }

    @Test
    public void runWithXMLConfig(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PlayerConfig.class);
        MediaPlayer player = context.getBean("player", MediaPlayer.class);
        player.play();
    }

    @Test
    public void runWithXMLAndJavaConfig(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("cd/使用Java配置类进行装配/PlayerConfig.xml");
        MediaPlayer player = context.getBean("player", MediaPlayer.class);
        player.play();
        context.close();
    }

}
