package ahmnouria.cms.domain.vo; 
import ahmnouria.cms.domain.models.Role;
import lombok.Data;

@Data
public class UserRequest {
       private String identity;
       private String name; 
       private Role role;
}
