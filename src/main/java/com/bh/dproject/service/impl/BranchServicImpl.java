package com.bh.dproject.service.impl;

import com.bh.dproject.Pojo.Branch;
import com.bh.dproject.dao.BranchDao;
import com.bh.dproject.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchServicImpl implements BranchService {

         @Autowired
        private BranchDao branchDao;

    /**
     * 根据id 查询
     * @param id
     * @return
     */
    @Override
    public Optional<Branch> findById(Integer id) {
        return branchDao.findById(id);
    }

    @Override
    public List<Branch> fillall() {
        return branchDao.findAll();
    }
}
