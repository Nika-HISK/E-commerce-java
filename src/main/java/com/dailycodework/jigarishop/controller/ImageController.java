package com.dailycodework.jigarishop.controller;

import com.dailycodework.jigarishop.dto.ImageDto;
import com.dailycodework.jigarishop.response.ApiResponse;
import com.dailycodework.jigarishop.service.image.IImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/images")
public class ImageController {
    private final IImageService imageService;

    public ResponseEntity<ApiResponse> saveImages(@RequestParam List<MultipartFile> files, @RequestParam Long productId  ) {
        List<ImageDto> imageDtos = imageService.saveImages(files, productId);
        return ResponseEntity.ok(new ApiResponse("Upload successful", imageDtos));
    }
}