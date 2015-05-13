package com.excavator.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by rdlian on 3/15/15.
 */

@Component
@Entity
@Table(name = "NEWS_LINK_EXISTED")
public class NewsLinkExisted {
    @Id
    @Column(name = "NEWS_ID", nullable = false)
    private int news_id;
    @Column(name = "THUMBNAIL")
    private String thumbnail;
    @Column(name = "TITLE", nullable = false)
    private String title;
    @Column(name = "ABSTRACT", nullable = false)
    private String abstract_text;


    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstract_text() {
        return abstract_text;
    }

    public void setAbstract_text(String abstract_text) {
        this.abstract_text = abstract_text;
    }
}
