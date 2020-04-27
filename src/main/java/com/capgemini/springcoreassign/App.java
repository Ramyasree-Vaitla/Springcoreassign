package com.capgemini.springcoreassign;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.sprigcoreassign.bean.MessageBean;
import com.capgemini.springcoreassign.config.MessageConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=	new AnnotationConfigApplicationContext(MessageConfig.class);

		 MessageBean mb=context.getBean(MessageBean.class); 
		 mb.print();
	}


    
    
    
    }
