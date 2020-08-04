package com.zr0726.news.dao;

import com.zr0726.news.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//指定要使用实体的类型为Type，和主键的类型为Long
public interface TypeRepository extends JpaRepository<Type,Long> {
    //不允许添加同样的标签 查数据库 如果查到了就提示已存在
    Type findByName(String name);

    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
