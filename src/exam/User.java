package exam;

import java.io.Serializable;

/**
 * @Author HLX
 * @Date 2019/11/14 15:38
 *   1.创建用户实体类 (用户编号,用户名,密码),构造函数重载
 */
public class User implements Serializable {
    private int id;
    private String name;
    private String pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * 重载
     * @param id
     * @param name
     * @param pass
     */
    public User(int id, java.lang.String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    public User() {
    }

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }


}
