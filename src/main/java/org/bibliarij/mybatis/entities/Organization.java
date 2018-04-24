package org.bibliarij.mybatis.entities;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * "Organization" entity
 */
@Data
public class Organization extends Entity {

    private String name;
    private City city;
    private Street street;
    private String houseNumber;
    private String activityField;
    private Set<String> phoneNumbers;
    private String websiteUrl;
    private LocalDateTime creationUpdateDateTime;
}
