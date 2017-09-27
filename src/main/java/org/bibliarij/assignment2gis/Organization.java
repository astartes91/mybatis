package org.bibliarij.assignment2gis;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Organization {

    private Long id;
    private String name;
    private City city;
    private Street street;
    private String houseNumber;
    private String activityField;
    private List<String> phoneNumbers;
    private String webSiteUrl;
    private LocalDateTime creationUpdateDateTime;
}
