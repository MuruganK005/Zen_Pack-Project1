package com.ZenPack.Dto;

import com.ZenPack.model.Feature;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class MenuDto {

    private Long id;
    private String menuName;
    private Date createdTime;
    private String createdBy;
    private Integer parentMenuId;
    private List<Feature> features;
}
