package com.designmodel.construction.main.builder;

import com.designmodel.construction.main.MediaBuilder;
import com.designmodel.construction.main.MediaItem;
import com.designmodel.construction.main.MediaType;

/**
 * 具体建造者角色
 */

public class WebSiteBuilder extends MediaBuilder {
    private MediaType.WebSite mWebSite;

    @Override
    public void buildBase() {
        super.buildBase();
        mWebSite = new MediaType.WebSite();
    }

    @Override
    public void addMediaItem(MediaItem mediaItem) {
        super.addMediaItem(mediaItem);
        mWebSite.add(mediaItem);
    }

    @Override
    public MediaType.Media getFinishedMedia() {
        return mWebSite;
    }
}
