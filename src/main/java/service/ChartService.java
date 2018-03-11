package service;

import entity.Chart;
import mapper.ChartMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:wangzhongzhong
 * time:  2018/3/6
 */
public interface ChartService {

    List<Chart> findCountChart();

}
