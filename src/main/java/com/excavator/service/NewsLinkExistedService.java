package com.excavator.service;

import com.excavator.model.NewsLinkExisted;

import java.util.List;

/**
 * Created by rdlian on 3/15/15.
 */
public interface NewsLinkExistedService {
    void addUser(NewsLinkExisted user);
    List<NewsLinkExisted> listUsers();
}
