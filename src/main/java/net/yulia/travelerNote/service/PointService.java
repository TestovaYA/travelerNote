package net.yulia.travelerNote.service;

import net.yulia.travelerNote.entity.Point;

import java.util.List;

public interface PointService {
    Point createPoint(Point point);

    Point getPointById(Long pointId);

    List<Point> getAllPoints();
}
