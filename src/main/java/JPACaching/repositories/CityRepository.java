package JPACaching.repositories;

import JPACaching.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    @Query(value = "select * from city where name = :n", nativeQuery = true)
    City findByName(String n);
}