package hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by user on 7/11/17.
 */
public class Main {
    //private static final SessionFactory ourSessionFactory;

   /* static {
   try {

            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
            System.out.println("querying all the managed entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from TablePeopleEntity");
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
        } finally {
            session.close();
        }*/
   public static void main(String[] args) {

   /* try {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        org.hibernate.Query query = session.createQuery("FROM TablePeopleEntity ");
        List <TablePeopleEntity> people =  (List<TablePeopleEntity>)query.list();

        session.close();

        for (TablePeopleEntity p : people)
            System.out.println(p.getName() + "  " + p.getCity());
        sessionFactory.close();
    } catch (Exception e){
        System.out.println(e.getMessage());
        }*/
      try {
           SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
           Session session = sessionFactory.openSession();
           session.beginTransaction();
            //char [] temp = {'p','i','t'};

           List <TablePeopleEntity> cats = session.createCriteria(TablePeopleEntity.class)
                   .add(Restrictions.eq("age", 50)).list();

           session.getTransaction().commit();
           session.close();
          sessionFactory.close();

           for (TablePeopleEntity c : cats)
               System.out.println(c.getName() + "  " + c.getCity());
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
}}
