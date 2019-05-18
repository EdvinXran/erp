package com.cskaoyan.controller;

import com.cskaoyan.bean.Department;
import com.cskaoyan.bean.Device;
import com.cskaoyan.bean.Device_Type;
import com.cskaoyan.bean.Employee;
import com.cskaoyan.service.DeviceService;
import com.cskaoyan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class DeviceController {
     @Autowired
     DeviceService deviceService;
     @Autowired
     EmployeeService employeeService;
    /*
    设备台账
     */
     @RequestMapping(value = "/device/deviceList")
     public String deviceList(){
         return "deviceList";
     }
    @RequestMapping(value = "/deviceList/list")
    @ResponseBody
    public List<Device> queryAllDevices(String page,String rows){
        return deviceService.queryAllDevice();
    }
    @RequestMapping(value = "/deviceList/add_judge")
    public String addDevicePage(){
        return "deviceList_add";
    }
    @RequestMapping(value = "/deviceList/add")
    public String addDevice(){
        //deviceService.insertDevice()
        return "deviceList_add";
    }
    //增加设备台账 --设备种类
    @ResponseBody
    @RequestMapping(value="/deviceType/get_data")
    public List<Device_Type> queryAllDeviceType(){
        return deviceService.queryAllDevice_Type();
    }
    //增加设备台账--负责人
    @ResponseBody
    @RequestMapping(value="/employee/get_data")
    public List<Employee> queryAllEmpolyee(){
        return employeeService.selectAllEmployee();
    }
    //department/get_data
    /*@ResponseBody
    @RequestMapping(value="department/get_data")
    public List<Department> queryAllDeparment(){
        return employeeService.selectAllEmployee();
    }*/
    //暂时错误
    /*
    @RequestMapping("deviceType/get/{id}")

    public Device_Type selectDeviceTypeById(Device_Type device_type,@PathVariable("id") ){
        System.out.println(id);
        return null;
    }*/

    /*
    设备种类
     */
     @RequestMapping(value="/device/deviceType")
    public String addDeviceTypeJsp(){
         return "deviceType";
     }
    @RequestMapping(value="/deviceType/list")
    @ResponseBody
     public List<Device_Type> queryAllDeviceType2(){
         return deviceService.queryAllDevice_Type();
     }


}
