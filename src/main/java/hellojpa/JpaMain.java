package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args){

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        try {
//            //비영속
//            Member member1 = new Member();
//            member1.setName("A");
//
//            Member member2 = new Member();
//            member2.setName("B");
//
//            Member member3 = new Member();
//            member3.setName("C");
//
//            //영속
//            System.out.println("===================");
//            em.persist(member1);
//            em.persist(member2);
//            em.persist(member3);
//
//            System.out.println("member1.getId() = " + member1.getId());
//            System.out.println("member2.getId() = " + member2.getId());
//            System.out.println("member3.getId() = " + member3.getId());
//            System.out.println("===================");
//
//            //DB에 저장
//            tx.commit();
//        } catch (Exception e){
//            tx.rollback();
//        } finally {
//            em.close();
//        }
//        emf.close();

    }
}
