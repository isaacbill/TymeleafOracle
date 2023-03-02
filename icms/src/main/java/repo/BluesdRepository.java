package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.BlueSd;



@Repository

public interface BluesdRepository extends JpaRepository<BlueSd, Integer> {

}
