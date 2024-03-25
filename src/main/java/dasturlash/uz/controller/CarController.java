package dasturlash.uz.controller;

import dasturlash.uz.dto.CarDTO;
import dasturlash.uz.dto.ProfileDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/car")
public class CarController {

    @RequestMapping(value = "/tico", method = RequestMethod.GET)
    public CarDTO getTico() {
        CarDTO dto = new CarDTO();
        dto.setModel("Tico");
        return dto;
    }

    @RequestMapping(value = "/lacetti", method = RequestMethod.GET)
    public CarDTO getLacetti() {
        CarDTO dto = new CarDTO();
        dto.setModel("Lacetti");
        return dto;
    }
}
