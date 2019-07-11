//package com.juniors.spring.boot.blog.repository;
//
//import com.juniors.spring.boot.blog.domin.es.EsBlog;
//import com.juniors.spring.boot.blog.repository.es.EsBlogRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
///**
// * EsBlog 资源库接口测试用例
// *
// * @author Juniors
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class EsBlogRepositoryTest{
//
//    @Autowired
//    private EsBlogRepository esBlogRepository;
//
//    @Before
//    public void initRepositoryData(){
//        //清除所有数据
//        esBlogRepository.deleteAll();
//
//        esBlogRepository.save(new EsBlog("登鹳雀楼","RunAsOne",
//                "火箭总冠军"));
//        esBlogRepository.save(new EsBlog("登黄鹤楼","RunAsTwo",
//                "哈登MVP"));
//        esBlogRepository.save(new EsBlog("登金陵楼","RunAsThree",
//                "湖人总冠军"));
//
//
//    }
//
//    @Test
//    public void testFindDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(){
//
//        Pageable pageable = new PageRequest(0,20);
//        String title = "金";
//        String summary = "w";
//        String content = "M";
//        Page<EsBlog> page = esBlogRepository.findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(title,summary,content,pageable);
//        assertThat(page.getTotalElements()).isEqualTo(2);
//
//        System.out.println("Start---------");
//        for (EsBlog blog:page.getContent()){
//            System.out.println(blog.toString());
//        }
//        System.out.println("End-----------");
//    }
//
//}
