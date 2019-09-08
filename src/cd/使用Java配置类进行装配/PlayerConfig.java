package cd.使用Java配置类进行装配;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Configuration      //声明此类为Java配置文件
//@ImportResource("classpath:cd/使用Java配置类进行装配/PlayerConfig.xml")        //引入XML配置文件
//@Import({PlayerConfig.class})         //引入JavaConfig配置文件
public class PlayerConfig {
    @Bean("player")
    public MediaPlayer player(CompactDisc myDVD) {
        return new CDorDvdPlayer(myDVD);
    }
}
