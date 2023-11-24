package hellojpa;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class Address {

    private String city;
    private String street;
    @Embedded
    private Zipcode zipcode;

}
