package com.wzcampus.cms.service.impl;

import com.wzcampus.cms.common.model.ext.RoleExt;
import com.wzcampus.cms.dao.RoleMapper;
import com.wzcampus.cms.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author YuYan
 * @date 2023-12-01 11:48:16
 */
@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleMapper roleMapper;

    @Override
    public RoleExt getById(Integer id) {
        return RoleExt.toExt(roleMapper.selectById(id));
    }

    @Override
    public List<RoleExt> list() {
        return roleMapper.selectList(null)
                    .stream()
                    .map(RoleExt::toExt)
                    .collect(Collectors.toList());
    }
}
