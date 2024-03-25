package dasturlash.uz.controller;

import dasturlash.uz.dto.BycycleDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bycycle")
public class BycycleController {

    @RequestMapping(value = "/cheap", method = RequestMethod.GET)
    public BycycleDTO getCheapBycycle() {
        BycycleDTO dto = new BycycleDTO();
        dto.setModel("Qo'lda yasalgan  velik eng arzoni bo'lsa kerak");
        return dto;
    }
}
