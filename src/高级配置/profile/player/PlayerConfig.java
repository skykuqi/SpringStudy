package 高级配置.profile.player;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Configuration
public class PlayerConfig {
    @Bean("compactDisc")
    @Profile("test")        //此时是在测试开发环境之中
    public CompactDisc testCompact() {
        return new MyDVD();
    }

    @Bean("compactDisc")
    @Profile("run")         //此时是在线上运行环境之中
    public CompactDisc runCompact() {
        return new MyCD();
    }

    @Bean("player")
    public MediaPlayer player(CompactDisc compactDisc) {
        return new CDorDVDPlayer(compactDisc);
    }

}
