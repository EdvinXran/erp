package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Material;
import com.cskaoyan.bean.MaterialExample;
import com.cskaoyan.mapper.MaterialMapper;
import com.cskaoyan.service.MaterialService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by VAP
 * Date 2019/5/18  Time 20:31
 */

@Service
public class MaterialServiceImpl implements MaterialService {


    @Autowired
    MaterialMapper materialMapper;

    /*
    显示物料信息记录
     */
    @Override
    public List<Material> findAll(int page, int rows) {
        MaterialExample example = new MaterialExample();
        PageHelper.startPage(page,rows);
        List<Material> materials = materialMapper.selectByExample(example);
        return materials;
    }

    /*
    添加物料信息记录
     */
    @Override
    public void insertMaterial(Material material) {
        int insert = materialMapper.insert(material);
    }

    /*
    更新物料信息记录
     */
    @Override
    public void updateMaterial(Material material) {
        MaterialExample example = new MaterialExample();
        int i = materialMapper.updateByExample(material, example);
    }

    /*
    删除物料信息记录
     */
    @Override
    public void deleteMaterial(List<String> ids) {
        MaterialExample example = new MaterialExample();
        MaterialExample.Criteria criteria = example.createCriteria();
        criteria.andMaterialIdIn(ids);
        int i = materialMapper.deleteByExample(example);
    }



}
