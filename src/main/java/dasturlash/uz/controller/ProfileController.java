package dasturlash.uz.controller;

import dasturlash.uz.dto.ProfileDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    @ResponseBody
    public ProfileDTO getDefaultAdmin() {
        ProfileDTO dto = new ProfileDTO();
        dto.setName("Alish");
        dto.setSurname("Mazgiyev");
        return dto;
    }
}
