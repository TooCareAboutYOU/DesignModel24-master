package com.designmodel.construction.main;

/**
 *抽象建造者角色，它规范了所有媒体建造的步骤：
 */

public class MediaBuilder {
    public void buildBase(){}
    public void addMediaItem(MediaItem mediaItem){}
    public MediaType.Media getFinishedMedia(){ return null; };
}
