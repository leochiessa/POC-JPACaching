package JPACaching.controllers;

import JPACaching.models.City;
import JPACaching.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cs;

    @PostMapping("")
    public ResponseEntity add(@RequestBody City c) {
        return cs.add(c);
    }

    @GetMapping("/{id}")
    public City get(@PathVariable Integer id) {
        return cs.get(id);
    }
}