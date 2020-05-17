package xyz.codedog.po;


public class Admin {

    private Integer aId;

    private String aUsername;

    private String aPassword;

    private String aName;

    private Long aPhone;

    private String aPower;

    private String aDescribe;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaUsername() {
        return aUsername;
    }

    public void setaUsername(String aUsername) {
        this.aUsername = aUsername == null ? null : aUsername.trim();
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword == null ? null : aPassword.trim();
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public Long getaPhone() {
        return aPhone;
    }

    public void setaPhone(Long aPhone) {
        this.aPhone = aPhone;
    }


    public String getaPower() {
        return aPower;
    }


    public void setaPower(String aPower) {
        this.aPower = aPower == null ? null : aPower.trim();
    }

    public String getaDescribe() {
        return aDescribe;
    }

    public void setaDescribe(String aDescribe) {
        this.aDescribe = aDescribe == null ? null : aDescribe.trim();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aId=" + aId +
                ", aUsername='" + aUsername + '\'' +
                ", aPassword='" + aPassword + '\'' +
                ", aName='" + aName + '\'' +
                ", aPhone=" + aPhone +
                ", aPower='" + aPower + '\'' +
                ", aDescribe='" + aDescribe + '\'' +
                '}';
    }
}