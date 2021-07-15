package com.dio.demo.Controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.demo.Model.JornadadTrabalho;
import com.dio.demo.Service.JornadaService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
	@Autowired
    JornadaService workdayService;

    @PostMapping
    public JornadadTrabalho createWorkay(@RequestBody JornadadTrabalho workday){
        return workdayService.save(workday);
    }

    @GetMapping
    public List<JornadadTrabalho> getWorkdayList(){
        return workdayService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadadTrabalho>  getWorkdayById(@PathVariable("id") Long id ) throws Exception {
       return ResponseEntity.ok(workdayService.findById(id).orElseThrow(()->new Exception("Workday not found")));
    }

    @PutMapping
    public JornadadTrabalho updateWorkday(@RequestBody JornadadTrabalho workday){
        return workdayService.update(workday);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<JornadadTrabalho> deleteWorkday(@PathVariable("id") Long id) {
             workdayService.deleteWorkday(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
}
