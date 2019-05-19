package com.cskaoyan.service;

import com.cskaoyan.bean.Material;

import java.util.List;

/**
 * Created by VAP
 * Date 2019/5/18  Time 19:17
 */
public interface MaterialService {
    List<Material> findAll(int page,int rows);

    void insertMaterial(Material material);

    void updateMaterial(Material material);

    void deleteMaterial(List<String> ids);

}
