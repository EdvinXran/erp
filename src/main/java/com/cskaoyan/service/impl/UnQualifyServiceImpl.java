package com.cskaoyan.service.impl;

import com.cskaoyan.bean.UnqualifyApply;
import com.cskaoyan.bean.UnqualifyApplyExample;
import com.cskaoyan.mapper.UnqualifyApplyMapper;
import com.cskaoyan.service.UnQualifyService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("qualityService")
public class UnQualifyServiceImpl implements UnQualifyService {

    @Autowired
    private UnqualifyApplyMapper unqualifyApplyMapper;

    /**
     * 添加不合格申请记录
     * @param unqualifyApply 需要添加的项
     */
    @Override
    public void insertUnqualify(UnqualifyApply unqualifyApply) {
        int insert = unqualifyApplyMapper.insert(unqualifyApply);
    }

    @Override
    public void updateUnqualify(UnqualifyApply unqualifyApply) {
        UnqualifyApplyExample uqae = new UnqualifyApplyExample();
        int i = unqualifyApplyMapper.updateByExample(unqualifyApply, uqae);
    }

    /**
     * 显示不合格申请记录
     * @return 显示记录列表
     */
    public List<UnqualifyApply> findAll(int page, int rows){
        UnqualifyApplyExample uqae = new UnqualifyApplyExample();
        PageHelper.startPage(page, rows);
        List<UnqualifyApply> applyList = unqualifyApplyMapper.selectByExample(uqae);
        return applyList;
    }

    @Override
    public void delUnqualify(List<String> ids) {
        UnqualifyApplyExample uqae = new UnqualifyApplyExample();
        UnqualifyApplyExample.Criteria criteria = uqae.createCriteria();
        criteria.andUnqualifyApplyIdIn(ids);
        int i = unqualifyApplyMapper.deleteByExample(uqae);
    }
}
