package com.service.imp;
import com.dao.TbemployeeDao;
import com.entity.Tbemployee;
import com.service.TbemployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TbemployeeServiceImp implements TbemployeeService {
    @Autowired
    private TbemployeeDao tbemployeeDao;

    public Tbemployee queryById(Integer empid) {
        return null;
    }

    public List<Tbemployee> queryAllByLimit(int offset, int limit) {
        return null;
    }

    public List<Tbemployee> queryAll(Tbemployee tbemployee) {
        return null;
    }

    public int insert(Tbemployee tbemployee) {
        return 0;
    }

    public int update(Tbemployee tbemployee) {
        return 0;
    }

    public int deleteById(Integer empid) {
        return 0;
    }

    public List<Tbemployee> queryAll() {
        return null;
    }

    public List<Tbemployee> selctdept() {
        return tbemployeeDao.selctdept();
    }
}
