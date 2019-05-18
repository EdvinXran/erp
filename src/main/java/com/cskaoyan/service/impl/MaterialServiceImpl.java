package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Material;
import com.cskaoyan.mapper.MaterialMapper;
import com.cskaoyan.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by VAP
 * Date 2019/5/18  Time 8:26
 */

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    MaterialMapper materialMapper;

    @ResponseBody
    @Override
    public List<Material> queryMaterial() {
        List<Material> materials = materialMapper.queryMaterial();
        return materials;

    }
}
