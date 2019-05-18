package com.cskaoyan.controller;

import com.cskaoyan.bean.QualityManageVo;
import com.cskaoyan.bean.UnqualifyApply;
import com.cskaoyan.service.UnQualifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/unqualify")
public class UnQualifyController {

    @Autowired
    UnQualifyService unQualifyService;

    /**
     * 不合格品申请查询分发
     */
    @RequestMapping("/find")
    String qualityManage(){
        return "unqualify_list";
    }
    /**
     * 分页查询不合格申请记录
     *
     * @return
     */
    @RequestMapping("/list")
    public @ResponseBody
    QualityManageVo findPartUnqualify(@RequestParam int page, @RequestParam int rows) {
        QualityManageVo qualityManageVo = new QualityManageVo();
        List<UnqualifyApply> unqualifyList = unQualifyService.findAll();
        qualityManageVo.setRows(unqualifyList);
        qualityManageVo.setTotal(unqualifyList == null ? 0 : unqualifyList.size());
        System.out.println(qualityManageVo);
        return qualityManageVo;
    }

    /**
     * 添加不合格申请记录
     *
     * @return
     */
    @RequestMapping("/add_batch")
    public String addUnqualify() {

        return "unqualify_list";
    }

    /**
     * 编辑不合格申请记录
     *
     * @return
     */
    @RequestMapping("/edit_batch")
    public String editUnqualify() {

        return "unqualify_list";
    }

    /**
     * 删除不合格申请记录
     *
     * @return
     */
    @RequestMapping("/delete_batch")
    public String delUnqualify() {

        return "unqualify_list";
    }


    /**
     * 成品计量质检
     *
     * @return
     */
    @RequestMapping("measure/find")
    public String measure() {
        return null;
    }

    /**
     * 成品计数质检
     *
     * @return
     */
    @RequestMapping("f_count_check/find")
    public String f_count_check() {
        return null;
    }

    /**
     * 工序计量质检
     *
     * @return
     */
    @RequestMapping("p_measure_check/find")
    public String p_measure_check() {
        return null;
    }

    /**
     * 工序计数质检
     *
     * @return
     */
    @RequestMapping("p_count_check/find")
    public String p_count_check() {
        return null;
    }

}
