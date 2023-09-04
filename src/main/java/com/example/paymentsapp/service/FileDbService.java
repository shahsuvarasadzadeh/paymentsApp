package com.example.paymentsapp.service;

import com.example.paymentsapp.model.FileDb;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileDbService {
    FileDb store(MultipartFile file) throws IOException;
    FileDb getFileById(Long id);
    List<FileDb> getFileList();
}
