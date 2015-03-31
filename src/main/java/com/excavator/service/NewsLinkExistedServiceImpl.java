package com.excavator.service;

import com.excavator.dao.NewsLinkExistedDAO;
import com.excavator.model.NewsLinkExisted;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rdlian on 3/15/15.
 */
@Service
public class NewsLinkExistedServiceImpl implements NewsLinkExistedService {
    @Autowired
    private NewsLinkExistedDAO newsLinkExistedDAO;

    @Override
    @Transactional
    public void addUser(NewsLinkExisted user) {
        newsLinkExistedDAO.insert(user);
    }

    @Override
    public List<NewsLinkExisted> listUsers() {
        return newsLinkExistedDAO.listNewsOriginExisteds();
    }
}
