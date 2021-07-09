package com.excel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.excel.entity.NanUniversity;

import java.util.List;

public interface NanUniversityService extends IService<NanUniversity> {
    public void batchSave(List<NanUniversity> list);
}
