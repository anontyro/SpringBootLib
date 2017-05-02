package co.alexwilkinson.giflib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Alex on 03/05/2017.
 */
@Controller
public class GifController {

    @RequestMapping(value = "/")
    public String listGifs(){

        return "index";
    }

    @GetMapping("/gif")
    @ResponseBody
    public String displayGif(){

        return "Just a gif will go here";
    }

}
