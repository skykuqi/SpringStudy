package knights;

/**
 * @author : S K Y
 * @version :0.0.1
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight() {
    }

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }


    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}