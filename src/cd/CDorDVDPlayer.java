package cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Component("CDorDVDPlayer")
public class CDorDVDPlayer {
    private CompactDisc compactDisc;
    private String content;
    @Autowired      //@AutoWired注解可以使用在构造器上,这样bean ID为myPeppers的bean将会为这个构造器自动装配进去
    public CDorDVDPlayer(CompactDisc myPeppers) {
        this.compactDisc = myPeppers;
    }

    public void play() {
        compactDisc.play();
    }

}
