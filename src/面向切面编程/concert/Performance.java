package 面向切面编程.concert;

/**
 * @author : S K Y
 * @version :0.0.1
 */
public interface Performance {
    /**
     * 进行表演
     */
    void perform();

    /**
     * 在拥有多个表演的节目的时候,表演当前指定的节目
     *
     * @param index 当前指定的节目的索引
     * @param name  当前表演的节目的名称
     */
    void perform(int index, String name);
}
