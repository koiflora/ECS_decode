package k.fixu.decode.service.impl;

import k.fixu.decode.dao.CodeDao;
import k.fixu.decode.domain.CodeString;
import k.fixu.decode.domain.CodeUser;
import k.fixu.decode.service.CodeService;
import k.fixu.decode.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author karrb
 * @version 1.0
 * @date 2019/02/19 16:19
 */
@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeDao codeDao;



    @Override
    public void save(CodeString codeString) {
        codeString.setCount(0);
        codeDao.save(codeString);
    }

    @Override
    public CodeString findOne(Long id, String pwd) {
        CodeString codeString = codeDao.findOne(id);
        //只要被查询就加1
        codeString.setCount(codeString.getCount() + 1);
        //更新
        codeDao.update(codeString);
        if (pwd.equals(codeString.getPwd())) {
            return codeString;
        }
        throw new RuntimeException("pwd没有");
    }
}
