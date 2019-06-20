package com.taotao.web.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/rabbitmq-context.xml");
		RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
//		template.convertAndSend("2019 6 月 15 日 今天是");
		template.convertAndSend("item.update", "2019 6 月 15 日 今天是");
//		template.convertAndSend("2019 6 月 15 日 今天是");

		}
}
