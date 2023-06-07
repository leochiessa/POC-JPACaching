package JPACaching.repositories;

import JPACaching.models.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TownRepository extends JpaRepository<Town, Integer> {
    @Query(value = "select * from town where name = :n", nativeQuery = true)
    Town findByName(String n);
}