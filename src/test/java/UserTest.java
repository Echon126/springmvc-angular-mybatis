import java.util.List;

import com.weibo.dashboard.service.impl.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.weibo.dashboard.entity.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:conf/spring-mybatis.xml"})
public class UserTest {
	@Autowired
	UserService us;
	@Test
	public void testAdd(){
		User user = new User();
		user.setName("test");
		user.setPassword("testpd");
		int res= us.insert(user);
		System.out.println(res);
	}
	@Test
	public void selectUser(){
		User use = us.select("");
		System.out.println(use.getName()+use.getPassword());
	}
	@Test
	public void selectList(){
		List<User>ls = us.selectUserList();
		for(int i=0;i<ls.size();i++){
			System.out.println(ls.get(i));
		}
	}
}

