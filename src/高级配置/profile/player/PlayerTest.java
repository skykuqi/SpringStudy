package 高级配置.profile.player;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PlayerConfig.class})
@ActiveProfiles("test")
public class PlayerTest {
    @Autowired      //在Spring test中使用此方法可以自动装配我们的配置文件,为了确保成功我们应该使用接口ApplicationContext
    private ApplicationContext context;

    @Test
    public void testPlayer() {
        MediaPlayer player = context.getBean("player", MediaPlayer.class);
        player.play();
    }


}
