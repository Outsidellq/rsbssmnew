package com.service.imp;
import com.dao.TbstaffDao;
import com.entity.Tbstaff;
import com.service.TbstaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class TbstaffServiceImp implements TbstaffService {
    @Autowired
    TbstaffDao tbstaffDao;

    public Tbstaff queryById(Integer staid) {
        return null;
    }

    public List<Tbstaff> queryAllByLimit(int offset, int limit) {
        return null;
    }

    public List<Tbstaff> queryAll(Tbstaff tbstaff) {
        return null;
    }

    public int insert(Tbstaff tbstaff) {
        return 0;
    }

    public int update(Tbstaff tbstaff) {
        return 0;
    }

    public int deleteById(Integer staid) {
        return 0;
    }

    public List<Tbstaff> selectmanyemps() {
        return tbstaffDao.selectmanyemps();
    }
}
