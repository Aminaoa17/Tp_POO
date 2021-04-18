package upac.tp.java.backend.repository.impl;

import org.hibernate.Session;
import upac.tp.java.backend.entity.StudentEntity;
import upac.tp.java.backend.repository.StudentRepositoryInterface;
import upac.tp.java.backend.utils.HibernateUtils;

public class StudentRepositoryImpl implements StudentRepositoryInterface {
    private Session session;

    @Override
    public void addStudent(StudentEntity student) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();

        session.save(student);

        session.getTransaction().commit();
        HibernateUtils.shutdown();
    }

    @Override
    public StudentEntity getStudentById(Integer studentID) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();


        StudentEntity studentE = session.get(StudentEntity.class, studentID);

        session.getTransaction().commit();
        HibernateUtils.shutdown();


        return studentE;
    }
}
