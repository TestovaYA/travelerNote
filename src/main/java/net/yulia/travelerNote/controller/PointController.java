package net.yulia.travelerNote.controller;

import lombok.AllArgsConstructor;
import net.yulia.travelerNote.dto.PointDto;
import net.yulia.travelerNote.service.PointService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/point/create")
@AllArgsConstructor
public class PointController {
    PointService pointService;

    @PostMapping
    public ResponseEntity<PointDto> createPoint(@RequestBody PointDto pointDto){
        PointDto savedPoint = pointService.createPoint(pointDto);
        return new ResponseEntity<>(savedPoint, HttpStatus.CREATED);
    }
}
