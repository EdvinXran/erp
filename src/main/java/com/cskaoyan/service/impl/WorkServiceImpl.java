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
        List<Work> works = workMapper.queryWork();
        QueryVo<Work> workQueryVo = new QueryVo<>();
        workQueryVo.setTotal(works.size());
        workQueryVo.settList(works);
        return workQueryVo;
    }
}
