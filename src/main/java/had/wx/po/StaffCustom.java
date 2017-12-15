package had.wx.po;

import java.util.Arrays;

/**
 * Created by HUIYE on 2017/12/14.
 */
public class StaffCustom extends Staff {
    private int[] ids;

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "StaffCustom{" +
                "ids=" + Arrays.toString(ids) +
                '}';
    }
}
