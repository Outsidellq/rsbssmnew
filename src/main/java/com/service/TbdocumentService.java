package com.service;
import com.entity.Tbdocument;
import java.util.List;
public interface TbdocumentService {
    int deleteById(Integer did);
    int insertmore(List<Tbdocument> list);
}
