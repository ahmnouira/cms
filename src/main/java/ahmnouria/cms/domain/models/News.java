package ahmnouria.cms.domain.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uiid", strategy = "uuid")
    String id;
    String title;
    String content;

    @ManyToOne
    User author;

    @OneToMany
    Set<User> mandatoryReviewers = new HashSet<>();

    @ElementCollection
    Set<Review> reviewers = new HashSet<>();

    @OneToMany
    Set<Category> categories = new HashSet<>();

    @ElementCollection
    Set<Tag> tags = new HashSet<>();

    public Boolean revised() {
        return mandatoryReviewers.stream().allMatch(reviewer -> this.reviewers.stream()
                .anyMatch(review -> reviewer.id.equals(review.userId) && "approved".equals(review.status)));
    }

    public Review review(String userId, String status) {
        final Review review = new Review(userId, status);
        this.reviewers.add(review);
        return review;
    }
}
