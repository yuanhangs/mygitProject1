package class69.no9;

public class shebei {
    //设备编号,设备名称,设备类型,入库日期 Date类型
    int sbId;
    String sbName;
    String sbType;
    String sbDay;
    String dateType;

    public shebei() {
        super();

    }

    public shebei(int sbId, String sbName, String sbType, String sbDay,
                  String dateType) {
        super();
        this.sbId = sbId;
        this.sbName = sbName;
        this.sbType = sbType;
        this.sbDay = sbDay;
        this.dateType = dateType;
    }

    public int getSbId() {
        return sbId;
    }

    public void setSbId(int sbId) {
        this.sbId = sbId;
    }

    public String getSbName() {
        return sbName;
    }

    public void setSbName(String sbName) {
        this.sbName = sbName;
    }

    public String getSbType() {
        return sbType;
    }

    public void setSbType(String sbType) {
        this.sbType = sbType;
    }

    public String getSbDay() {
        return sbDay;
    }

    public void setSbDay(String sbDay) {
        this.sbDay = sbDay;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }



}




