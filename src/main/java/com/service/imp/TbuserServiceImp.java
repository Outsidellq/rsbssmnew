package com.service.imp;

import com.dao.TbuserDao;
import com.entity.Tbuser;
import com.service.TbuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbuserServiceImp implements TbuserService {
@Autowired
private TbuserDao tbuserDao;

    public Tbuser queryById(Object uid) {
        return tbuserDao.queryById(uid);
    }

    public Tbuser login(String username, String password) {
        return tbuserDao.login(username,password);
    }

    public List<Tbuser> queryAllByLimit(int offset, int limit) {
        return tbuserDao.queryAllByLimit(offset,limit);
    }

    public List<Tbuser> queryAll(Tbuser tbuser) {
        return tbuserDao.queryAll(tbuser);
    }

    public int insert(Tbuser tbuser) {
        return tbuserDao.insert(tbuser);
    }

    public int update(Tbuser tbuser) {
        return tbuserDao.update(tbuser);
    }

    public int deleteById(Object uid) {
        return tbuserDao.deleteById(uid);
    }
}
