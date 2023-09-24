package com.example.paymentsapp.service;
import com.example.paymentsapp.dto.CreateDto;
import com.example.paymentsapp.dto.UpdateDTO;
import com.example.paymentsapp.exceptions.NotFoundException;
import com.example.paymentsapp.model.StudentModel;
import com.example.paymentsapp.repository.CourseRepository;
import com.example.paymentsapp.repository.PA_Repository;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class PA_Service implements PA_Interface{
    private final PA_Repository paRepository;
    public PA_Service(PA_Repository paRepository) {
        this.paRepository = paRepository;
    }
    @Override
    public StudentModel createUser(CreateDto user) {
        return paRepository.save(new StudentModel(user.getName(),
                user.getSurname(),user.getEmail(),user.getNumber()));
    }
    @Override
    public Set<StudentModel> getAllUsers() {
        List<StudentModel> all=paRepository.findAll();
        return new HashSet<>(all);
    }
    @Override
    public StudentModel updateStudent(UpdateDTO updateDTO, Long id) {
        final StudentModel st=paRepository.findById(id).
                orElseThrow(() -> new NotFoundException("user not found"));
        st.setName(updateDTO.getName());
        st.setSurname(updateDTO.getSurname());
        st.setEmail(updateDTO.getEmail());
        st.setNumber(updateDTO.getNumber());
        return paRepository.save(st);
    }
    @Override
    public Set<StudentModel> getUserByNumber(String number) {
        List<StudentModel> st=paRepository.findByNumber(number);
        return new HashSet<>(st);
    }
    @Override
    public List<StudentModel> findByName(String name) {
        return paRepository.findByNameContaining(name);
    }
}