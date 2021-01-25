package com.bh.dproject.dao;

import com.bh.dproject.Pojo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<ProductInfo,String> {
}
