package com.designmodel.construction.main.builder;

import com.designmodel.construction.main.MediaBuilder;
import com.designmodel.construction.main.MediaItem;
import com.designmodel.construction.main.MediaType;

/**
 * 具体建造者角色
 */

public class BookBuilder extends MediaBuilder {
    private MediaType.Book mBook;

    @Override
    public void buildBase() {
        super.buildBase();
        mBook=new MediaType.Book();
    }

    @Override
    public void addMediaItem(MediaItem mediaItem) {
        super.addMediaItem(mediaItem);
        mBook.add(mediaItem);
    }

    @Override
    public MediaType.Media getFinishedMedia() {
        return mBook;
    }
}
