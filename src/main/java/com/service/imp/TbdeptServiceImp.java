package com.service.imp;

import com.dao.TbdeptDao;
import com.entity.Tbdept;
import com.service.TbdeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class TbdeptServiceImp implements TbdeptService {
    @Autowired
    private TbdeptDao tbdeptDao;


    public Tbdept queryById(Integer deptid) {
        return tbdeptDao.queryById(deptid);
    }

    public List<Tbdept> queryAllByLimit(int offset, int limit) {
        return tbdeptDao.queryAllByLimit(offset,limit);
    }

    public int insert(Tbdept tbdept) {
        return tbdeptDao.insert(tbdept);
    }

    public int update(Tbdept tbdept) {
        return tbdeptDao.update(tbdept);
    }

    public int deleteById(Integer deptid) {
        return tbdeptDao.deleteById(deptid);
    }

    public List<Tbdept> queryAll() {
        return tbdeptDao.queryAll();
    }

    public int insertmore(List<Tbdept> list) {
        return tbdeptDao.insertmore(list);
    }

    public int deleteByIdmore(List<Integer> list) {
        return tbdeptDao.deleteByIdmore(list);
    }
}
