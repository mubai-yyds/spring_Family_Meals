package com.qfedu.service.impl;

import com.qfedu.Exception.BusinessException;
import com.qfedu.Exception.SystemException;
import com.qfedu.controller.Code;
import com.qfedu.dao.BookDao;
import com.qfedu.domain.Book;
import com.qfedu.service.BookService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service//定义bean
public class BookServiceImpl implements BookService {

    /**
     * 想用BookService的接口 要先注入
     * */

    @Autowired//自动装配
    private BookDao bookDao;//把bean的检测关闭或者改成警告就行了


    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }


    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }


    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }


    public Book getById(Integer id) {
        //模拟的一个异常
        if(id ==1){
            throw new BusinessException(Code.BUSINESS_ERR,"请不要用你的技术来挑战我的耐心！！！");
        }
         //将可能出现的异常进行包装，转换成自定义异常
        try {
            int i = 1/0;
        }catch (Exception e){
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"傻瓜，服务器访问超时，请重试！！！",e);
        }
        return bookDao.getById(id);
    }


    public List<Book> getAll() {
        return bookDao.getAll();
    }




}
