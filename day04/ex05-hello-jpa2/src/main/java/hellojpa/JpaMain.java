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
            Child child1 = new Child();
            Child child2 = new Child();

            Parent parent = new Parent();
            parent.addChild(child1);
            parent.addChild(child2);

            em.persist(parent);

            em.flush();
            em.clear();

            Parent findParent = em.find(Parent.class, parent.getId());
            findParent.getChildList().remove(0);

//            em.remove(findParent);

//            findParent.getChildList().remove(0);

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
