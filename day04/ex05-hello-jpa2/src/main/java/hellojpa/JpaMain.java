package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try{
            Team team = new Team();
            team.setName("teamA");
            em.persist(team);

            Member member1 = new Member();
            member1.setUsername("member1");
            member1.setTeam(team);
            em.persist(member1);

            em.flush();
            em.clear();

//            Member m = em.find(Member.class, member1.getId());

            List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();

//            System.out.println("m = " + m.getTeam().getClass());

//            System.out.println("==============");
//            System.out.println("teamName : " + m.getTeam().getName());
//            System.out.println("==============");

            tx.commit();

        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();

        }

        emf.close();
    }

    private static void logic(Member m1, Member m2) {
        System.out.println("m1 == m2 : " + (m1.getClass() == m2.getClass()));
    }

    private static void printMember(Member member) {
        System.out.println("회원 이름: " + member.getUsername());
    }

    private static void printMemberAndTeam(Member member) {
        String username = member.getUsername();
        System.out.println("회원 이름: " + member.getUsername());

        Team team = member.getTeam();
        System.out.println("소속 팀: " + team.getName());
    }
}
