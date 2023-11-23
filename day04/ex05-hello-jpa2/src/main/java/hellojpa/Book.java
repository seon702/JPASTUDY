package hellojpa;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("B")
public class Book extends Item{
    private String auther;
    private String isbn;
}
