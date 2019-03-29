package mybatis.auth.test;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import mybatis.auth.po.SysUser;

public class TestSys {

	@Test
	public void test() {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = ssf.openSession();
			SysUser user = session.selectOne("mybatis.auth.mapper.SysUserMapper.selectUserById",1);
			System.out.println(user.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
