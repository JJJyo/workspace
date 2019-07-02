import com.github.pagehelper.PageInfo;
import com.microbridge.workspace.bean.license;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * @program: workspace
 * @description: Springtest测试CRUD的正确性
 * @author: Jyo
 * @create: 2019-06-11 14:39
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath*:/applicationContext.xml",
"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MvcTest {

    //传入SpringMvc的ioc
    @Autowired
    WebApplicationContext context;
    //虚拟mcv请求，获取结果
    MockMvc mockMvc;

    @Before
    public void initMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testPage() throws Exception {
        //模拟请求param("pagenumber", "1")) 显示的页码
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/licenses").param("pagenumber", "2")).andReturn();

        //请求成功后，请求域中会有pageInfo
        MockHttpServletRequest request = result.getRequest();
        PageInfo pi = (PageInfo) request.getAttribute("pageInfo");
        System.out.println("当前页码"+pi.getPageNum());
        System.out.println("总页码"+pi.getPages());
        System.out.println("总记录数"+pi.getTotal());
        System.out.println("需要连续显示的页码");
        int[] nums = pi.getNavigatepageNums();
        for (int i:nums){
            System.out.print(" "+i);
        }
        //获取license数据
        List<license> list = pi.getList();
        for (license license:list){
            System.out.println("ID: "+license.getLicenseid()+"PID: "+license.getProjectid());
        }
    }
}
