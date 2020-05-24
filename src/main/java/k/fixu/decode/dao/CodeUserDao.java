package k.fixu.decode.dao;

import k.fixu.decode.domain.CodeUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @author karrb
 * @version 1.0
 * @date 2019/02/19 15:00
 */
public interface CodeUserDao {

    @Insert("insert into code_user values (#{id},#{username},#{realpwd},#{password},#{createDate})")
    void reg(CodeUser codeUser);

    @Select("select * from code_user where username = #{username}")
    CodeUser findOne(String username);
}
