package 面向切面编程.concert;

import org.aspectj.lang.annotation.DeclareParents;

/**
 * @author : S K Y
 * @version :0.0.1
 */
public class PointcutForMore {
    @DeclareParents(value = "面向切面编程.concert.Performance+", defaultImpl = MoreForPerformanceImpl.class)
    public static MoreForPerformance more;
}
