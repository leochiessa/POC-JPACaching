package JPACaching.controllers;

import JPACaching.models.Town;
import JPACaching.services.TownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/town")
public class TownController {

    @Autowired
    private TownService ts;

    @GetMapping("")
    public List<Town> getAll() {
        return ts.getAll();
    }

    @PostMapping("")
    public ResponseEntity add(@RequestBody Town t) {
        return ts.add(t);
    }

    @GetMapping("/{id}")
    public Town get(@PathVariable Integer id) {
        return ts.get(id);
    }

    @GetMapping("/getByName/{name}")
    public Town getByName(@PathVariable String name) {
        return ts.getByName(name);
    }
}