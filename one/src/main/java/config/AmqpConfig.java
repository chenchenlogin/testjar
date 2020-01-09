package config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhou_gc@suixingpay.com
 * @description
 * @date 2020/1/9 11:05
 */


@Configuration
public class AmqpConfig {



    @Bean
    public MessageConverter getMessageConvert(){
        return new Jackson2JsonMessageConverter();
    }

}
