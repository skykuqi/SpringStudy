package 高级配置.profile.player.自动装配中的歧义;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Configuration
@ComponentScan(basePackages = {"高级配置.profile.player.自动装配中的歧义"})
@PropertySource("classpath:高级配置/profile/player/自动装配中的歧义/dessert.properties")        //引入外部的属性文件
public class AutoWiredConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
