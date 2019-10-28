package com.mimi;

import com.mimi.app.AppConfig;
import com.mimi.model.Student;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportSelectorTest {

	/*org.springframework.beans.factory.support.DefaultListableBeanFactory@36060e:
	defining beans
	[org.springframework.context.annotation.internalConfigurationAnnotationProcessor,
	org.springframework.context.annotation.internalAutowiredAnnotationProcessor,
	org.springframework.context.annotation.internalCommonAnnotationProcessor,
	org.springframework.context.event.internalEventListenerProcessor,
	org.springframework.context.event.internalEventListenerFactory,
	appConfig]; root of factory hierarchy*/

	@Test
	public void testImportSelector() {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);

		Student student = applicationContext.getBean(Student.class);

		System.out.println(student.getName());

	}

}
