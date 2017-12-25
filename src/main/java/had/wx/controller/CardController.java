package had.wx.controller;

import had.wx.mapper.CardMapper;
import had.wx.mapper.ImageMapper;
import had.wx.po.Card;
import had.wx.po.Cardcuster;
import had.wx.po.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Created by HUIYE on 2017/12/22.
 */
@Controller
public class CardController {
    @Autowired
    private CardMapper cardMapper;
    @Autowired
    private ImageMapper imageMapper;

    @RequestMapping("/CardqueryById")
    @ResponseBody
    public Card queryById(String id){
        Cardcuster cardcuster = cardMapper.queryById(id);
        List<Image> images = imageMapper.queryById(id);
        cardcuster.setList(images);
        return cardcuster;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Card queryById(Card card){
        System.out.println(card);
        cardMapper.insert(card);
        return card;
    }

    @RequestMapping("/shangchuan")
    @ResponseBody
    public String test(String id,MultipartFile file,HttpServletRequest request) throws IOException{
        String path = request.getSession().getServletContext().getRealPath("/images");
        System.out.println("path>>"+path);
        String fileName = file.getOriginalFilename();
        String newfileName= UUID.randomUUID()+fileName.substring(fileName.lastIndexOf("."));
        System.out.println("fileName>>"+newfileName);
        File dir = new File(path, newfileName);
        System.out.println("dir.exists()>>"+dir.exists());
        if(!dir.exists()){
            dir.mkdirs();
        }
        System.out.println("dir.exists()>>"+dir.exists());
//		MultipartFile自带的解析方法
        file.transferTo(dir);
        Image image = new Image(id, newfileName);
        imageMapper.insert(image);
        return "ok";
    }

}
