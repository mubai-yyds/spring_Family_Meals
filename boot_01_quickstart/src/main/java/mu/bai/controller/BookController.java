package mu.bai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.29 10:55
 * @VX lhh082211
 * @Post 3268483030@qq.com
 */

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){

        System.out.println( "id============>" +id);

        return "hello , spring  boot!!!";
    }

}
