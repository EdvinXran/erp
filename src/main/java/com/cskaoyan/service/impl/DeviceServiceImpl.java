package com.cskaoyan.service.impl;

import com.cskaoyan.bean.*;
import com.cskaoyan.mapper.DeviceMapper;
import com.cskaoyan.mapper.Device_TypeMapper;
import com.cskaoyan.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    DeviceMapper deviceMapper;
    @Autowired
    Device_TypeMapper device_typeMapper;
    @Override
    public List<Device> queryAllDevice() {

        return deviceMapper.queryAllDevice();

    }

    @Override
    public List<Device_Type> queryAllDevice_Type() {
        Device_TypeExample device_typeExample = new Device_TypeExample();
        device_typeExample.clear();
         return device_typeMapper.selectByExample(device_typeExample);
    }

    @Override
    public List<Device_Check> queryAllDevice_Check() {
        return null;
    }

    @Override
    public List<Device_Fault> queryAllDevice_Fault() {
        return null;
    }

    @Override
    public List<Device_Maintain> queryAllDevice_MainTain() {
        return null;
    }
}
