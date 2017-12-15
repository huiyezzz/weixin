package had.wx.mapper;



import had.wx.po.Staff;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by HUIYE on 2017/12/14.
 */
@Component
public interface StaffMapper {
    List<Staff> query();
    void updateById(had.wx.po.StaffCustom staffCustom);
    void updateById2(had.wx.po.StaffCustom staffCustom);
    List<Staff> queryByState(int i);

}
