package class69.no2.user;

public class User {
    public int Id;
    public String name;
    public String pwd;
    public User(int Id, String name, String pwd) {
        this.Id = Id;
        this.name = name;
        this.pwd = pwd;
    }
    public User() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        Id = Id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
