package net.yulia.travelerNote.service.impl;

import lombok.AllArgsConstructor;
import net.yulia.travelerNote.dto.PointDto;
import net.yulia.travelerNote.entity.Point;
import net.yulia.travelerNote.exception.ResourceNotFoundException;
import net.yulia.travelerNote.mapper.PointMapper;
import net.yulia.travelerNote.repository.PointRepository;
import net.yulia.travelerNote.service.PointService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PointServiceImpl implements PointService {
    private PointRepository pointRepository;

    @Override
    public PointDto createPoint(PointDto pointDto) {
        Point point = PointMapper.mapToPoint(pointDto);
        Point savedPoint = pointRepository.save(point);

        return PointMapper.mapToPointDto(savedPoint);
    }

    @Override
    public PointDto getPointById(Long pointId) {
        Point point = pointRepository.findById(pointId).orElseThrow(()->new ResourceNotFoundException("Point with the given id does not exist. id: " + pointId));
        return PointMapper.mapToPointDto(point);
    }
}
