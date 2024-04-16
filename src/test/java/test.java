import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.security.enterprise.credential.Credential;
import javax.swing.text.html.parser.Entity;
import  Data.EstudianteEntity;
import Data.CredencialEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class test {
    static Logger log = LogManager.getRootLogger();
    public static void main(String[] args) {
        //crearEstudiante();
        crearCredenciales();
    }

    public static void crearEstudiante() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Estudiante");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        EstudianteEntity estudiante = new EstudianteEntity(1,"Angie", "Feliz", "como una lombris");
        em.persist(estudiante);
        tx.commit();
        log.debug("Objeto" + estudiante);
        em.close();
    }

    public static void crearCredenciales() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Estudiante");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        CredencialEntity credencial = new CredencialEntity (1,"aarely", "feliz", true, 1);
        em.persist(credencial );
        tx.commit();
        log.debug("Objeto" + credencial );
        em.close();
    }

}
