package ahmnouria.cms.domain.services;
import java.util.List;

import org.springframework.stereotype.Service;

import ahmnouria.cms.domain.models.Category;
import ahmnouria.cms.domain.respositories.CategroyRepository;
import ahmnouria.cms.domain.vo.CategoryRequest;


@Service
public class CategoryService {

    private final CategroyRepository categroyRepository; 


    public CategoryService(CategroyRepository categroyRepository) {
        this.categroyRepository = categroyRepository; 
    }


    public Category update(Category category) {
        return this.categroyRepository.save(category); 
    }

    public Category add(CategoryRequest categoryRequest) {
        Category category = new Category(); 
        category.setName(categoryRequest.getName()); 
        return this.categroyRepository.save(category); 
    }

    public void delete(String id) {
        final Category category = this.categroyRepository.findOne(id); 
        this.categroyRepository.delete(category); 
    }

    public List<Category> findAll() {
        return this.categroyRepository.findAll(); 
    }

    public Category findOne(String id) {
        return this.categroyRepository.findOne(id); 
    }

}
