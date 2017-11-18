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

import enem.entity.Pesos;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlePesos {

    Session session;

    public ControlePesos(Session pSession) {
        this.session = pSession;
    }

    public void cadastrarPesos(int cod, String nome, double pesoCH, double pesoCN,
            double pesoLC, double pesoM, double pesoR) throws Exception {
        Transaction tr = null;
        try {
            Pesos peso = new Pesos(cod, nome, pesoCN, pesoCH, pesoLC, pesoM, pesoR);
            session.save(peso);
            tr = session.getTransaction();
            tr.commit();
        } catch (HibernateException e) {
            tr.rollback();
            throw new Exception(e.getMessage());
        }
    }

    public void cadastrarPesos(String nome, double pesoCH, double pesoCN,
            double pesoLC, double pesoM, double pesoR) throws Exception {
        Transaction tr = null;
        try {
            Pesos peso = new Pesos(nome, pesoCN, pesoCH, pesoLC, pesoM, pesoR);
            session.save(peso);
            tr = session.getTransaction();
            tr.commit();
        } catch (HibernateException e) {
            tr.rollback();
            throw new Exception(e.getMessage());
        }
    }

    public void editarPesos(String nome, double pesoCH, double pesoCN,
            double pesoLC, double pesoM, double pesoR) {
        Pesos peso = new Pesos(nome, pesoCN, pesoCH, pesoLC, pesoM, pesoR);
        session.load(Pesos.class, peso);
        Transaction tr = session.beginTransaction();
        tr.commit();
    }

    public void removerPesos(String nome, double pesoCH, double pesoCN,
            double pesoLC, double pesoM, double pesoR) {
        Pesos peso = new Pesos(nome, pesoCN, pesoCH, pesoLC, pesoM, pesoR);
        session.load(Pesos.class, peso);
        Transaction tr = session.beginTransaction();
        tr.commit();
    }

}
