package org.bibliarij.mybatis.entities;

import lombok.Data;

/**
 * "Street" entity
 */
@Data
public class Street extends Entity {

    private String name;
    private Double length;
}
