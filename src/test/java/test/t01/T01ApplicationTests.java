package test.t01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import test.t01.Service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("test.t01.Dao")
public class T01ApplicationTests {
@Autowired
private UserService userService;
    @Test
    public void contextLoads() {
        System.out.println("测试"+userService.getSomething().get(0).getPassword());
    }

}
