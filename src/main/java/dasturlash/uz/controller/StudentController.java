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

//    @RequestMapping(value = "/best-student-list")
//    @ResponseBody
//    public ResponseEntity<List<StudentDTO>> getAll() {
//        List<StudentDTO> result = studentService.getAllStudent();
//        return ResponseEntity.ok(result);
//    }

//    @Autowired
//    StudentService studentService;
//
//    @PostMapping("")
//    public ResponseEntity<StudentDTO> create(@RequestBody StudentDTO dto) {
//        StudentDTO result = studentService.create(dto);
//        return ResponseEntity.ok(result);
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<StudentDTO> getById(@PathVariable String id) {
//        StudentDTO result = studentService.get(id);
//        return ResponseEntity.ok(result);
//    }

//    @PutMapping("/{id}")
//    public ResponseEntity<String> update(@RequestBody StudentDTO student, @PathVariable("id") String id) {
//        String result = studentService.updateStudent(student, id);
//        return ResponseEntity.ok(result);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
//        Boolean result = studentService.delete(id);
//        return ResponseEntity.ok(result);
//    }
}
