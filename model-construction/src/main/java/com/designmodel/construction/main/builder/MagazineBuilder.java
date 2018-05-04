package com.designmodel.construction.main.builder;

import com.designmodel.construction.main.MediaBuilder;
import com.designmodel.construction.main.MediaItem;
import com.designmodel.construction.main.MediaType;

/**
 * 具体建造者角色
 */

public class MagazineBuilder extends MediaBuilder {
    private MediaType.Magazine mMagazine;

    @Override
    public void buildBase() {
        super.buildBase();
        mMagazine=new MediaType.Magazine();
    }

    @Override
    public void addMediaItem(MediaItem mediaItem) {
        super.addMediaItem(mediaItem);
        mMagazine.add(mediaItem);
    }

    @Override
    public MediaType.Media getFinishedMedia() {
        return mMagazine;
    }
}
