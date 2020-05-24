package k.fixu.decode.dao;

import k.fixu.decode.domain.CodeString;
import k.fixu.decode.domain.CodeUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author karrb
 * @version 1.0
 * @date 2019/02/19 15:00
 */
public interface CodeDao {

    @Insert("insert into code_string values (#{id},#{code},#{pwd},#{count},#{username})")
    Long save(CodeString codeString);

    @Select("select * from code_string where id = #{id}")
    CodeString findOne(Long id);

    @Update("update code_string set count=#{count} where id = #{id}")
    void update(CodeString codeString);
}
