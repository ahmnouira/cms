package ahmnouria.cms.domain.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ahmnouria.cms.domain.models.User;

public interface UserRepository extends JpaRepository<User, String> {

}