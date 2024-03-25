package dasturlash.uz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/flat")
public class FlatController {

    @GetMapping(value = "/filter")
    public String filter(@RequestParam("room") Integer room,
                         @RequestParam("floor") Integer floor,
                         @RequestParam(value = "location") String location) {
        return "Filtering flat with roomCount: " + room + " floor: " + floor + " location: " + location;
    }

    @GetMapping(value = "/search")
    public String search(@RequestParam(value = "title", required = false) String title,
                         @RequestParam(value = "location", required = false) String location) {
        return "Searching flat with title: " + title + " location: " + location;
    }

}
