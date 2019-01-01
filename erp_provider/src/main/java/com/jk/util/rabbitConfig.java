/**
 * Copyright (C),2018
 * FileName: 段国强
 * Author:   admin
 * Date:     2018/12/25 11:35
 * Description: rabbitmq
 * History:
 */
package com.jk.util;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈rabbitmq〉
 * @author admin
 * @create 2018/12/25
 * @since 1.0.0
 */
@Configuration
public class rabbitConfig {


    @Bean
    public Queue queueMessage(){

        return new Queue("addUserTest");
    }



    @Bean
    public Queue queueMessage1(){
        return  new Queue("topic_1");
    }


    @Bean
    public Queue queueMessage2(){
        return  new Queue("topic_2");
    }


     // 交换机
    @Bean
    TopicExchange exchange(){
        return new TopicExchange("exchage_topic");
    }


    //Direct交换机的绑定

    @Bean
    Binding bindingExchangeMessage(Queue queueMessage1, TopicExchange exchange){
        return BindingBuilder.bind(queueMessage1).to(exchange).with("topic.add");
    }

    @Bean
    Binding bindingExchangeMessage1(Queue queueMessage1, TopicExchange exchange){
        return BindingBuilder.bind(queueMessage1).to(exchange).with("topic.delete");
    }

    //Topic交换机的绑定
    @Bean
    Binding bindingExchangeMessages(Queue queueMessage2, TopicExchange exchange){
        return BindingBuilder.bind(queueMessage2).to(exchange).with("topic.#");
    }


}
