package com.designmodel.construction.main;

import java.util.Iterator;
import java.util.List;

/**
 * 指导者角色,也叫上下文
 */

public class MediaDirector {

    private MediaBuilder mBuilder;

    public MediaDirector(MediaBuilder builder) {
        mBuilder = builder; //具有策略模式相似特征
    }

    public MediaType.Media prioduceMedia(List input){
        mBuilder.buildBase();
        for (Iterator it = input.iterator(); it.hasNext();)
            mBuilder.addMediaItem((MediaItem) it.next());
        return mBuilder.getFinishedMedia();
    }
}
