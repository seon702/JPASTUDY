package hellojpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "member") //필수로 들어가는 어노테이션, 객체로 인식하게 하기 위함
//@Table(name = "USER") //USEr라는 테이블로 나가게 지정
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Id
    private Long id;

    @Column(unique = true, length = 10)
    private String name;
    private int age;
//    @Id //id에 Pk값을 주기 위해 적용하는 어노테이션
//    private Long id;
////    @Column(name = "username") //username이라는 DB컬럼과 맵핑시키기
//    private String name;
//
//    public Member() {
//    }
//
//    public Member(Long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
