package com.excavator.dao;

import com.excavator.model.NewsLinkExisted;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by rdlian on 3/15/15.
 */
@Repository
public class NewsLinkExistedDAOImpl implements NewsLinkExistedDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insert(NewsLinkExisted newsOriginExisted) {
        entityManager.persist(newsOriginExisted);
    }

    @Override
    public List<NewsLinkExisted> listNewsOriginExisteds() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<NewsLinkExisted> cq = builder.createQuery(NewsLinkExisted.class);
        Root<NewsLinkExisted> root = cq.from(NewsLinkExisted.class);
        cq.select(root);
        return entityManager.createQuery(cq).getResultList();
    }
}
