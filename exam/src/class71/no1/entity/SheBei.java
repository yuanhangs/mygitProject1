package class71.no1.entity;

public class SheBei {
    private int sId;//设备编号
    private  String sName;//设备名称
    private String sType;//设备类型
    private String sDate;//入库日期


    public SheBei(int sId, String sName, String sType, String sDate) {
        this.sId = sId;
        this.sName = sName;
        this.sType = sType;
        this.sDate = sDate;
    }
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }





}
