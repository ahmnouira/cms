package ahmnouria.cms.domain.models;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Tag {
    String name; 
}
