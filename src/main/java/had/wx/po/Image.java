package had.wx.po;

/**
 * Created by HUIYE on 2017/12/25.
 */
public class Image {
    private String openId;
    private String filename;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "Image{" +
                "openId='" + openId + '\'' +
                ", filename='" + filename + '\'' +
                '}';
    }

    public Image(String openId, String filename) {
        this.openId = openId;
        this.filename = filename;
    }
}
