package com.model_prototype.model.sample;

import java.util.ArrayList;

/**
 * 文档类型 ，扮演的是 ConcretePrototype角色，而Cloneable是代表Prototype角色
 */
public class WordDocument implements Cloneable {
    //文本
    private String mText;
    //图文列表
    private ArrayList<String> mImages=new ArrayList<>();

    public WordDocument() {
        System.out.print("------------WordDocument构造函数---------------");
    }

    /**
     * 浅拷贝：不是将原始文版的所有字段都重新构造一份，而是副文档的字段引用原始文档的字段
     */
//    @Override
//    protected WordDocument clone(){
//        try {
//            WordDocument doc= (WordDocument) super.clone();
//            doc.mText=this.mText;
//            doc.mImages=this.mImages;
//            return doc;
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    /**
     * 深拷贝
     */
    @Override
    protected WordDocument clone(){
        try {
            WordDocument doc= (WordDocument) super.clone();
            doc.mText=this.mText;
            doc.mImages= (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void addImages(String image) {
        mImages.add(image);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"mText\":\"")
                .append(mText).append('\"');
        sb.append(",\"mImages\":")
                .append(mImages);
        sb.append('}');
        return sb.toString();
    }
}
