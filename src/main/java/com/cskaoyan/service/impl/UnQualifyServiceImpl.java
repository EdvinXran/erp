package com.cskaoyan.service.impl;

import com.cskaoyan.bean.UnqualifyApply;
import com.cskaoyan.bean.UnqualifyApplyExample;
import com.cskaoyan.mapper.UnqualifyApplyMapper;
import com.cskaoyan.service.UnQualifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("qualityService")
public class UnQualifyServiceImpl implements UnQualifyService {

    @Autowired
    private UnqualifyApplyMapper unqualifyApplyMapper;

    /**
     * 显示不合格申请记录
     * @return 显示记录列表
     */
    public List<UnqualifyApply> findAll(){
        UnqualifyApplyExample uqae = new UnqualifyApplyExample();
       // PageHelper.startPage(page, rows);
        List<UnqualifyApply> applyList = unqualifyApplyMapper.selectByExample(uqae);
        return applyList;
    }
}
