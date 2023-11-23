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

    @ManyToOne // 일대다 양방향
    @JoinColumn(name = "TEAM_ID", insertable = false, updatable = false)  //읽기전용
    private Team team;

//    @ManyToOne  다대일
//    @JoinColumn(name = "TEAM_ID")
//    private Team team;

}
