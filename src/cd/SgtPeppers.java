package cd;

import org.springframework.stereotype.Component;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Component("myPeppers")      //使用@Component注解将告知Spring为这个类创建bean
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("SgtPeppers播放中....");
    }
}
