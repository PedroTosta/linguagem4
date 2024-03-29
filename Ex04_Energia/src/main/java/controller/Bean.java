package controller;

import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {
    
    public Bean() {
        
    }
    
    private String cpNom; //campo nome do equipamento
    private String cpPot; //campo potência do equipamento
    private String cpTmp; //campo tempo informado de uso mensal do equipamento
    private String cpMed; //campo unidade medida de tempo de uso mensal do equipamento
    private String cpVal; //campo valor kW/h cobrado pela companhia de energia
    private String cpTot; //total em reais a ser pago pela soma de consumo de cada equipamento

    public String getCpNome() {
        return cpNom;
    }

    public void setCpNome(String cpNom) {
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
