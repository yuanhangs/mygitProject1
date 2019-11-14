package class69.no11;

public class yonghu {
    private int id;//用户编号

    private String name;//用户名


    private String pwd;//密码

    public yonghu() {
        //无参
    }

    public yonghu(int id, String name, String pwd) {
        //有参
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    //封装
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
