package com.example.paymentsapp.service;

import com.example.paymentsapp.model.FileDb;
import com.example.paymentsapp.repository.FileDBRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class FileDbImpl implements FileDbService {
    private final FileDBRepository fileDBRepository;
    public FileDbImpl(FileDBRepository fileDBRepository) {
        this.fileDBRepository = fileDBRepository;
    }
    @Override
    public FileDb store(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        FileDb fileDb = new FileDb(fileName, file.getContentType(),
                file.getBytes());
        return fileDBRepository.save(fileDb);
    }

    @Override
    public FileDb getFileById(Long id) {
        Optional<FileDb> fileDbOptional=fileDBRepository.findById(id);
        if(fileDbOptional.isPresent()){
            return fileDbOptional.get();
        }
        return null;
    }
    @Override
    public List<FileDb> getFileList() {
        return fileDBRepository.findAll();
    }

}
