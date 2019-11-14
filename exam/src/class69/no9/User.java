package class69.no9;

public class User {
    int UserId;
    String UserName;
    int Password;

    public User() {
        super();

    }

    public User(int userId, String userName, int password) {
        super();
        UserId = userId;
        UserName = userName;
        Password = password;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }


}






