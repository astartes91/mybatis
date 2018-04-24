package org.bibliarij.mybatis.entities;

import lombok.Data;

/**
 * "City" entity
 */
@Data
public class City extends Entity {

    private String name;
    private Double area;
    private Integer population;
}
