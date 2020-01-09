package mqtest;

import bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhou_gc@suixingpay.com
 * @description
 * @date 2020/1/9 10:17
 */



@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMQTest {


    @Autowired RabbitTemplate rabbitTemplate;

    @Test
    public void createExchange(){

    }


    @Test
    public void createQueue(){

    }

    @Test
    public void sendMessage(){
            rabbitTemplate.convertAndSend("my01.direct","myqueue01",new Person("hhh",12));
    }

    @Test
    public void consumeMessage(){
           Object o = rabbitTemplate.receiveAndConvert("myqueue01");
        System.out.println(o.getClass());
        System.out.println(o.toString());
    }


}
