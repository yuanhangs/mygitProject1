package exam;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author HLX
 * @Date 2019/11/14 15:44
 * 建设备实体类 (设备编号,设备名称,设备类型,入库日期 Date类型),构造函数重载
 */
public class Equipment implements Serializable {
    private  int eid;
    private String name;
    private String type;
    private Date date;

    /**
     * 构造方法的重载
     */
    public Equipment() {
    }

    public Equipment(int eid, String name, String type, Date date) {
        this.eid = eid;
        this.name = name;
        this.type = type;
        this.date = date;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
