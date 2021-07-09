package com.excel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.excel.entity.NanUniversity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Mapper
@Repository
public interface NanUniversityMapper extends BaseMapper<NanUniversity> {

    public void batchSave(List<NanUniversity> list);
}
