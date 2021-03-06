package had.wx.po;

/**
 * Created by HUIYE on 2017/12/22.
 */
public class Card {
    private String name;
    private String phone;
    private String email;
    private String more;
    private String company;
    private String duty;
    private String openId;
    private Long finger;
    private Long eye;
    private String companymore;
    private String productmore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Long getFinger() {
        return finger;
    }

    public void setFinger(Long finger) {
        this.finger = finger;
    }

    public Long getEye() {
        return eye;
    }

    public void setEye(Long eye) {
        this.eye = eye;
    }

    public String getCompanymore() {
        return companymore;
    }

    public void setCompanymore(String companymore) {
        this.companymore = companymore;
    }

    public String getProductmore() {
        return productmore;
    }

    public void setProductmore(String productmore) {
        this.productmore = productmore;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", more='" + more + '\'' +
                ", company='" + company + '\'' +
                ", duty='" + duty + '\'' +
                ", openId='" + openId + '\'' +
                ", finger=" + finger +
                ", eye=" + eye +
                ", companymore='" + companymore + '\'' +
                ", productmore='" + productmore + '\'' +
                '}';
    }
}
