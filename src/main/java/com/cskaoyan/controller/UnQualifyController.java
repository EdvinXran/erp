package com.cskaoyan.controller;

import com.cskaoyan.bean.QualityManageVo;
import com.cskaoyan.bean.UnqualifyApply;
import com.cskaoyan.bean.UpdateVo;
import com.cskaoyan.service.UnQualifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/unqualify")
public class UnQualifyController {

    @Autowired
    UnQualifyService unQualifyService;

    /**
     * 跳转到显示页面
     */
    @RequestMapping("/find")
    public String qualityManage(HttpServletRequest request){

        HttpSession session = request.getSession();
        List<String> per = new ArrayList<>();
        per.add("unqualify:add");
        per.add("unqualify:edit");
        per.add("unqualify:delete");
        session.setAttribute("sysPermissionList",per);
        return "unqualify_list";
    }

    /**
     * 分页查询不合格申请记录
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public QualityManageVo findPartUnqualify(@RequestParam int page, @RequestParam int rows) {
        QualityManageVo qualityManageVo = new QualityManageVo();
        List<UnqualifyApply> unqualifyList = unQualifyService.findAll(page, rows);
        qualityManageVo.setRows(unqualifyList);
        qualityManageVo.setTotal(unqualifyList == null ? 0 : unqualifyList.size());
        System.out.println(qualityManageVo);
        return qualityManageVo;
    }


    /**
     * 添加之前的判断
     */
    @RequestMapping("/add_judge")
    @ResponseBody
    public String addJudge(){

        return null;
    }

    /**
     * 加载添加子页面
     */

    @RequestMapping("/add")
    public String loadAdd(){

        return "unqualify_add";
    }

    /**
     * 添加不合格申请记录
     *
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public UpdateVo insertUnqualify(@RequestParam UnqualifyApply unqualifyApply) {
        UpdateVo updateVo = new UpdateVo();
        unQualifyService.insertUnqualify(unqualifyApply);
        // 模拟数据
        updateVo.setData(null);
        updateVo.setMsg(null);
        updateVo.setStatus(null);
        return updateVo;
    }

    /**
     * 编辑之前的判断
     */
    @RequestMapping("/edit_judge")
    public String editJudge(){

        return null;
    }

    /**
     * 加载编辑子页面
     */
    @RequestMapping("/edit")
    public String loadEdit(){

        return "unqualify_edit";
    }

    /**
     * 编辑不合格申请记录
     *
     * @return
     */
    @RequestMapping("/update_all")
    @ResponseBody
    public UpdateVo updateUnqualify(@RequestParam UnqualifyApply unqualifyApply) {
        UpdateVo updateVo = new UpdateVo();
        unQualifyService.updateUnqualify(unqualifyApply);
        // 模拟数据
        updateVo.setData(null);
        updateVo.setMsg(null);
        updateVo.setStatus(null);
        return updateVo;
    }

    /**
     * 删除之前的判断
     */
    @RequestMapping("/delete_judge")
    public String deleteJudge(){

        return "unqualify_list";
    }

    /**
     * 删除不合格申请记录
     *
     * @return
     */
    @RequestMapping("/delete_batch")
    @ResponseBody
    public UpdateVo delUnqualify(@RequestParam List<String> ids) {
        UpdateVo updateVo = new UpdateVo();
        unQualifyService.delUnqualify(ids);
        // 模拟数据
        updateVo.setData(null);
        updateVo.setMsg(null);
        updateVo.setStatus(null);
        return updateVo;
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
