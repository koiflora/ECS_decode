package k.fixu.decode.domain;

/**
 * @author karrb
 * @version 1.0
 * @date 2019/02/19 14:56
 */
public class Result {
    private boolean flag;
    private String message;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }
}
