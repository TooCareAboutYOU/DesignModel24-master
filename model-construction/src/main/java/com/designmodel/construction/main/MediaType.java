package com.designmodel.construction.main;

import java.util.ArrayList;

/**
 * Created by admin on 2018/3/23.
 */

public class MediaType {

    //不同的媒体形式
    public static class Media extends ArrayList{}

    public static class Book extends Media{}
    public static class Magazine extends Media{}
    public static class WebSite extends Media{}
}
