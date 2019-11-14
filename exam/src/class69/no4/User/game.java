package class69.no4.User;

public class game {

    private int gameid;         //设备编号
    private String gamename;   //设备名称
    private String gamelx;     //设备类型
    private String gametime;   //入库日期
    private String gameDatalx; //Data类型

    public game(){}
    public game(int gameid,String gamename,String gamelx,String gametime,String gameDatalx){
        this.gameid=gameid;
        this.gamename=gamename;
        this.gamelx=gamelx;
        this.gametime=gametime;
        this.gameDatalx=gameDatalx;
    }

    public int getGameid() {
        return gameid;
    }

    public void setGameid(int gameid) {
        this.gameid = gameid;
    }

    public String getGamename() {
        return gamename;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename;
    }

    public String getGamelx() {
        return gamelx;
    }

    public void setGamelx(String gamelx) {
        this.gamelx = gamelx;
    }

    public String getGametime() {
        return gametime;
    }

    public void setGametime(String gametime) {
        this.gametime = gametime;
    }

    public String getGameDatalx() {
        return gameDatalx;
    }

    public void setGameDatalx(String gameDatalx) {
        this.gameDatalx = gameDatalx;
    }



}
