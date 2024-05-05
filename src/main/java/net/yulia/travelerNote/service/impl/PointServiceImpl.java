package net.yulia.travelerNote.service.impl;

import lombok.AllArgsConstructor;
import net.yulia.travelerNote.entity.Point;
import net.yulia.travelerNote.exception.ResourceNotFoundException;
import net.yulia.travelerNote.repository.PointRepository;
import net.yulia.travelerNote.service.PointService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PointServiceImpl implements PointService {
    private PointRepository pointRepository;

    @Override
    public Point createPoint(Point point) {
        return pointRepository.save(point);
    }

    @Override
    public Point getPointById(Long pointId) {
        return pointRepository.findById(pointId).orElseThrow(()->new ResourceNotFoundException("Point with the given id does not exist. id: " + pointId));
    }

    @Override
    public List<Point> getAllPoints() {
        return pointRepository.findAll();
    }

    @Override
    public Point updatePoint(Point point) {
        return pointRepository.save(point);
    }

    @Override
    public void deletePointById(Long pointId) {
        pointRepository.findById(pointId).orElseThrow(()->new ResourceNotFoundException("Point with the given id does not exist. id: " + pointId));
        pointRepository.deleteById(pointId);
    }
}
