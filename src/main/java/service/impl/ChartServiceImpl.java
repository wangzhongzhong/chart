package service.impl;

import entity.Chart;
import mapper.ChartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ChartService;

import java.util.List;

/**
 * author:wangzhongzhong
 * time:  2018/3/6
 */
@Service
public class ChartServiceImpl implements ChartService {

    @Autowired
    private ChartMapper chartMapper;

    @Override
    public List<Chart> findCountChart() {
        return chartMapper.findChartCount();
    }
}
