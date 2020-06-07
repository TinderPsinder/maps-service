package pl.zimny.repostiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zimny.model.Location;
import java.util.List;

@Repository
public interface LocationsRepository extends JpaRepository<Location, Long> {

    List<Location> findAll();
}
