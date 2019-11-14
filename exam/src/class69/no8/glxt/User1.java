package class69.no8.glxt;

import java.util.Date;

public class User1 {
    public int SheId;
    public String Shename;
    public String Shelei;
    public Date day;
    public User1(int SheId, String Shename, String Shelei,Date day) {
        this.SheId = SheId;
        this.Shename = Shename;
        this.Shelei = Shelei;
        this.day = day;
    }
    public User1(Object o, String num) {
    }

    public int getSheId() {
        return SheId;
    }

    public void setSheId(int sheId) {
        SheId = sheId;
    }

    public String getShename() {
        return Shename;
    }

    public void setShename(String shename) {
        Shename = shename;
    }

    public String getShelei() {
        return Shelei;
    }

    public void setShelei(String shelei) {
        Shelei = shelei;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}

