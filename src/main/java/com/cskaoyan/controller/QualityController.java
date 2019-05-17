package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QualityController {
    /**
     * 不合格品管理
     * @return
     */
    @RequestMapping("unqualify/find")
    public String unqualify(){

        return "unqualify_list";
    }

    /**
     * 成品计量质检
     * @return
     */
    @RequestMapping("measure/find")
    public String measure(){
        return null;
    }

    /**
     * 成品计数质检
     * @return
     */
    @RequestMapping("f_count_check/find")
    public String f_count_check(){
        return null;
    }

    /**
     * 工序计量质检
     * @return
     */
    @RequestMapping("p_measure_check/find")
    public String p_measure_check(){
        return null;
    }

    /**
     * 工序计数质检
     * @return
     */
    @RequestMapping("p_count_check/find")
    public String p_count_check(){
        return null;
    }

}
