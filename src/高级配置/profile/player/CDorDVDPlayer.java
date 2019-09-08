package 高级配置.profile.player;

/**
 * @author : S K Y
 * @version :0.0.1
 */
public class CDorDVDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    public CDorDVDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
