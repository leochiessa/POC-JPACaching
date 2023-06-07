package JPACaching.services;

import JPACaching.models.Town;
import JPACaching.repositories.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@Service
public class TownService {

    @Autowired
    private final TownRepository tr;

    public TownService(TownRepository tr) {
        this.tr = tr;
    }

    public List<Town> getAll() {
        return tr.findAll();
    }

    public ResponseEntity add(Town t) {
        tr.save(t);
        return ResponseEntity.status(CREATED).build();
    }

    public Town get(Integer id) {
        return tr.findById(id).get();
    }

    public Town getByName(String name) {
        return tr.findByName(name);
    }
}