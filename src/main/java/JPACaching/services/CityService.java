package JPACaching.services;

import JPACaching.models.City;
import JPACaching.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@Service
public class CityService {

    @Autowired
    private final CityRepository cr;

    public CityService(CityRepository cr) {
        this.cr = cr;
    }

    public List<City> getAll() {
        return cr.findAll();
    }

    public ResponseEntity add(City c) {
        cr.save(c);
        return ResponseEntity.status(CREATED).build();
    }

    public City get(Integer id) {
        return cr.findById(id).get();
    }

    public City getByName(String name) {
        return cr.findByName(name);
    }
}