package com.example.paymentsapp.controller;
import com.example.paymentsapp.model.FileDb;
import com.example.paymentsapp.service.FileDbService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
@RestController
@RequestMapping(path = "/file")
public class FileOperationController {
    private final FileDbService fileDbService;
    public FileOperationController(FileDbService fileDbService) {
        this.fileDbService = fileDbService;
    }
    @PostMapping(path = "/upload")
<<<<<<< HEAD
    private FileDb uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
        return fileDbService.store(file);
=======
    private ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file)     {
        String message = "";
        try {
            fileDbService.store(file);
            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
>>>>>>> 02b58514caf58e55a4d9c5a03e35c29e848ba007
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