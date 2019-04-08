package com.wangxuegang.service.relation.impl;

import com.wangxuegang.dao.RelationShipDao;
import com.wangxuegang.service.relation.RelationShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationShipServiceImpl implements RelationShipService {

    @Autowired
    private RelationShipDao relationShipDao;


}
