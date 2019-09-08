package cd.test;

import cd.CDPlayer;
import cd.CDPlayerConfig;
import cd.CDorDVDPlayer;
import cd.CompactDisc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.Serializable;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)     //需要使用spring-test-4.3.4.RELEASE.jar
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc myPeppers;

    @Test
    public void myPeppersShouldNotBeNull() {
        Assert.assertNotNull(myPeppers);
    }

    @Test
    public void getBeanByID() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CompactDisc myPeppers = context.getBean("myPeppers", CompactDisc.class);
        myPeppers.play();
    }

    @Test
    public void bothShouldNotBeNull() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CompactDisc myPeppers = context.getBean("myPeppers", CompactDisc.class);
        CompactDisc cdPlayer = context.getBean("cdPlayer", CompactDisc.class);
        myPeppers.play();
        cdPlayer.play();
    }

    @Test
    public void testCDorDVDPlayer() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CDorDVDPlayer cDorDVDPlayer = context.getBean("CDorDVDPlayer", CDorDVDPlayer.class);
        cDorDVDPlayer.play();
        context.close();
    }
}
