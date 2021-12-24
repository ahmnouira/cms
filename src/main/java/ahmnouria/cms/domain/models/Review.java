package ahmnouria.cms.domain.models;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
/**
 * @author ahmnouira. Project cms
 */

public class Review {
    String userId; 
    String status; 
}
