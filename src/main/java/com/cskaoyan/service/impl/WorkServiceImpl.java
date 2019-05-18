package com.cskaoyan.service.impl;

import com.cskaoyan.bean.QueryVo;
import com.cskaoyan.bean.Work;
import com.cskaoyan.mapper.WorkMapper;
import com.cskaoyan.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    WorkMapper workMapper;

    @Override
    public QueryVo<Work> queryWork(int page, int rows) {
        int total = workMapper.queryWorkNum();
        List<Work> works = workMapper.queryWork((page - 1) * rows, rows);
        QueryVo<Work> workQueryVo = new QueryVo<>();
        workQueryVo.setTotal(total);
        workQueryVo.setRows(works);
        return workQueryVo;
    }
}
