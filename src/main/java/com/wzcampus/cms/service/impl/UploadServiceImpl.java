package com.wzcampus.cms.service.impl;

import com.wzcampus.cms.common.util.QiniuUtil;
import com.wzcampus.cms.service.UploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author YuYan
 * @date 2023-11-30 14:36:21
 */
@Service
@RequiredArgsConstructor
public class UploadServiceImpl implements UploadService {

    private final QiniuUtil qiniuUtil;

    @Override
    public String upload(MultipartFile multipartFile) {
        return qiniuUtil.upload(multipartFile);
    }

}
