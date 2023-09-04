package com.example.paymentsapp.controller;

import com.example.paymentsapp.model.FileDb;
import com.example.paymentsapp.service.FileDbService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/file")
public class FileOperationController {
    private final FileDbService fileDbService;

    public FileOperationController(FileDbService fileDbService) {
        this.fileDbService = fileDbService;
    }

    @PostMapping(path = "/upload")
    private FileDb uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getBytes());
        return fileDbService.store(file);
    }
    @GetMapping(path = "get/{id}")
    public FileDb getFile(@PathVariable Long id){
        return fileDbService.getFileById(id);
    }
    @GetMapping(path = "getAll")
    public List<FileDb> getAllFile(){
        return fileDbService.getFileList();
    }
}