package org.example.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    private final Map<String, byte[]> avatarMap = new HashMap<>();

    @GetMapping("get")
    public String getName(@RequestParam("name") String name) {
        return name;
    }

    @PostMapping("set")
    public String setName(@RequestParam("name") String name) {
        return name + " success";
    }

    @PostMapping("set/avatar")
    public String setAvatar(@RequestParam("name") String name,
                            @RequestParam("avatar") MultipartFile avatar) throws IOException {
        System.out.println(avatar.getName());
        System.out.println(avatar.getOriginalFilename());
        System.out.println(avatar.getContentType());
        System.out.println(avatar.getSize());
        System.out.println(avatar.getResource());
        avatarMap.put(name, avatar.getBytes());
        return name + " success";
    }

    @GetMapping("get/avatar")
    public ResponseEntity<byte[]> getAvatar(@RequestParam("name") String name) {
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf("image/jpg"))
                .body(avatarMap.getOrDefault(name, new byte[]{}));
    }

}
