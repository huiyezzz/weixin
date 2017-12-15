package had.wx.po;

/**
 * Created by HUIYE on 2017/12/15.
 */
public class Manage {
    private String m_name;
    private Long m_age;
    private String m_phone;
    private String m_password;
    private Long level;

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public Long getM_age() {
        return m_age;
    }

    public void setM_age(Long m_age) {
        this.m_age = m_age;
    }

    public String getM_phone() {
        return m_phone;
    }

    public void setM_phone(String m_phone) {
        this.m_phone = m_phone;
    }

    public String getM_password() {
        return m_password;
    }

    public void setM_password(String m_password) {
        this.m_password = m_password;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Manage{" +
                "m_name='" + m_name + '\'' +
                ", m_age=" + m_age +
                ", m_phone='" + m_phone + '\'' +
                ", m_password='" + m_password + '\'' +
                ", level=" + level +
                '}';
    }
}
