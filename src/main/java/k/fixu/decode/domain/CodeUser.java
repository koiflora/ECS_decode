package k.fixu.decode.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author karrb
 * @version 1.0
 * @date 2019/02/19 14:47
 */
public class CodeUser implements Serializable {

    private Long id;

    private String username;
    private String realpwd;
    private String password;

    private Date createDate;

    @Override
    public String toString() {
        return "CodeUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realpwd='" + realpwd + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealpwd() {
        return realpwd;
    }

    public void setRealpwd(String realpwd) {
        this.realpwd = realpwd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
