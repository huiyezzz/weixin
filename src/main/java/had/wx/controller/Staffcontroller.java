package had.wx.controller;


import had.wx.mapper.StaffMapper;
import had.wx.po.Staff;
import had.wx.po.StaffCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HUIYE on 2017/12/14.
 */
@Controller
public class Staffcontroller {

    @Autowired
    private StaffMapper staffMapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<Staff> query(int i){
        List<Staff> query = staffMapper.queryByState(i);
        return query;
    }

    @RequestMapping("/update")
    @ResponseBody
    public List<Staff> update(int[] ids,boolean bn){
//        System.out.println(Arrays.toString(ids));

//        System.out.println(Arrays.toString(ids));

        if(ids!=null){
            StaffCustom staffCustom=new StaffCustom();
            staffCustom.setIds(ids);
            if(bn){
                staffMapper.updateById(staffCustom);

            }
            else {
                staffMapper.updateById2(staffCustom);

            }
        }
        List<Staff> query = staffMapper.queryByState(0);

        return query;
    }
}
