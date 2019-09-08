package 高级配置.profile.player.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Arrays;


/**
 * @author : S K Y
 * @version :0.0.1
 */
public class MagicExistsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String[] activeProfiles = environment.getActiveProfiles();//获取当前环境中的Profile属性
        for (String activeProfile : activeProfiles) {
            if (activeProfile.equalsIgnoreCase("magic")) {
                return true;
            }
        }
        return false;       //检查magic属性
    }
}
