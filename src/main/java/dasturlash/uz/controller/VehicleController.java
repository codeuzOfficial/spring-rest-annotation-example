package dasturlash.uz.controller;

import dasturlash.uz.dto.VehicleDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {

    @GetMapping(value = "/info")
    public String info() {
        return "Return some vehicle information.";
    }

    @GetMapping(value = "/info/{id}")
    public VehicleDTO getVehicle(@PathVariable("id") Integer id) {
        VehicleDTO dto = new VehicleDTO();
        dto.setId(id);
        dto.setModel("Test model");
        return dto;
    }

    @PostMapping(value = "/create")
    public String createVehicle(@RequestBody VehicleDTO vehicleDTO) {
        System.out.println("New vehicle is created: " + vehicleDTO);
        return "Success";
    }

    @PutMapping(value = "/update/{id}")
    public String updateVehicle(@PathVariable("id") Integer id,
                                @RequestBody VehicleDTO vehicleDTO) {
        System.out.println("Vehicle with id = " + id + " updated = " + vehicleDTO);
        return "Success";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteVehicle(@PathVariable("id") Integer id) {
        System.out.println("Delete vehicle with id = " + id);
        return "Success";
    }
}
