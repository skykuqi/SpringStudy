package 面向切面编程.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Configuration
@EnableAspectJAutoProxy     //启用AspectJ的自动代理
@ComponentScan(basePackages = {"面向切面编程.concert"})
public class AudienceConfig {
    @Bean
    public Audience audienceA() {
        return new Audience("观众A");
    }

    @Bean
    public Performance performance() {
        return new DancingPerformance();
    }
}
