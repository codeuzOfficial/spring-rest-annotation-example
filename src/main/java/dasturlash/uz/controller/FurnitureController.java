package dasturlash.uz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/furniture")
public class FurnitureController {

    @GetMapping(value = "/one/{id}")
    public String getById(@PathVariable("id") Integer furnitureId) {
        System.out.println("Getting furniture by id: " + furnitureId);
        return "Returning furniture with id: " + furnitureId;
    }

    @GetMapping(value = "/search/{model}/{price}")
    public String search(@PathVariable("model") String furnitureModel,
                         @PathVariable("price") Double furniturePrice) {
        System.out.println("Searching furniture with model: " + furnitureModel + " price: " + furniturePrice);
        return "Searching furniture with model: " + furnitureModel + " price: " + furniturePrice;
    }

    @GetMapping(value = {"/filter", "/filter/{model}"})
    public String filter(@PathVariable(name = "model", required = false) String furnitureModel) {
        System.out.println("Filtering furniture with model: " + furnitureModel);
        return "Filtering furniture with model: " + furnitureModel;
    }
}
