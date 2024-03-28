//package com.crio.XLMS.controller;
///*
// * @author adityagupta
// * @date 24/03/24
// */
//
//import com.crio.XLMS.entity.Student;
//import com.crio.XLMS.service.StudentService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@ExtendWith(MockitoExtension.class)
//@SpringBootTest
//@WebMvcTest
//@AutoConfigureMockMvc
//public class StudentControllerTests {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Mock
//    private StudentService studentService;
//
//    @InjectMocks
//    private StudentController studentController;
//
//    @Test
//    public void testGetAllStudents() throws Exception {
//        List<Student> students = Arrays.asList(
//                new Student(1L, "REG001", "John Doe", null, null),
//                new Student(2L, "REG002", "Jane Smith", null, null)
//        );        when(studentService.getAllStudents()).thenReturn(students);
//
//        mockMvc.perform(get("/students"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$").isArray())
//                .andExpect(jsonPath("$[0].id").value(1))
//                .andExpect(jsonPath("$[0].name").value("John Doe"))
//                .andExpect(jsonPath("$[1].id").value(2))
//                .andExpect(jsonPath("$[1].name").value("Jane Smith"));
//
//        verify(studentService, times(1)).getAllStudents();
//    }
//
//    @Test
//    public void testGetStudentById() throws Exception {
//        Long studentId = 1L;
//        Student student = new Student(1L, "REG001", "John Doe", null, null);
//
//        when(studentService.getStudentById(studentId)).thenReturn(java.util.Optional.of(student));
//
//        mockMvc.perform(get("/students/{id}", studentId))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id").value(studentId))
//                .andExpect(jsonPath("$.name").value("John Doe"));
//
//        verify(studentService, times(1)).getStudentById(studentId);
//    }
//
//}
//
