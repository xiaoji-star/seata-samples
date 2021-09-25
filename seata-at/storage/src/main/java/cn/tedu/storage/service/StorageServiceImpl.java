package cn.tedu.storage.service;

import cn.tedu.storage.mapper.StorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageMapper storageMapper;

    @Override
    @Transactional
    public void decrease(Long productId, Integer count) throws Exception {
        storageMapper.decrease(productId,count);
//        if (Math.random() < 0.5) {
//            throw new RuntimeException("模拟异常");
//        }
    }
}
