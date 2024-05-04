package net.yulia.travelerNote.service.impl;

import lombok.AllArgsConstructor;
import net.yulia.travelerNote.dto.PointDto;
import net.yulia.travelerNote.entity.Point;
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
}
