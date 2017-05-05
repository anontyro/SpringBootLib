package co.alexwilkinson.giflib.data;

import co.alexwilkinson.giflib.models.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Alex on 05/05/2017.
 */
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATAGORIES = Arrays.asList(
            new Category(0,"Funny"),
            new Category(1,"Technology"),
            new Category(2,"Wacky")

            );

    public List<Category> getAllCatagories(){
        return ALL_CATAGORIES;
    }

    public Category findById(int id){
        for(Category category : ALL_CATAGORIES){
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }





}
