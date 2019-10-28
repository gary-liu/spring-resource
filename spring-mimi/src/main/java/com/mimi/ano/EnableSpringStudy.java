package com.mimi.ano;

import com.mimi.selector.SpringStudySelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(SpringStudySelector.class)

public @interface EnableSpringStudy {
}
