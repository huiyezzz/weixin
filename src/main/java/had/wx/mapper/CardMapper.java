package had.wx.mapper;

import had.wx.po.Card;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by HUIYE on 2017/12/22.
 */
@Component
public interface CardMapper {
    Card queryById(String id);
    void insert(Card card);
}
