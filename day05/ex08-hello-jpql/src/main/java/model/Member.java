package model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member {
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String userName;

    private int age;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private List<Order> orderList = new ArrayList<>();

    public void changeTeam(Team team) {
        this.team = team;
        team.getMembers();
    }

}
