package k.fixu.decode.controller;

import k.fixu.decode.domain.CodeUser;
import k.fixu.decode.domain.Result;
import k.fixu.decode.service.CodeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author karrb
 * @version 1.0
 * @date 2019/02/19 14:56
 */
@RestController
@RequestMapping("/user")
public class CodeUserController {

    @Autowired
    private CodeUserService codeUserService;

    @RequestMapping("/reg")
    public Result reg(@RequestBody CodeUser codeUser) {
        try {
            codeUserService.reg(codeUser);
            return new Result(true, "注册ok");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "注册失败");
        }
    }
}
