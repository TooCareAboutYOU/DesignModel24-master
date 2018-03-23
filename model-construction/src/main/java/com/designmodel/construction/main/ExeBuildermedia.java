package com.designmodel.construction.main;

import com.designmodel.construction.main.builder.BookBuilder;
import com.designmodel.construction.main.builder.MagazineBuilder;
import com.designmodel.construction.main.builder.WebSiteBuilder;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

/**
 * 测试程序--客户程序角色
 */

public class ExeBuildermedia extends TestCase {
    private List input= Arrays.asList(new MediaItem[]{
            new MediaItem("item1"),
            new MediaItem("item2"),
            new MediaItem("item3"),
            new MediaItem("item4")
    });

    public void testBook(){
        MediaDirector mediaDirector=new MediaDirector(new BookBuilder());
        MediaType.Media book=mediaDirector.prioduceMedia(input);
        String result="book："+book;
        assertEquals(result,"book[item1,item2,item3,teim4]");
    }

    public void testMagazine(){
        MediaDirector mediaDirector=new MediaDirector(new MagazineBuilder());
        MediaType.Media magazine=mediaDirector.prioduceMedia(input);
        String result="magazine："+magazine;
        assertEquals(result,"magazine[item1,item2,item3,teim4]");
    }

    public void testWebSite(){
        MediaDirector mediaDirector=new MediaDirector(new WebSiteBuilder());
        MediaType.Media website=mediaDirector.prioduceMedia(input);
        String result="website："+website;
        assertEquals(result,"website[item1,item2,item3,teim4]");
    }

    public static void main(String[] args) {
//        junit.textui.TestRunner.run(ExeBuildermedia.class);
    }


}
