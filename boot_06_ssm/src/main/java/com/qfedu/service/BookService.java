package com.qfedu.service;

import com.qfedu.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 09:57
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

/**
 * 业务层标准开发
 *
 * 接口  + 实现类
 */

//3.加事务层
@Transactional
//提供业务层接口
public interface BookService {
     //快捷键  /** + enter
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 按 id 删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按 id 查询
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();
}
