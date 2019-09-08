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
@ContextConfiguration(locations = {"classpath:高级配置/profile/player/player.xml"})
@ActiveProfiles("test")
public class XMLConfigTest {
    @Autowired
    private ApplicationContext context;
    @Test
    public void testXMLPlayer() {
        MediaPlayer player = context.getBean("player", MediaPlayer.class);
        player.play();
    }
}
