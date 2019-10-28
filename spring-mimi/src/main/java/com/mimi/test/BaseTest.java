package com.mimi.test;

import com.mimi.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BaseTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext();

		/*把一个class转成bd(beanDefinition),最后到Map
		 * map位置 DeafualtListtableBeanFactory的属性
		 * beanDefinitionMap*/
		applicationContext.register(IndexDao.class);
		applicationContext.refresh();

		IndexDao indexDao = applicationContext.getBean(IndexDao.class);
		indexDao.query();


	}
}
