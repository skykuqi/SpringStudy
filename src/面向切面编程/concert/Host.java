package 面向切面编程.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.List;

/**
 * @author : S K Y
 * @version :0.0.1
 */
public class Host {
    private List<String> dancingList;

    private void performance(int index, String name) {
    }

    public void host(int index, String name) {
        System.out.println("[主持人]:当前为大家带来的是第" + (index + 1) + "个表演" + name +
                ".请大家欣赏;");
    }

    public List<String> getDancingList() {
        return dancingList;
    }

    public void setDancingList(List<String> dancingList) {
        this.dancingList = dancingList;
    }
}
