package com.example.farmproducts.service;

import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

public interface FileService {
    String uploadImage(MultipartFile file) throws IOException;
} 