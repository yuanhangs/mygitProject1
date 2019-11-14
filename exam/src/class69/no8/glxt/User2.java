package class69.no8.glxt;

public class User2 {
    public int UserId;
    public String Username;
    public String pwd;
    public User2(int UserId, String Username, String pwd) {
        this.UserId = UserId;
        this.Username = Username;
        this.pwd = pwd;
    }
    public User2() {
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

