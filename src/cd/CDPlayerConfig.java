package cd;

import knights.Knight;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : S K Y
 * @version :0.0.1
 */
@Configuration
@ComponentScan(basePackageClasses = {CompactDisc.class,CDorDVDPlayer.class})
public class CDPlayerConfig {
}
