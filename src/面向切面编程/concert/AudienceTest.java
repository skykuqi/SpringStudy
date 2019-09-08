package 面向切面编程.concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AudienceConfig.class)
public class AudienceTest {

    @Autowired
    private Performance performance;

    @Test
    public void testAudienceA() {
        performance.perform();
    }
}
