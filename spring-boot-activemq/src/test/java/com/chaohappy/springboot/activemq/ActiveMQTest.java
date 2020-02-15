package com.chaohappy.springboot.activemq;

import com.chaohappy.springboot.SpringBootActivemqApplication;
import com.chaohappy.springboot.activemq.queue.Queue_Produce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = SpringBootActivemqApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ActiveMQTest {
    @Autowired
    private Queue_Produce queueProduce;

    @Test
    public void testSend() {
        queueProduce.produceMsg();
    }
}
