package com.bh.dproject.controller;

import com.bh.dproject.Pojo.ProductInfo;
import com.bh.dproject.entirty.Result;
import com.bh.dproject.entirty.StatusCode;
import com.bh.dproject.service.ProdouctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProdouctService prodouctService;


    @RequestMapping("/productinfo")
    public  Result findById(String id){
        Optional<ProductInfo> findbyid = prodouctService.findById(id);

        if (findbyid.isPresent()){
            return new Result(StatusCode.sussess,"成功",findbyid);
        }
        return new Result(StatusCode.fail,"失败",null);
    }



   /* @RequestMapping("/productinfo")
    public Result findall(){
        List<ProductInfo> productInfoList = prodouctService.fillall();
        return new Result(StatusCode.sussess,"查询成功！",productInfoList);
    }*/
}
