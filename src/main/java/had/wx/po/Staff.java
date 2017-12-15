package had.wx.po;

/**
 * Created by HUIYE on 2017/12/14.
 */
public class Staff {
    private Long u_id;

    private String yn;

    private String u_name;

    private Long u_age;

    private String u_phone;

    private String school;

    private Long state;

    public Long getU_id() {
        return u_id;
    }

    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public Long getU_age() {
        return u_age;
    }

    public void setU_age(Long u_age) {
        this.u_age = u_age;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getYn() {
        return yn;
    }

    public void setYn(String yn) {
        this.yn = yn;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "u_id=" + u_id +
                ", yn='" + yn + '\'' +
                ", u_name='" + u_name + '\'' +
                ", u_age=" + u_age +
                ", u_phone='" + u_phone + '\'' +
                ", school='" + school + '\'' +
                ", state=" + state +
                '}';
    }
}
