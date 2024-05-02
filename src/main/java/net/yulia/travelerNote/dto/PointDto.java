package net.yulia.travelerNote.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PointDto {
    private Long id;
    private String title;
    private String address;
    private String description;
    private String xcoordinate;
    private String ycoordinate;
}
