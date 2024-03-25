package dasturlash.uz.controller;

import dasturlash.uz.dto.AnimalDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveAnimal(@RequestBody AnimalDTO animal) {
        System.out.println("New animal is created " + animal);
        return "Success";
    }
}
