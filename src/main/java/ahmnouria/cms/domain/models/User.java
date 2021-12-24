package ahmnouria.cms.domain.models;

import lombok.Data;

/**
 * @author ahmnouira on 23/11/2021. Project cms
 */
 
@Data
public class User {
    String id; 
    String identity;
    String name; 
    Role role;
}
