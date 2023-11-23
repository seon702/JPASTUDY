package hellojpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Child {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;
}
