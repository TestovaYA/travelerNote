package net.yulia.travelerNote.mapper;

import net.yulia.travelerNote.dto.PointDto;
import net.yulia.travelerNote.entity.Point;

public class PointMapper {
    public static PointDto mapToPointDto(Point point) {
        return new PointDto(point.getId(),
                point.getTitle(),
                point.getAddress(),
                point.getDescription(),
                point.getXcoordinate(),
                point.getYcoordinate()
        );
    }

    public static Point mapToPoint(PointDto pointDto) {
        return new Point(pointDto.getId(),
                pointDto.getTitle(),
                pointDto.getAddress(),
                pointDto.getDescription(),
                pointDto.getXcoordinate(),
                pointDto.getYcoordinate()
        );
    }
}
