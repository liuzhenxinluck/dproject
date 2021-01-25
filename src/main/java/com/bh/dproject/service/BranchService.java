package com.bh.dproject.service;

import com.bh.dproject.Pojo.Branch;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface BranchService {
        /**
         *    查询所有
         * @return
         */
        Optional<Branch>  findById(Integer id);
        public List<Branch> fillall();
}
