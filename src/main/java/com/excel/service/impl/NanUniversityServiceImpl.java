package com.excel.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.excel.service.NanUniversityService;
import com.excel.entity.NanUniversity;
import com.excel.mapper.NanUniversityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class NanUniversityServiceImpl implements NanUniversityService {
    @Override
    public boolean saveBatch(Collection<NanUniversity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<NanUniversity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<NanUniversity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(NanUniversity entity) {
        return false;
    }

    @Override
    public NanUniversity getOne(Wrapper<NanUniversity> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<NanUniversity> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<NanUniversity> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<NanUniversity> getBaseMapper() {
        return null;
    }

    @Override
    public Class<NanUniversity> getEntityClass() {
        return null;
    }
    @Autowired
    public NanUniversityMapper mapper;
    @Override
    public void batchSave(List<NanUniversity> list) {
        mapper.batchSave(list);
    }
}
