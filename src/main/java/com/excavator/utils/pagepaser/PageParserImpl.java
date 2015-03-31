package com.excavator.utils.pagepaser;

import com.excavator.model.PageInfo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rdlian on 3/15/15.
 */
@Service
public class PageParserImpl implements PageParser{
    @Autowired
    private PageInfo pageInfo;

    @Override
    public PageInfo getPageInfo(String url) {
        try {
            Document document = Jsoup.connect(url).get();
            setPageInfo(document);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pageInfo;
    }

    private void setPageInfo(Document document){
        pageInfo.setTitle(document.title());
        pageInfo.setAbstract_text(document.head().select("meta[name=keywords]").attr("content"));
        pageInfo.setImages(getImageSrcs(document));

    }

    private List<String> getImageSrcs(Document document) {
        Elements images = document.getElementsByTag("img");
        List<String> imageList = new ArrayList<String>();
        for (Element image : images){
            String src = image.absUrl("src");
            imageList.add(src);
        }
        return imageList;
    }
}
