package k.fixu.decode.service.impl;

import k.fixu.decode.dao.CodeUserDao;
import k.fixu.decode.domain.CodeUser;
import k.fixu.decode.service.CodeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author karrb
 * @version 1.0
 * @date 2019/02/19 15:00
 */
@Service
public class CodeUserServiceImpl implements CodeUserService {

    @Autowired
    private CodeUserDao codeUserDao;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public void reg(CodeUser codeUser) {
        //设置加密密码
        codeUser.setRealpwd(codeUser.getPassword());
        codeUser.setPassword(encoder.encode(codeUser.getPassword()));
        //设置创建时间
        codeUser.setCreateDate(new Date());
        codeUserDao.reg(codeUser);
    }

    @Override
    public CodeUser findOne(String username) {
        return codeUserDao.findOne(username);
    }
}
