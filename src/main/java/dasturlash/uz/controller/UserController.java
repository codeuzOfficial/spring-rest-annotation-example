package dasturlash.uz.controller;

import dasturlash.uz.dto.BycycleDTO;
import dasturlash.uz.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createUser(@RequestBody UserDTO userDTO) {
        System.out.println();
        return "success";
    }
}
