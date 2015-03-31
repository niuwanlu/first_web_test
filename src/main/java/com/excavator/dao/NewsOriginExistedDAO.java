package com.excavator.dao;

import com.excavator.model.NewsOriginExisted;

import java.util.List;

/**
 * Created by rdlian on 3/15/15.
 */
public interface NewsOriginExistedDAO {
    void insert(NewsOriginExisted newsOriginExisted);
    List<NewsOriginExisted> listNewsOriginExisteds();
}
