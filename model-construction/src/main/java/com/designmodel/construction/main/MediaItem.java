package com.designmodel.construction.main;

/**
 * 进而包含不同的媒体组成元素
 */

public class MediaItem {
    private String s;
    public MediaItem(String s) { this.s = s; }
    @Override
    public String toString() { return s; }
}
