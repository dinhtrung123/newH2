package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Student;
import com.mycompany.myapp.service.dto.StudentDTO;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.mappers.ModelMapper;

import java.util.Optional;


@Component
public class StudentConverter {
    public StudentDTO toDto (Student sEntity){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(sEntity.getId());
        studentDTO.setHoTen(sEntity.getHoTen());
        studentDTO.setMaGioiTinh(sEntity.getMaGioiTinh());
        studentDTO.setMaSinhVien(sEntity.getMaSinhVien());
        studentDTO.setNgaySinh(sEntity.getNgaySinh());
        studentDTO.setQuocTich(sEntity.getQuocTich());
        return studentDTO ;


    }
    public Student toEntity (StudentDTO studentDTO){
        Student student = new Student();
        student.setId(studentDTO.getId());
        student.setHoTen(studentDTO.getHoTen());
        student.setMaGioiTinh(studentDTO.getMaGioiTinh());
        student.setMaSinhVien(studentDTO.getMaSinhVien());
        student.setNgaySinh(studentDTO.getNgaySinh());
        student.setQuocTich(studentDTO.getQuocTich());
        return student ;


    }
    public  Optional<Student> toEntity(Optional<Student> student, StudentDTO studentDTO){
        student.get().setHoTen(studentDTO.getHoTen());
        student.get().setMaGioiTinh(studentDTO.getMaGioiTinh());
        student.get().setMaSinhVien(studentDTO.getMaSinhVien());
        student.get().setNgaySinh(studentDTO.getNgaySinh());
        student.get().setQuocTich(studentDTO.getQuocTich());
        return student;
    }
}
