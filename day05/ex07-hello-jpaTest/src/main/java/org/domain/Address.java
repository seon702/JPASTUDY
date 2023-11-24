package org.domain;

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
