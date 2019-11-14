package class69.no2.s;

import java.util.Date;

public class Sb {
    public int SId;
    public String Sname;
    public String Slei;
    public Date day;
    public Sb(int SId, String Sname, String Slei,Date day) {
        this.SId = SId;
        this.Sname = Sname;
        this.Slei = Slei;
        this.day = day;
    }
    public Sb(Object o, String num) {
    }

    public int getSId() {
        return SId;
    }

    public void setSId(int sId) {
    	SId = SId;
    }

    public String Sname() {
        return Sname;
    }

    public void setSname(String sname) {
    	Sname = sname;
    }

    public String getSlei() {
        return Slei;
    }

    public void setSlei(String slei) {
        Slei = slei;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
