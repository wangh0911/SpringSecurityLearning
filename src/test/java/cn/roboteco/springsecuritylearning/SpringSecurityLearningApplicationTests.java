package cn.roboteco.springsecuritylearning;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringSecurityLearningApplicationTests {

    @Test
    public void contextLoads() {
        long refreshPeriodTime = 36000L;  //seconds为单位,10 hours
        System.out.println(refreshPeriodTime >> 1);
    }

}
