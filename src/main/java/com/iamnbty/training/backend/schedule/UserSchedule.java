package com.iamnbty.training.backend.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class UserSchedule {
    private static final Logger logger = LoggerFactory.getLogger(UserSchedule.class);
    /**
     * 1 => second
     *     2 => minute
     *     3 => hour
     *     4 => day
     *     5 => month
     *     6 => year
     */

//    @Scheduled(cron = "0 */5 * * * *")
//    public void testEveryMinite() {
//
//    }

    /**
     * Every day at 00:00
     */
    @Scheduled(cron = "0 11 17 * * *", zone = "Asia/Bangkok")
    public void testEveryMidNight() {
        logger.info("Hello, what's up? testEveryMidNight");
    }
}
