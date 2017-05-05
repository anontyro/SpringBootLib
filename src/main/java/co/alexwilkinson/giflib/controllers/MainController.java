package co.alexwilkinson.giflib.controllers;

import co.alexwilkinson.giflib.data.GifRepository;
import co.alexwilkinson.giflib.models.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Alex on 05/05/2017.
 */
@Controller
public class MainController {
    @Autowired
    private GifRepository gifRepository;

    @GetMapping("/favorites")
    public String favouriteGifs(ModelMap modelMap){

        List<Gif> favouriteGifs = gifRepository.findAllFavourites();
        modelMap.put("gifs", favouriteGifs);
        return "favorites";
    }

    @GetMapping("/search")
    public String searchPage(@RequestParam(required = false) String q, ModelMap modelMap){
        if(q == null){
            return "home";
        }
        List<Gif> searchQuery = gifRepository.searchQuery(q);
        modelMap.put("gifs", searchQuery);

        return "search";
    }

}
