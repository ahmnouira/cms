package com.ahmnouria.cms.domain.vo;

import java.util.Set;

import com.ahmnouria.cms.domain.models.Category;
import com.ahmnouria.cms.domain.models.Tag;

import lombok.Data; 


@Data
public class NewsRequest {
   private String title; 
   private String content; 
   private Set<Category> categories; 
   private Set<Tag> tags;  
}
