package 高级配置.profile.player.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import 高级配置.profile.player.*;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Configuration
public class PlayerConfig {
    @Bean("player")
    @Conditional(MagicExistsCondition.class)
    public MediaPlayer player(CompactDisc compactDisc) {
        return new CDorDVDPlayer(compactDisc);
    }

    @Bean("compactDisc")
    @Profile("magic")
    public CompactDisc myDVD() {
        return new MyDVD();
    }

    @Bean("compactDisc")
    @Profile("test")
    public CompactDisc myCD() {
        return new MyCD();
    }
}
