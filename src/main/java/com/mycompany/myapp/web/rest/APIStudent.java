package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.domain.Student;
import com.mycompany.myapp.domain.User;
import com.mycompany.myapp.repository.StudentRepository;
import com.mycompany.myapp.security.AuthoritiesConstants;
import com.mycompany.myapp.service.StudentService;
import com.mycompany.myapp.service.dto.*;
import com.mycompany.myapp.service.dto.UserDTO;
import io.github.jhipster.web.util.HeaderUtil;
import liquibase.pro.packaged.s;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class APIStudent {
    private final Logger log = LoggerFactory.getLogger(UserResource.class);
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentService studentService ;

    @GetMapping("/student")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> rows = studentService.getAllStudent() ;
        return new ResponseEntity<>(rows, HttpStatus.OK);
    }
    @GetMapping("/student/{id}")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public ResponseEntity<Optional<Student>> getStudent(@PathVariable ("id") Long id ) {
        Optional<Student> rows = studentService.getStudent(id) ;
        return  new ResponseEntity<>( rows,HttpStatus.OK) ;
    }
    @PostMapping("/student")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public ResponseEntity<StudentDTO> create(@Valid @RequestBody StudentDTO studentDto) throws URISyntaxException {
        log.debug("REST request to save User : {}", studentDto);
        System.out.println("ketssssssssssssssss" );
        studentService.insert(studentDto) ;
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(studentDto);
    }


    @PutMapping("/student")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public ResponseEntity<StudentDTO> updateNew(@Valid @RequestBody StudentDTO studentDto){
        studentService.update(studentDto) ;
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(studentDto) ;
    }

    @DeleteMapping("/student/{id}")
    public  void  deleteNew(@PathVariable long id){
        studentService.delete(id);

    }
    @DeleteMapping("/student")
    public  void  delete(@RequestBody long[] id){
        studentService.delete(id);

    }

}
