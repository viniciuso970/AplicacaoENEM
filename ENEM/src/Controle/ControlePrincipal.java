/**
 *  Projeto Final BDII
 *  Autores:
 *      Gabriel Oraboni Carvalho
 *      Matheus Santos Corrêa
 *      Pedro Spina Guemureman
 *      Renam Makoto Aono
 *      Vinícius de Oliveira Souza
 */
package Controle;

import Visao.TelaPrincipal;
import enem.entity.Candidato;
import enem.util.HibernateUtil;
import java.util.List;
import javafx.stage.Stage;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public final class ControlePrincipal {

    TelaPrincipal telaPrincipal;
    ControlePesos ctrPesos;
    ControleRelatorios ctrRelatorios;
    Session session;

    public ControlePrincipal(Stage primaryStage) {
        conectarBD();
        ctrPesos = new ControlePesos(session);
        ctrRelatorios = new ControleRelatorios(session);
        telaPrincipal = new TelaPrincipal(this, primaryStage, ctrPesos, ctrRelatorios);
    }

    public void conectarBD() {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
//
//            Query q = session.createQuery("from enem.entity.Candidato c where c.nuInscricao = 130005702872");
//            List resultList = q.list();
//            Candidato c = (Candidato) resultList.get(0);
//            System.out.println(c.getNuInscricao());
//            session.getTransaction().commit();
        } catch (HibernateException t) {
            System.err.println(t.getMessage());
        }
    }

    public void fecharConexao() {
        try {
            HibernateUtil.shutdown();
            StandardServiceRegistryBuilder.destroy(session.getSessionFactory().getSessionFactoryOptions().getServiceRegistry());
        } catch (HibernateException t) {
            System.err.println(t.getMessage());
        }
    }

}
