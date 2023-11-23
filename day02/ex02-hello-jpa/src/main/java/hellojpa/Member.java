package hellojpa;

import lombok.*;

import javax.persistence.*;

@Entity(name = "member") //필수로 들어가는 어노테이션, 객체로 인식하게 하기 위함
//@Table(name = "USER") //USEr라는 테이블로 나가게 지정
@Data
public class Member {

    @Id
    @Column(name = "MEMBER_ID")@GeneratedValue
    private Long id;

    @Column(name = "USERNAME" , nullable = true)
    private String name;

//    @Column(name = "TEAM_ID")
//    private Long teamId;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

}
