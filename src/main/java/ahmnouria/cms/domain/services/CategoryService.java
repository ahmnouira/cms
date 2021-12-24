package ahmnouria.cms.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ahmnouria.cms.domain.models.Category;
import ahmnouria.cms.domain.respositories.CategroyRepository;
import ahmnouria.cms.domain.vo.CategoryRequest;

@Service
@Transactional(readOnly = true)
public class CategoryService {

    private final CategroyRepository categroyRepository;

    public CategoryService(CategroyRepository categroyRepository) {
        this.categroyRepository = categroyRepository;
    }

    @Transactional
    public Category update(Category category) {
        return this.categroyRepository.save(category);
    }

    @Transactional
    public Category create(CategoryRequest categoryRequest) {
        Category category = new Category();
        category.setName(categoryRequest.getName());
        return this.categroyRepository.save(category);
    }

    @Transactional
    public void delete(String id) {
        final Optional<Category> category = this.categroyRepository.findById(id);
        category.ifPresent(this.categroyRepository::delete);
    }

    public List<Category> findAll() {
        return this.categroyRepository.findAll();
    }

    public List<Category> findByName(String name) {
        return this.categroyRepository.findByName(name);
    }

    public List<Category> findByNameStaringWith(String name) {
        return this.categroyRepository.findByNameIngnoreCaseStartingWith(name);
    }

    public Category findOne(String id) {
        final Optional<Category> category = this.categroyRepository.findById(id);

        if (category.isPresent()) {
            return category.get();
        } else {
            throw new Error();
        }

    }

}
