package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Manufacture;
import com.cskaoyan.bean.QueryVo;
import com.cskaoyan.mapper.ManufactureMapper;
import com.cskaoyan.service.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufactureServiceImpl implements ManufactureService {

    @Autowired
    ManufactureMapper manufactureMapper;

    @Override
    public QueryVo<Manufacture> queryManufacture(int page, int rows) {

        int total = manufactureMapper.queryManufactureNum();
        List<Manufacture> manufactures = manufactureMapper.queryManufacture((page - 1) * rows, rows);
        QueryVo<Manufacture> manufactureQueryVo = new QueryVo<>();
        manufactureQueryVo.setTotal(total);
        manufactureQueryVo.setRows(manufactures);
        return manufactureQueryVo;
    }
}
