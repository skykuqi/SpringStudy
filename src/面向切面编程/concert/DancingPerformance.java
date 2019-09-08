package 面向切面编程.concert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : S K Y
 * @version :0.0.1
 */
public class DancingPerformance implements Performance {

    @Override
    public void perform() {
        System.out.println("演员们表演精彩的舞蹈...");
    }

    @Override
    public void perform(int index, String name) {
        System.out.println("演员们表演精彩的" + name + "...");
    }

}
