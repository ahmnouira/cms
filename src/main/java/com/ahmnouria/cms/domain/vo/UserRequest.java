package com.ahmnouria.cms.domain.vo; 
import com.ahmnouria.cms.domain.models.Role;

import lombok.Data;

@Data
public class UserRequest {
       private String identity;
       private String name; 
       private Role role;
}
