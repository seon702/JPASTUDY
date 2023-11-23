package hellojpa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    // 기간 Period
    @Embedded
    private Address workPeriod;

    // 주소
    @Embedded
    private Address homeAddress;

    // 주소
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="city", column = @Column(name = "WORK_CITY")),
            @AttributeOverride(name="city", column = @Column(name = "WORK_STREET")),
            @AttributeOverride(name="city", column = @Column(name = "WORK_ZIPCODE"))
    })
    private Address workAddress;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}