package class69.no11;

import java.util.Date;

public class shebei {
    private int shebeibh;

    private String shebeiname;

    private  String shebeilx;

    private Date rukusj;

    public shebei() {
      //无参
    }


    //有参
    public shebei(int shebeibh, String shebeiname, String shebeilx, Date rukusj) {
        this.shebeibh = shebeibh;
        this.shebeiname = shebeiname;
        this.shebeilx = shebeilx;
        this.rukusj = rukusj;
    }

    //封装
    public int getShebeibh() {
        return shebeibh;
    }

    public void setShebeibh(int shebeibh) {
        this.shebeibh = shebeibh;
    }

    public String getShebeiname() {
        return shebeiname;
    }

    public void setShebeiname(String shebeiname) {
        this.shebeiname = shebeiname;
    }

    public String getShebeilx() {
        return shebeilx;
    }

    public void setShebeilx(String shebeilx) {
        this.shebeilx = shebeilx;
    }

    public Date getRukusj() {
        return rukusj;
    }

    public void setRukusj(Date rukusj) {
        this.rukusj = rukusj;
    }
}
