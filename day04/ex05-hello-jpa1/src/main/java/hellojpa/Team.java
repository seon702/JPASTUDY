package hellojpa;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Team {

    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;
    private String name;

//    @OneToMany(mappedBy = "team")
//    private List<Member> Members = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "TEAM_ID")
    private List<Member> Members = new ArrayList<>();

}
