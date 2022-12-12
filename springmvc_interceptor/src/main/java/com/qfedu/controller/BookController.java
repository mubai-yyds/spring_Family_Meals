package com.qfedu.controller;

import com.qfedu.domain.Book;
import org.springframework.web.bind.annotation.*;


/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 20:30
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
@RestController
@RequestMapping("/books")
public class BookController {


    /**
     * 提供所有的方法
     * */

//    @Autowired

    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("book save ..." + book);
        return "{'module' : 'book save'}";

    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {

        System.out.println("book delete ..."+id);
        return "{'module' : 'book delete'}";
    }
    @PutMapping
    public String update(@RequestBody Book book) {
        System.out.println("book update ..." + book);
        return "{'module' : 'book update'}";
    }



    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("book getById ..." + id);
        return "{'module' : 'book getById'}";
    }

    @GetMapping
    public String getAll() {
        System.out.println("book getAll ...");
        return "{'module' : 'book getAll'}";

    }


}
