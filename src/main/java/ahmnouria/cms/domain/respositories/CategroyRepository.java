package ahmnouria.cms.domain.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ahmnouria.cms.domain.models.Category;

public interface CategroyRepository extends JpaRepository<Category, String> {

    List<Category> findByName(String name);

    List<Category> findByNameIngnoreCaseStartingWith(String name);

}
