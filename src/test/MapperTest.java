import com.microbridge.workspace.bean.license;
import com.microbridge.workspace.dao.licenseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试dao层的工作
 * spring单元测试，自动注入
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/applicationContext.xml" })
public class MapperTest {

    @Autowired
    licenseMapper licenseMapper;
    /**
     * 测试licenseMapper
     */
    @Test
    public void testCRUD(){

//        //1.创建SpringIOC容器
//        ApplicationContext ioc =new ClassPathXmlApplicationContext(applicationContext.xml);
//        //2.从容器中拿到mapper
//        licenseMapper bean = ioc.getBean(licenseMapper.class);
        System.out.println(licenseMapper);

        //1.插入license
        licenseMapper.insertSelective(new license("1230-5678-ABCD-EFGH", "0000", 30, 0,"web插入测试1"));
    }
}
