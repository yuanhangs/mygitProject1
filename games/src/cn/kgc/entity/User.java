package cn.kgc.entity;


public class User {

  private long id;   //编号
  private String userName;  //用户名
  private String userPassword; //密码
  private String userLoginName;   //账号
  private String userId;   //身份证号

  public User() {
  }

  public User(long id, String userName, String userPassword, String userLoginName, String userId) {
    this.id = id;
    this.userName = userName;
    this.userPassword = userPassword;
    this.userLoginName = userLoginName;
    this.userId = userId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public String getUserLoginName() {
    return userLoginName;
  }

  public void setUserLoginName(String userLoginName) {
    this.userLoginName = userLoginName;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

}
