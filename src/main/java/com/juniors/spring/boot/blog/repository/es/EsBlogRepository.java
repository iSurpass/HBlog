//package com.juniors.spring.boot.blog.repository.es;
//
//import com.juniors.spring.boot.blog.domin.es.EsBlog;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//
///**
// * EsBlog 资源库接口
// *
// * @author Juniors
// */
//public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,String> {
//
//    /**
//     * 根据用户名分页查询用户列表
//     * @param title
//     * @param pageable
//     * @return
//     */
//    Page<EsBlog> findByTitleLikeOrContentLike(String title, String content, Pageable pageable);
//
//    /**
//     * 分页查询博客（去重）
//     * @param title
//     * @param summary
//     * @param content
//     * @param pageable
//     * @return
//     */
//    Page<EsBlog> findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(String title,String summary,String content,Pageable pageable);
//
//}
