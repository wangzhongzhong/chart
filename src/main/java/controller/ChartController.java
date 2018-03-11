package controller;

import entity.Chart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ChartService;

import java.util.List;

/**
 * author:wangzhongzhong
 * time:  2018/3/6
 */
@Controller
public class ChartController {

    @Autowired
    private ChartService chartService;

    @RequestMapping("/getChart.json")
    public @ResponseBody String getChart(){

        List<Chart> list = chartService.findCountChart();

        String string = "";

        for(int i=0;i<list.size();i++){
            string += "{";
            //这个是为了拼接我们的json字符串，符合我们前端的json对象
            string += "\"label\":"+ "\""+list.get(i).getDate().split(" ")[0]+"\","+"\"value\":"+"\""+list.get(i).getCount()+"\"";
            if(i == list.size()-1){
                string +="}";
            }else{
                string +="},";
            }

        }

        return "["+string+"]";
    }



}
