package com.bh.dproject.service;

import com.bh.dproject.Pojo.ProductInfo;

import java.util.List;
import java.util.Optional;

public interface ProdouctService {

    Optional<ProductInfo> findById(String id);
    public List<ProductInfo> fillall();
}
