package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
    @GetMapping("bast/type")
    public String testBaseType(@RequestParam("str") String str,
                               @RequestParam("integer") Integer integer,
                               @RequestParam("doub") Double doub,
                               @RequestParam("float") Float floa,
                               @RequestParam("long") Long log) {
        return new StringBuffer().append(str).append(integer).append(doub).append(floa).append(log).toString();
    }
}
