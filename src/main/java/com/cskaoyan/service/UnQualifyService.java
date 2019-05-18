package com.cskaoyan.service;

import com.cskaoyan.bean.UnqualifyApply;

import java.util.List;

public interface UnQualifyService {
    /*int page, int rows*/
    List<UnqualifyApply> findAll();
}
