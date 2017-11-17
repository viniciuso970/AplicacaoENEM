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
import javafx.stage.Stage;


public class ControlePrincipal {

    TelaPrincipal telaPrincipal;
    ControlePesos ctrPesos;
    ControleRelatorios ctrRelatorios;
    
    public ControlePrincipal(Stage primaryStage) {
        ctrPesos = new ControlePesos();
        ctrRelatorios = new ControleRelatorios();
        telaPrincipal = new TelaPrincipal(primaryStage, ctrPesos, ctrRelatorios);
    }
    
    
}
