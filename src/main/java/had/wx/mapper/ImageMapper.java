package had.wx.mapper;

import had.wx.po.Image;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by HUIYE on 2017/12/25.
 */
@Component
public interface ImageMapper {
     List<Image> queryById(String id);
     void insert(Image image);

}
