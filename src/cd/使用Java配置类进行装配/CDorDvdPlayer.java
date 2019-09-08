package cd.使用Java配置类进行装配;


/**
 * @author : S K Y
 * @version :0.0.1
 */
public class CDorDvdPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    public CDorDvdPlayer() {
    }

    public CDorDvdPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }

    public CompactDisc getCompactDisc() {
        return compactDisc;
    }

    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }
}
