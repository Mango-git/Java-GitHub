package com.example.wfx.controller;

import com.example.wfx.model.SysModule;
import com.example.wfx.service.SysModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/module")
public class SysModuleController {

    @Autowired
    private SysModuleService sysModuleService;

    @RequestMapping("/findAll")
    public String findAll(SysModule sysModule, Model model) {

        List<SysModule> moduleList = sysModuleService.findAll(sysModule);
        model.addAttribute("moduleList", moduleList);
        model.addAttribute("sysModule", sysModule);
        return "module";
    }
}
