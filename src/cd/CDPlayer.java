package cd;

import org.springframework.stereotype.Component;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Component("cdPlayer")
public class CDPlayer implements CompactDisc {
    @Override
    public void play() {
        System.out.println("CDPlayer播放....");
    }
}
