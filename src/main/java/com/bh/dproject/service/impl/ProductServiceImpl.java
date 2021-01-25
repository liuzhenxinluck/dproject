package com.bh.dproject.service.impl;

import com.bh.dproject.Pojo.ProductInfo;
import com.bh.dproject.dao.ProductDao;
import com.bh.dproject.service.ProdouctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProdouctService {

    @Autowired
    private ProductDao productDao;
    /* 根据id查询一条语句*/
    @Override
    public Optional<ProductInfo> findById(String id) {
        return productDao.findById(id);
    }
    /*查询所有*/
    @Override
    public List<ProductInfo> fillall() {
        return productDao.findAll();
    }
}
