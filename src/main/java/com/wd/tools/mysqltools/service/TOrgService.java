package com.wd.tools.mysqltools.service;

import com.wd.tools.mysqltools.dao.primary.TOrgDao;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DimonHo on 2017/12/5.
 */
@Service
public class TOrgService {
    @Autowired
    TOrgDao tOrgDao;

    public String test(){
        System.out.println(Lists.newArrayList(tOrgDao.findAll()).size());
        return "ok";
    }
}
