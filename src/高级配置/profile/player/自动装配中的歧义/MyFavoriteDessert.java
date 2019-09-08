package 高级配置.profile.player.自动装配中的歧义;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface MyFavoriteDessert {
    String value();
}
