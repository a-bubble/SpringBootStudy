package test.t01.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.t01.Dao.UserDao;
import test.t01.entity.User;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public List<User> getSomething(){
        return userDao.getInfo();
    }
}
