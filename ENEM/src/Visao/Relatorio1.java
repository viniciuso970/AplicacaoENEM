/**
 *  Projeto Final BDII
 *  Autores:
 *      Gabriel Oraboni Carvalho
 *      Matheus Santos Corrêa
 *      Pedro Spina Guemureman
 *      Renam Makoto Aono
 *      Vinícius de Oliveira Souza
 */

package Visao;

import Controle.ControleRelatorios;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Relatorio1 implements EventHandler<ActionEvent>{

    private ControleRelatorios ctrRelatorios;
    private Label lAno, lDependenciaAdm, lUF, lLocalizacao, lEscola, lEtnia,
            lRendaMensal, lCompetencia;
    private ChoiceBox choiceAno, choiceUF, choiceLocalizacao, 
            choiceDependenciaAdm, choiceCompetencia, choiceEtnia, 
            choiceRendaMensal, choiceEscola;
    private Button btnSubmit;
    private GridPane grid;
    private Stage stage;
    
    
    Relatorio1(ControleRelatorios ctrRelatorios) {
        
        this.ctrRelatorios = ctrRelatorios;
        
        stage =  new Stage();
        btnSubmit = new Button("Relatorio1");
        btnSubmit.setOnAction(this);
        btnSubmit.setId("font-button");

        lAno = new Label("Ano:");
        lAno.setId("label");
        lDependenciaAdm = new Label("Dependência Administrativa:");
        lDependenciaAdm.setId("label");
        lUF = new Label("Unidade da Federação:");
        lUF.setId("label");
        lLocalizacao = new Label("Localização da Escola:");
        lLocalizacao.setId("label");
        lRendaMensal = new Label("Renda Mensal:");
        lRendaMensal.setId("label");
        lEtnia = new Label("Etnia:");
        lEtnia.setId("label");
        lCompetencia = new Label("Competência:");
        lCompetencia.setId("label");
        lEscola = new Label("Escola:");
        lEscola.setId("label");
        
        
        
        ArrayList<String> ano = ctrRelatorios.getAno();
        ArrayList<String> dependenciaAdm = ctrRelatorios.getDependenciaAdm();
        ArrayList<String> uf = ctrRelatorios.getUF();
        ArrayList<String> localizacao = ctrRelatorios.getLocalizacao();
        ArrayList<String> escola = ctrRelatorios.getEscola();
        ArrayList<String> etnia = ctrRelatorios.getEtnia();
        ArrayList<String> rendaMensal = ctrRelatorios.getRendaMensal();
        ArrayList<String> competencia = ctrRelatorios.getCompetencia();
        
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(50);
        grid.setVgap(50);

        grid.add(lEscola, 0, 0);

        Scene scene = new Scene(grid, grid.getMaxHeight(), grid.getMaxWidth());
        scene.getStylesheets().add(TelaPrincipal.class.getResource("Principal.css").toExternalForm());

        stage.setTitle("Relatórios");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
