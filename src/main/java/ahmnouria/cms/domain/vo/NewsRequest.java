package ahmnouria.cms.domain.vo;

import java.util.Set;

import ahmnouria.cms.domain.models.Category;
import ahmnouria.cms.domain.models.Tag;
import lombok.Data; 


@Data
public class NewsRequest {
   private String title; 
   private String content; 
   private Set<Category> categories; 
   private Set<Tag> tags;  
}
