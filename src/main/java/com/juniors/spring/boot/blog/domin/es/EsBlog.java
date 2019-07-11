//package com.juniors.spring.boot.blog.domin.es;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
//
//import java.io.Serializable;
//
///**
// * 全文索引---Blog文档
// * @author Juniors
// */
//@Document(indexName = "blog",type = "blog")
//public class EsBlog implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    private String id;
//
//    private String title;
//
//    private String summary;
//
//    private String content;
//
//    // JPA 规范要求：防止直接使用
//    protected EsBlog(){
//        }
//
//    public EsBlog(String title,String summary,String content){
//        this.title = title;
//        this.summary = summary;
//        this.content = content;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getSummary() {
//        return summary;
//    }
//
//    public void setSummary(String summary) {
//        this.summary = summary;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String toString(){
//        return String.format("EsBlog[id='%s',title='%s',content='%s']",
//                            id,title,summary,content);
//    }
//}
