package com.cronjob.demoCronJob;

import com.cronjob.demoCronJob.service.CronJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class DemoCronJobApplication {
	@Autowired
	private final CronJobService cronJobService;

    public DemoCronJobApplication(CronJobService cronJobService) {
        this.cronJobService = cronJobService;
    }

    public static void main(String[] args) {
		SpringApplication.run(DemoCronJobApplication.class, args);
	}

	// */10 * * * * *   (10 detik sekali)
	//0 0 6,19 * * *    (6:00 AM and 7:00 PM every day)
	@Scheduled(cron = "*/10 * * * * *")
	public void execute() {
		cronJobService.tesCron();
	}

}
