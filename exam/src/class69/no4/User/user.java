package class69.no4.User;

public class user {
    private int id;   //用户编号
    private String name;//用户名
    private String password;//密码

    public user(){}
    public user(int id,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
