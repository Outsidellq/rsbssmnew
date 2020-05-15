package com.service.imp;

import com.dao.TbdocumentDao;
import com.entity.Tbdocument;
import com.service.TbdocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbdocumentServiceImp implements TbdocumentService {
    @Autowired
    TbdocumentDao tbdocumentDao;
    public int deleteById(Integer did) {
        return tbdocumentDao.deleteById(did);
    }

    public int insertmore(List<Tbdocument> list) {
        return tbdocumentDao.insertmore(list);
    }
}
