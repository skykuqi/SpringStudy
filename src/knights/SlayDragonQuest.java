package knights;

import java.io.PrintStream;

/**
 * @author : S K Y
 * @version :0.0.1
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("骑士接收到任务去击败恶龙");
    }
}
