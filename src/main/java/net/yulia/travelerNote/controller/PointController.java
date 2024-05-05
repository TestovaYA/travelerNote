package net.yulia.travelerNote.controller;

import lombok.AllArgsConstructor;
import net.yulia.travelerNote.entity.Point;
import net.yulia.travelerNote.service.PointService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/points")
@AllArgsConstructor
public class PointController {
    PointService pointService;

    @PostMapping("/create")
    public ResponseEntity<Point> createPoint(@RequestBody Point point){
        Point savedPoint = pointService.createPoint(point);
        return new ResponseEntity<>(savedPoint, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Point> getPointById(@PathVariable("id") Long pointId) {
        Point point = pointService.getPointById(pointId);
        return ResponseEntity.ok(point);
    }

    @GetMapping
    public ResponseEntity<List<Point>> getAllPoints(){
        List<Point> allPoints = pointService.getAllPoints();
        return ResponseEntity.ok(allPoints);
    }

    @PutMapping("/update")
    public ResponseEntity<Point> updatePoint(@RequestBody Point point){
        Point updatedPoint = pointService.updatePoint(point);
        return ResponseEntity.ok(updatedPoint);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deletePointByIf(@PathVariable("id") Long pointId){
        pointService.deletePointById(pointId);
        return ResponseEntity.ok("Point deleted successfully");
    }
}
