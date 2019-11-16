package net.hlx.entity;

/**
 * @Author HLX
 * @Date 2019/11/15 15:13
 */
public class Membersinfo {
    private int id;
    private String mname;
    private String mgender;
    private int mage;
    private String maddress;
    private String memail;

    public Membersinfo() {
    }

    public Membersinfo(int id, String mname, String mgender, int mage, String maddress, String memail) {
        this.id = id;
        this.mname = mname;
        this.mgender = mgender;
        this.mage = mage;
        this.maddress = maddress;
        this.memail = memail;
    }

    public Membersinfo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMgender() {
        return mgender;
    }

    public void setMgender(String mgender) {
        this.mgender = mgender;
    }

    public int getMage() {
        return mage;
    }

    public void setMage(int mage) {
        this.mage = mage;
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress;
    }

    public String getMemail() {
        return memail;
    }

    public void setMemail(String memail) {
        this.memail = memail;
    }

    @Override
    public String toString() {
        return "Membersinfo{" +
                "id=" + id +
                ", mname='" + mname + '\'' +
                ", mgender='" + mgender + '\'' +
                ", mage=" + mage +
                ", maddress='" + maddress + '\'' +
                ", memail='" + memail + '\'' +
                '}';
    }
}
