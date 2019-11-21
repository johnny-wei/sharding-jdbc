package com.example.shardingjdbc;

import com.example.shardingjdbc.dao.base.OrderBaseMapper;
import com.example.shardingjdbc.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbcApplicationTests {
    @Autowired
    private OrderBaseMapper orderMapper;
    @Test
    public void contextLoads() {
        for (long i=0;i<10;i++){
            Order tempOrder= Order.Build()
                    .id(i)
                    .order_id(i)
                    .user_id(i)
                    .build();
            orderMapper.insertOrder(tempOrder);

        }

    }
    @Test
    public void query(){

        orderMapper.queryOrder(new Order()).forEach(System.out::println);

    }



}
