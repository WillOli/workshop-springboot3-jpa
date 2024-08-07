package resources;

import com.willdev.course.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Categorys")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<Category> findAll() {
        Category u = new Category(1L, "Maria", "maria@gmail.com", "9999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
