package hellojpa;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class Address {

    private String city;
    private String street;
    private String zipcode;

    
}
