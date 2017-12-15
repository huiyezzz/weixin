package had.wx.controller;

import had.wx.mapper.ManageMapper;
import had.wx.mapper.StaffMapper;
import had.wx.po.Manage;
import had.wx.po.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by HUIYE on 2017/12/15.
 */
public class ManageController {
    @Autowired
    private ManageMapper manageMapper;
    @RequestMapping("/manage")
    @ResponseBody
    public Manage query(int i){
        Manage manage = manageMapper.queryById(i);
        return manage;
    }
}
