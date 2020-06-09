import com.mapper.UsersMapper;
import com.model.Users;
import com.utils.LianDB;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersTest {

    Logger logger = Logger.getLogger(UsersTest.class);

    @Test   /*根据ID查表*/
    public void test() {
        SqlSession sqlSession = LianDB.getesqlSession();
        UsersMapper userMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = userMapper.getUsers(2);
        System.out.println(users);
        LianDB.closesqlSession(sqlSession);
    }

    @Test   /*增加用户,增删改一定要提交事务*/
    public void adduser() {
        //开启会话
        SqlSession sqlSession = LianDB.getesqlSession();
        UsersMapper userMapper = sqlSession.getMapper(UsersMapper.class);
        // int num = userMapper.addUser(new Users(3, "zhang2", "zhang2"));
        //关闭数据流
        LianDB.closesqlSession(sqlSession);
    }

    @Test   /*log日志*/
    public void testLog() {
        logger.info("info");
        logger.debug("debug");
        logger.debug("eror");
    }

    @Test   /*多对一,查所有用户*/
    public void duoDuiYi() {
        SqlSession sqlSession = LianDB.getesqlSession();
        UsersMapper userMapper = sqlSession.getMapper(UsersMapper.class);
        List<Users> list = userMapper.getUsersSex();
        for (Users uu : list) {
            System.out.println(uu);
        }
        LianDB.closesqlSession(sqlSession);
    }

    @Test   /*分页*/
    public void javaSE() {
        SqlSession sqlSession = LianDB.getesqlSession();
        UsersMapper userMapper = sqlSession.getMapper(UsersMapper.class);
        Map map = new HashMap();
        map.put("startIndex", 0);
        map.put("pageSize", 3);
        List<Users> list = userMapper.getLimitUsers(map);
        for (Users uu : list) {
            System.out.println(uu);
        }
        LianDB.closesqlSession(sqlSession);
    }

    @Test   /*动态语句*/
    public void DongTai() {
        SqlSession sqlSession = LianDB.getesqlSession();
        UsersMapper userMapper = sqlSession.getMapper(UsersMapper.class);
        List<Users> list = userMapper.getDongTai("e");
        for (Users uu : list) {
            System.out.println(uu);
        }
        LianDB.closesqlSession(sqlSession);
    }
}
