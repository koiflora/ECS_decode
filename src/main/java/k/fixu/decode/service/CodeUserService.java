package k.fixu.decode.service;

import k.fixu.decode.domain.CodeUser;

/**
 * @author karrb
 * @version 1.0
 * @date 2019/02/19 14:59
 */
public interface CodeUserService {

    void reg(CodeUser codeUser);

    CodeUser findOne(String username);
}
