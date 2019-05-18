package com.cskaoyan.controller;

import com.cskaoyan.bean.Device;
import com.cskaoyan.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class DeviceController {
     @Autowired
     DeviceService deviceService;
     @RequestMapping(value = "/device/deviceList")
     public String deviceList(){
         return "deviceList";
     }
    @RequestMapping(value = "/deviceList/list")
    @ResponseBody
    public List<Device> queryAllDevices(String page,String rows){
        return deviceService.QueryAllDevice();
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
