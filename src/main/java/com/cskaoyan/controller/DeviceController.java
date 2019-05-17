package com.cskaoyan.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/device")
public class DeviceController {
     @RequestMapping(value = "/deviceList")
     public ModelAndView QueryAllDevice(){
         return null;
     }
     @RequestMapping(value="/deviceType")
     public ModelAndView QueryAllDevice_Type(){
         return null;
     }
    @RequestMapping(value="/deviceMaintain")
    public ModelAndView QueryAllDevice_Maintain(){
        return null;
    }
    @RequestMapping(value="/deviceFault")
    public ModelAndView QueryAllDevice_Fault(){
        return null;
    }
    @RequestMapping(value="/deviceCheck")
    public ModelAndView QueryAllDevice_Check(){
        return null;
    }



}
