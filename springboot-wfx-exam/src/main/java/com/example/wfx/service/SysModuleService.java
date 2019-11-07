package com.example.wfx.service;

import com.example.wfx.model.SysModule;

import java.util.List;

public interface SysModuleService {

    List<SysModule> findAll(SysModule sysModule);
}
