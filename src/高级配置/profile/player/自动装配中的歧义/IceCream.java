package 高级配置.profile.player.自动装配中的歧义;

import org.springframework.stereotype.Component;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Component
public class IceCream implements Dessert {
    @Override
    public void eat() {
        System.out.println("吃冰激凌...");
    }
}
