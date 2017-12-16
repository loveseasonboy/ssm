import com.dao.BaseDao;
import com.service.TestIService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by hehd on 2017/4/21.
 *
 * @author 何海东
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        TestIService service =ac.getBean("testIService",TestIService.class);
        //BaseDao baseDao;
        //baseDao = ac.getBean("baseDao", BaseDao.class);
        //List<Hospital> list = baseDao.findAll();
        //System.out.println(list.size());
        //Map<String,Object> mapone =baseDao.findOneById(10);
        //System.out.println(mapone.get("name"));
//        Map<String,Object> map =new HashMap();
//        map.put("id",10);
//        map.put("name","中国中医科学院中医门诊部");
//        Map<String,Object> mapone =baseDao.findOne(map);
//        System.out.println(mapone.get("name"));
        //Map<String, Object> map = baseDao.findOneByName("中国中医科学院中医门诊部");
        System.out.println(service.getEntity().get("name"));

//        List<Map<String, Object>> list = baseDao.test1();
//        for (Map map : list) {
//            System.out.println(map.get("na"));
//        }
    }
}
