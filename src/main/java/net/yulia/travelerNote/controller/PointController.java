package net.yulia.travelerNote.controller;

import lombok.AllArgsConstructor;
import net.yulia.travelerNote.dto.PointDto;
import net.yulia.travelerNote.service.PointService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/point")
@AllArgsConstructor
public class PointController {
    PointService pointService;

    @PostMapping("/create")
    public ResponseEntity<PointDto> createPoint(@RequestBody PointDto pointDto){
        PointDto savedPoint = pointService.createPoint(pointDto);
        return new ResponseEntity<>(savedPoint, HttpStatus.CREATED);
    }
}
