package co.alexwilkinson.giflib.controllers;

import co.alexwilkinson.giflib.data.GifRepository;
import co.alexwilkinson.giflib.models.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Alex on 03/05/2017.
 */
@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping(value = "/")
    public String listGifs(ModelMap modelMap){
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";
    }
    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }

    @GetMapping("/favorites")
    public String favouriteGifs(ModelMap modelMap){

        List<Gif> favouriteGifs = gifRepository.findAllFavourites();
        modelMap.put("gifs", favouriteGifs);
        return "favorites";
    }

    @GetMapping("/gif2")
    @ResponseBody
    public String displayGif(){

        return "Just a gif will go here";
    }

}
