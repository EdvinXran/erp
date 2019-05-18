package com.cskaoyan.service;


import com.cskaoyan.bean.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DeviceService {

    List<Device> queryAllDevice();
    List<Device_Type> queryAllDevice_Type();
    List<Device_Check> queryAllDevice_Check();
    List<Device_Fault> queryAllDevice_Fault();
    List<Device_Maintain> queryAllDevice_MainTain();

}
