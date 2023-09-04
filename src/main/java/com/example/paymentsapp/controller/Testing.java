package com.example.paymentsapp.controller;

import com.example.paymentsapp.model.FileDb;
import com.example.paymentsapp.service.FileDbService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/test")
public class Testing {
    private final FileDbService fileDbService;

    public Testing(FileDbService fileDbService) {
        this.fileDbService = fileDbService;
    }

    @PostMapping(path = "/fileUpload")
    private FileDb uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(Arrays.toString(file.getBytes()));
        return fileDbService.store(file);
    }
    @GetMapping(path = "getFile/{id}")
    public FileDb getFile(@PathVariable Long id){
        return fileDbService.getFileById(id);
    }
    @GetMapping(path = "getAllFile")
    public List<FileDb> getAllFile(){
        return fileDbService.getFileList();
    }
}
