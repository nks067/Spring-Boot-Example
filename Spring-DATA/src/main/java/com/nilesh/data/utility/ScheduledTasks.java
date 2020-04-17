package com.nilesh.data.utility;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nilesh.data.entity.Employee;
import com.nilesh.data.model.Students;
import com.nilesh.data.mongo.repository.StudentNoSqlRepositery;
import com.nilesh.data.mysql.repository.EmployeeSQLRepository;

@Component
public class ScheduledTasks {
	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
   
    
    @Scheduled(initialDelay=1,fixedRate = 5000)
	public void task1() {
		 log.debug("Scheduler The time is now {mongo insert scheduller}", dateFormat.format(new Date()));
	}
    
    @Scheduled(cron="*/10 * * * * *")
	public void task2() {
		 log.debug("Ceon The time is now {mongo insert scheduller}", dateFormat.format(new Date()));
	}
    
    
    
    
    
   
			

}
