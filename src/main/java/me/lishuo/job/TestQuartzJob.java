package me.lishuo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by lis on 16/7/6.
 */
@Component
public class TestQuartzJob {
    @Scheduled(cron = "*/1 * * * * ?")
    public void run() {
        System.out.println("Hello quartz! now ->" + new Date());
    }
}
