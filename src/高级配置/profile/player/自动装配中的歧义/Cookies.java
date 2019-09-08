package 高级配置.profile.player.自动装配中的歧义;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Component
@Qualifier("myFavoriteDessert")     //使用自定义的限定符
@MyFavoriteDessert("cookies")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)     //声明为原型
public class Cookies implements Dessert {
    @Override
    public void eat() {
        System.out.println("吃巧克力...");
    }
}
