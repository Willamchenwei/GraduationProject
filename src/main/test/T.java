import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chars.dao.UserDao;
import com.chars.model.User;

@RunWith(SpringJUnit4ClassRunner.class)             
//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring_mybatis.xml"})
public class T {
	@Resource
	public UserDao userDao;
	@Test
	public void chars () {
		User user = userDao.getUser(1);
		System.out.println(user);
	}
}
