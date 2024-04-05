package controller;

import javax.faces.bean.*;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import model.Equipamento;
import java.util.*;
import javax.faces.model.*;

@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {
    
    public Bean() {
        setCpVal("0.87");
        setCpTot("0.0");
    }
    
    private String cpNom; //campo nome do equipamento
    private String cpPot; //campo potência do equipamento
    private String cpTmp; //campo tempo informado de uso mensal do equipamento
    private String cpMed; //campo unidade medida de tempo de uso mensal do equipamento
    private String cpVal; //campo valor kW/h cobrado pela companhia de energia
    private String cpTot; //total em reais a ser pago pela soma de consumo de cada equipamento
    
    private ArrayList<Equipamento> lista = new ArrayList<>(); //vetor java do tipo equipamento (dados lógicos)
    private DataModel dadosTabela; //responsável por prover os dados para o componente datatable
    Equipamento equip = new Equipamento();
    int pos = 0-1;
    int poslinha = -1;
    double total = 0;
    
    public void somaTabela(){
        total = 0;
        for (Equipamento e : lista) {
            total += e.getReais();
        }
        setCpTot(String.valueOf(total));
    }
    
    public void btAlterar(ActionEvent ae){
        poslinha = dadosTabela.getRowIndex();
        equip = (Equipamento)dadosTabela.getRowData();
        setCpNom(equip.getNomeEq());
        setCpPot(String.valueOf(equip.getPot()));
        setCpTmp(String.valueOf(equip.getTempo()));
        setCpMed(equip.getMed());
        somaTabela();
    }
    
    public void btRemover(ActionEvent ae){
        equip = (Equipamento)dadosTabela.getRowData();
        lista.remove(equip);
        dadosTabela = new ListDataModel(lista);
        somaTabela();
    }
    
    public void btSalvar(ActionEvent ae){
        equip = new Equipamento();
        equip.setNomeEq(getCpNom());
        Double pot = Double.valueOf(getCpPot());
        Double kwh = Double.valueOf(getCpVal());
        Double tempo = Double.valueOf(getCpTmp());
        Double valorKwh = Double.valueOf(getCpVal());
        if(getCpMed().equals("Minutos")){
            tempo /= 60;
        }
        kwh = (pot * tempo * 30)/1000;
        Double reais = kwh * valorKwh;
        if(poslinha == -1){
            lista.add(equip);
        }else{
            lista.set(poslinha, equip);
        }
        equip.setTempo(tempo);
        equip.setKwh(kwh);
        equip.setReais(reais);
        equip.setPot(Double.parseDouble(getCpPot()));
        equip.setMed(getCpMed());
        equip.setPos(pos);
        lista.add(equip);
        pos++;
        dadosTabela = new ListDataModel(lista);        
        setCpNom("");
        setCpPot("");
        setCpTmp("");
        setCpMed("");
        somaTabela();
    }//btsalvar

    ////////////// GET E SET

    public ArrayList<Equipamento> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Equipamento> lista) {
        this.lista = lista;
    }

    public DataModel getDadosTabela() {
        return dadosTabela;
    }

    public void setDadosTabela(DataModel dadosTabela) {
        this.dadosTabela = dadosTabela;
    }
            
    public String getCpNom() {
        return cpNom;
    }

    public void setCpNom(String cpNom) {
        this.cpNom = cpNom;
    }

    public String getCpPot() {
        return cpPot;
    }

    public void setCpPot(String cpPot) {
        this.cpPot = cpPot;
    }

    public String getCpTmp() {
        return cpTmp;
    }

    public void setCpTmp(String cpTmp) {
        this.cpTmp = cpTmp;
    }

    public String getCpMed() {
        return cpMed;
    }

    public void setCpMed(String cpMed) {
        this.cpMed = cpMed;
    }

    public String getCpVal() {
        return cpVal;
    }

    public void setCpVal(String cpVal) {
        this.cpVal = cpVal;
    }

    public String getCpTot() {
        return cpTot;
    }

    public void setCpTot(String cpTot) {
        this.cpTot = cpTot;
    }
    
    
    
    
}
