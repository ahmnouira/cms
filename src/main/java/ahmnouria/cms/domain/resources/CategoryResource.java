package ahmnouria.cms.domain.resources;

import java.util.Arrays;
import java.util.List;

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

import ahmnouria.cms.domain.models.Category;
import ahmnouria.cms.domain.vo.CategoryRequest;

/*
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
*/

@RestController
@RequestMapping("/api/category")
// @Api(tags = "category", description = "Category API")
public class CategoryResource {
    /*
     * @GetMapping(value = "/{id}")
     * 
     * @ApiOperation(value = "Find category")
     * 
     * @ApiResponses(value = {
     * 
     * @ApiResponse(code = 200, message = "Category found"),
     * 
     * @ApiResponse(code = 404, message = "Category not found"),
     * })
     */
    public ResponseEntity<Category> getCategory(@PathVariable("id") String id) {
        return ResponseEntity.ok(new Category());
    }

    @GetMapping
    /*
     * @ApiOperation(value = "List categories", notes = "List all categories")
     * 
     * @ApiResponses(value = {
     * 
     * @ApiResponse(code = 200, message = "Categories found"),
     * 
     * @ApiResponse(code = 4040, message = "Category not found")
     * })
     */
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
