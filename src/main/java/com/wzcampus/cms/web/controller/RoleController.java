package com.wzcampus.cms.web.controller;

import com.wzcampus.cms.common.model.vo.RoleVO;
import com.wzcampus.cms.common.util.Result;
import com.wzcampus.cms.service.IRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色相关功能
 * @author YuYan
 * @date 2023-12-01 17:01:31
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/role")
public class RoleController {

    private final IRoleService roleService;

    /**
     * 查询所有角色信息
     * @return
     */
    @GetMapping
    public Result list() {
        return Result.ok(RoleVO.toVO(roleService.list()));
    }

}
