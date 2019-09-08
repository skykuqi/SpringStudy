package cd.使用Java配置类进行装配;

import java.util.List;

/**
 * @author : S K Y
 * @version :0.0.1
 */
public class MyDVD implements CompactDisc {
    private String title;       //当前这个CD的标题名称
    private long time;          //当前CD的播放时长
    private List<String> musicList;     //歌曲清单

    public MyDVD() {
    }

    public MyDVD(String title, long time) {
        this.title = title;
        this.time = time;
    }

    public MyDVD(String title, long time, List<String> musicList) {
        this.title = title;
        this.time = time;
        this.musicList = musicList;
    }

    @Override
    public void play() {
        System.out.println("现在播放的是我最喜欢的DVD,DVD名称为: " + title + " 可播放时长为: " + time + "分钟" +
                " 歌曲清单为: " + musicList);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public List<String> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<String> musicList) {
        this.musicList = musicList;
    }
}
