package com.cskaoyan.service;

import com.cskaoyan.bean.UnqualifyApply;

import java.util.List;

public interface UnQualifyService {

    List<UnqualifyApply> findAll(int page, int rows);

    void insertUnqualify(UnqualifyApply unqualifyApply);

    void updateUnqualify(UnqualifyApply unqualifyApply);

    void delUnqualify(List<String> ids);
}
