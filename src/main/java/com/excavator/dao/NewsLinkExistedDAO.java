package com.excavator.dao;

import com.excavator.model.NewsLinkExisted;

import java.util.List;

/**
 * Created by rdlian on 3/15/15.
 */
public interface NewsLinkExistedDAO {
    void insert(NewsLinkExisted newsOriginExisted);
    List<NewsLinkExisted> listNewsOriginExisteds();
}
