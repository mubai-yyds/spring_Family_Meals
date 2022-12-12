package com.qfedu.service.impl;

import com.qfedu.dao.ResourcesDao;
import com.qfedu.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.21 11:25
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//实现类
@Service
public class ResourcesServiceImpl implements ResourcesService {

    @Autowired
    private ResourcesDao resourcesDao;

    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url,password);
    }
}
