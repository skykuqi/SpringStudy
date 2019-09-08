package knights;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : S K Y
 * @version :0.0.1
 */
public class ApplicationContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = applicationContext.getBean("knight", Knight.class);
        knight.embarkOnQuest();

    }
}
