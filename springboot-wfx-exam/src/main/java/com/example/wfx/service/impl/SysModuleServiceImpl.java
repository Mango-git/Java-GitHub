package com.example.wfx.service.impl;

import com.example.wfx.mapper.SysModuleMapper;
import com.example.wfx.model.SysModule;
import com.example.wfx.service.SysModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
@Transactional
public class SysModuleServiceImpl implements SysModuleService {

    @Autowired
    private SysModuleMapper sysModuleMapper;

    @Override
    public List<SysModule> findAll(SysModule sysModule) {

        Example example = new Example(SysModule.class);
        if (sysModule.getModuleId() != null) {
            example.and().andLike("moduleId", "%" + sysModule.getModuleId().replaceAll(" ", "") + "%");
        }
        if (sysModule.getModuleName() != null) {
            example.and().andLike("moduleName", "%" + sysModule.getModuleName().replaceAll(" ", "") + "%");
        }
        return sysModuleMapper.selectByExample(example);
    }
}
