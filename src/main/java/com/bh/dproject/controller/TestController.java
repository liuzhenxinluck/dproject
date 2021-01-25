package com.bh.dproject.controller;

import com.bh.dproject.Pojo.Branch;
import com.bh.dproject.entirty.Result;
import com.bh.dproject.entirty.StatusCode;
import com.bh.dproject.service.BranchService;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin2.message.Message;

import java.util.List;
import java.util.Optional;

@RestController
public class TestController {
        @Autowired
        private BranchService branchService;
        @RequestMapping("/tt")
        public  Result findById(Integer id){
            Optional<Branch> findbyid = branchService.findById(id);

            if (findbyid.isPresent()){
                return new Result(StatusCode.sussess,"成功",findbyid);
            }
            return new Result(StatusCode.fail,"失败",null);
        }




      /*  @RequestMapping("/findall")
        public List<Branch> findall(){
            List<Branch> branchList = branchService.fillall();
            return branchList;
        }*/
       /* @RequestMapping("/findall")
        public Result findall(){
            List<Branch>  branchList = branchService.fillall();
            return new Result(200, "查询成功！",branchList);
        }*/


    @GetMapping("/test")
    public String test(){
        return "success";
    }

}
