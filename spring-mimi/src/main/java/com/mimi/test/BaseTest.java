package com.mimi.test;

import com.mimi.app.AppConfig;
import com.mimi.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BaseTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao indexDao = applicationContext.getBean(IndexDao.class);
		indexDao.query();


	}
}
