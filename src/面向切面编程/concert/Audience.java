package 面向切面编程.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Aspect     //使用@Aspect注解将该类设置为特殊的切面类
public class Audience {
    private String name;

    public Audience(String name) {
        this.name = name;
    }

    @Pointcut("execution(* *.concert.Performance.perform(..))")
    public void performance() {
    }

    public void silenceCellPhone() {     //在表演开始之前,观众需要将他的手机静音
        System.out.println("表演即将开始,观众" + name + "将他的手机设置为了静音状态;");
    }

    public void takeSeats() {
        System.out.println("表演还有5分钟就要开始了,观众" + name + "入座等待;");
    }

    public void applause() {
        System.out.println("表演结束,观众" + name + "为演员们热烈的鼓掌;");
    }

    public void demandRefund() {
        System.out.println("由于线程设备故障,观众" + name + "要求退款....");
    }

//    @Around("performance()")
    public void watchPerform(ProceedingJoinPoint point) {     //观众观看演出
        try {
            System.out.println("表演即将开始,观众" + name + "将他的手机设置为了静音状态;");
            System.out.println("表演还有5分钟就要开始了,观众" + name + "入座等待;");
            point.proceed();
            System.out.println("表演结束,观众" + name + "为演员们热烈的鼓掌;");
        } catch (Throwable throwable) {
            System.out.println("由于线程设备故障,观众" + name + "要求退款....");
        }
    }
}
