package org.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Album extends Item {
    private String artist;
    private String etc;
}
