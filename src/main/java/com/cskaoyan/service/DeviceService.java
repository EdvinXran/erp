package com.cskaoyan.service;


import com.cskaoyan.bean.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DeviceService {

    List<Device> QueryAllDevice();
    List<Device_Type> QueryAllDevice_Type();
    List<Device_Check> QueryAllDevice_Check();
    List<Device_Fault> QueryAllDevice_Fault();
    List<Device_Maintain> QueryAllDevice_MainTain();

}
