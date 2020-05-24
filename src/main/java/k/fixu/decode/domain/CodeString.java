package k.fixu.decode.domain;

import java.io.Serializable;

/**
 * @author karrb
 * @version 1.0
 * @date 2019/02/19 14:48
 */
public class CodeString implements Serializable {

    private Long id;
    private String code;
    private String pwd;
    private String username;
    private int count;

    @Override
    public String toString() {
        return "CodeString{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", pwd='" + pwd + '\'' +
                ", username='" + username + '\'' +
                ", count=" + count +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
