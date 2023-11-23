package org.domain;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Movie extends Item {
    public String director;
    public String actor;
}
