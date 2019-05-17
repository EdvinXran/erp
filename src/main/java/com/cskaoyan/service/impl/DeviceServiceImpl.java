package com.cskaoyan.service.impl;

import com.cskaoyan.bean.*;
import com.cskaoyan.mapper.DeviceMapper;
import com.cskaoyan.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    DeviceMapper deviceMapper;
    @Override
    public List<Device> QueryAllDevice() {
        DeviceExample deviceExample = new DeviceExample();
        List<Device> devices = deviceMapper.selectByExample(deviceExample);
        return devices;
    }

    @Override
    public List<Device_Type> QueryAllDevice_Type() {
        return null;
    }

    @Override
    public List<Device_Check> QueryAllDevice_Check() {
        return null;
    }

    @Override
    public List<Device_Fault> QueryAllDevice_Fault() {
        return null;
    }

    @Override
    public List<Device_Maintain> QueryAllDevice_MainTain() {
        return null;
    }
}
