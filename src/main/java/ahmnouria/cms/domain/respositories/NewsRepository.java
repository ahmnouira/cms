package ahmnouria.cms.domain.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ahmnouria.cms.domain.models.News;

public interface NewsRepository extends JpaRepository<News, String> {

}