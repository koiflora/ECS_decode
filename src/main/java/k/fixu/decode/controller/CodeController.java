package k.fixu.decode.controller;

import k.fixu.decode.domain.CodeString;
import k.fixu.decode.domain.CodeUser;
import k.fixu.decode.domain.Result;
import k.fixu.decode.service.CodeService;
import k.fixu.decode.service.CodeUserService;
import k.fixu.decode.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author karrb
 * @version 1.0
 * @date 2019/02/19 14:56
 */
@RestController
@RequestMapping("/code")
public class CodeController {

    @Autowired
    private CodeService codeService;

    @Autowired
    private IdWorker idWorker;

    @RequestMapping("/code")
    public Result code(@RequestBody CodeString codeString) {
        try {
            //设置id
            long id = idWorker.nextId();
            codeString.setId(id);
            //设置username
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            codeString.setUsername(username);
            codeService.save(codeString);
            return new Result(true, id + "");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "加密失败");
        }
    }

    @RequestMapping("/decode")
    public Result decode(@RequestBody CodeString codeString) {
        try {
            Long id = codeString.getId();
            CodeString one = codeService.findOne(id, codeString.getPwd());
            return new Result(true, one.getCode());
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "解密失败");
        }
    }
}
