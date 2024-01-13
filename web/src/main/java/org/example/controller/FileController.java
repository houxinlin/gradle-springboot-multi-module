package org.example.controller;

import org.example.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {
    @PostMapping("add")
    public String add(MultipartFile file) {
        System.out.println(file.getSize());
        return file.getOriginalFilename();
    }

    @PostMapping("adds")
    public String adds(List<MultipartFile> file) {
        for (MultipartFile multipartFile : file) {
            System.out.println(multipartFile.getName() + " " + multipartFile.getSize());
        }
        return "success";
    }


    @PostMapping("getImage")
    public ResponseEntity<byte[]> getImage(MultipartFile file) throws IOException {
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf("image/png"))
                .body(file.getBytes());
    }
}
