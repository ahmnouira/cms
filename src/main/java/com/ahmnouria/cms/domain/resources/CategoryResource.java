package com.ahmnouria.cms.domain.resources; 

import java.util.Arrays;
import java.util.List;

import com.ahmnouria.cms.domain.models.Category;
import com.ahmnouria.cms.domain.vo.CategoryRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable("id") String id){
        return ResponseEntity.ok(new Category()); 
    }

    @GetMapping
    public ResponseEntity<List<Category>> getCategoires() {
        return ResponseEntity.ok(Arrays.asList(new Category(), new Category())); 
    }

    @PostMapping
    public ResponseEntity<Category> postCategory(CategoryRequest categoryRequest) {
        return new ResponseEntity<>(new Category(), HttpStatus.CREATED); 
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable("id") String id) {

    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("id") String id, CategoryRequest categoryRequest) {
        return new ResponseEntity<Category>(new Category(), HttpStatus.OK); 
    }
    
}
