package mapper;

import entity.Chart;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.util.List;

/**
 * author:wangzhongzhong
 * time:  2018/3/6
 */
public class TestChartMapper {

    ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-mybatis.xml");

    ChartMapper chartMapper = (ChartMapper) ac.getBean("chartMapper");

    @Test
    public void testFindChart() throws ParseException {

        List<Chart> list = chartMapper.findChartCount();
        for (Chart c: list) {
            String[] s = c.getDate().split(" ");
            c.setDate(s[0]);
            System.out.println(c);
        }
    }

}
