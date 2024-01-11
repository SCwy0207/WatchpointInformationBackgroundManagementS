package com.wzcampus.cms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wzcampus.cms.common.model.entity.LogEntity;
import com.wzcampus.cms.common.model.ext.LogEntityExt;

import java.io.OutputStream;

/**
 * @author YuYan
 * @date 2023-12-08 14:10:53
 */
public interface ILogService {

    void save(LogEntity logEntity);

    IPage<LogEntityExt> pageQueryByClause(IPage<LogEntity> page,
                                       LogEntityExt logEntityExt);

    void download(OutputStream os,
                  LogEntityExt logEntityParam);
}
