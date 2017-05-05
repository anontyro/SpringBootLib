package co.alexwilkinson.giflib.controllers;

import co.alexwilkinson.giflib.data.CategoryRepository;
import co.alexwilkinson.giflib.data.GifRepository;
import co.alexwilkinson.giflib.models.Category;
import co.alexwilkinson.giflib.models.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by Alex on 05/05/2017.
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @GetMapping("/categories")
    public String findCategories(ModelMap modelMap){
        List<Category> categories = categoryRepository.getAllCatagories();
        modelMap.put("categories", categories);
        return"categories";
    }

    @GetMapping("/categories/{id}")
    public String getTheCategory(@PathVariable int id, ModelMap modelMap){
        Category category = categoryRepository.findById(id);
        modelMap.put("category", category);

        List<Gif> gifs = gifRepository.findByCategoryId(id);
        modelMap.put("gifs", gifs);

        return"category";
    }

}
