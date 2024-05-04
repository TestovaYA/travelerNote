package net.yulia.travelerNote.service;

import net.yulia.travelerNote.entity.Point;

public interface PointService {
    Point createPoint(Point point);

    Point getPointById(Long pointId);
}
