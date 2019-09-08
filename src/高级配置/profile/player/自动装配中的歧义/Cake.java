package 高级配置.profile.player.自动装配中的歧义;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Component
@Qualifier("myFavoriteDessert")     //使用自定义的限定符
@MyFavoriteDessert("cake")
public class Cake implements Dessert {
    private String name;

    public Cake(@Value("#{systemProperties['os.name']}") String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("吃" + name + "....");
    }
}
