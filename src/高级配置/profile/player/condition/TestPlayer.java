package 高级配置.profile.player.condition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import 高级配置.profile.player.MediaPlayer;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PlayerConfig.class})
@ActiveProfiles("magic")
public class TestPlayer {
    @Autowired
    private ApplicationContext context;

    @Test
    public void TestMagic(){
        MediaPlayer player = context.getBean("player", MediaPlayer.class);
        player.play();
    }
}
