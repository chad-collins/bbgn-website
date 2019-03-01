package tv.bbgn.bbgnwebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tv.bbgn.bbgnwebsite.models.Review;

@Repository
public interface ReviewsRepository extends CrudRepository<Review, Long>{

}
