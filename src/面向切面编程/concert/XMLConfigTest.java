package 面向切面编程.concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:面向切面编程/concert/audienct-config.xml"})
public class XMLConfigTest {
    @Autowired
    private Performance performance;
    @Autowired
    private Host host;
    @Autowired
    private PointcutForMore more;

    @Autowired
    private ApplicationContext context;
    @Autowired
    private MoreForPerformance moreForPerformance;

    @Test
    public void testAudience() {
        performance.perform();
    }

    @Test
    public void testAudienceWithInt() {
        List<String> dancingList = host.getDancingList();
        for (int i = 0; i < dancingList.size(); i++) {
            performance.perform(i, dancingList.get(i));
        }
    }

    @Test
    public void testMoreForPerformance() {
        MoreForPerformance performanceMore = context.getBean("performance", MoreForPerformance.class);
        performanceMore.moreForPerformance();
        Performance performance = context.getBean("performance", Performance.class);
        performance.perform();
    }

}
