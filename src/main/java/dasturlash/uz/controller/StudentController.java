package dasturlash.uz.controller;

import dasturlash.uz.dto.StudentDTO;
import dasturlash.uz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "/test", headers = {"secret-key=some-value", "user-id=27"})
    @ResponseBody
    public String test() {
        return "Salom Jigar";
    }

    @RequestMapping(value = "/greating", method = RequestMethod.GET)
    @ResponseBody
    public String greating() {
        return "Salom Jigar";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json", produces = "text/html")
    @ResponseBody
    public String saveStudent(@RequestBody StudentDTO student) {
        // save student
        return "Success";
    }

}
