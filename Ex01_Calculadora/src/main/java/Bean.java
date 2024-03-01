import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {
    
    public Bean() {
        setVisor("0");
    }//builder - construtor
    
    private String visor;
    private double n1;
    private double n2;
    private double res;
    private String op;
    
    public void bt07(ActionEvent a){
        if(getVisor().equals("0")){
            setVisor("7");
        }else if(!getVisor().equals("0") && getOp() == null){
            String aux = getVisor();
            //armazenar o valor atual no visor
            aux += "7";
            setVisor(aux);
        }else if(!getVisor().equals("0") && getOp() != null){
            setVisor("7");
        }
    }//bt07
    
    public void bt08(ActionEvent a){
        if(getVisor().equals("0")){
            setVisor("8");
        }else if(!getVisor().equals("0") && getOp() == null){
            String aux = getVisor();
            //armazenar o valor atual no visor
            aux += "8";
            setVisor(aux);
        }else if(!getVisor().equals("0") && getOp() != null){
            setVisor("8");
        }
    }//bt08
    
    public void bt09(ActionEvent a){
        if(getVisor().equals("0")){
            setVisor("9");
        }else if(!getVisor().equals("0") && getOp() == null){
            String aux = getVisor();
            //armazenar o valor atual no visor
            aux += "9";
            setVisor(aux);
        }else if(!getVisor().equals("0") && getOp() != null){
            setVisor("9");
        }
    }//bt09
    
    public void bt04(ActionEvent a){
        if(getVisor().equals("0")){
            setVisor("4");
        }else if(!getVisor().equals("0") && getOp() == null){
            String aux = getVisor();
            //armazenar o valor atual no visor
            aux += "4";
            setVisor(aux);
        }else if(!getVisor().equals("0") && getOp() != null){
            setVisor("4");
        }
    }//bt04
    
    public void bt05(ActionEvent a){
        if(getVisor().equals("0")){
            setVisor("5");
        }else if(!getVisor().equals("0") && getOp() == null){
            String aux = getVisor();
            //armazenar o valor atual no visor
            aux += "5";
            setVisor(aux);
        }else if(!getVisor().equals("0") && getOp() != null){
            setVisor("5");
        }
    }//bt05
    
    public void bt06(ActionEvent a){
        if(getVisor().equals("0")){
            setVisor("6");
        }else if(!getVisor().equals("0") && getOp() == null){
            String aux = getVisor();
            //armazenar o valor atual no visor
            aux += "6";
            setVisor(aux);
        }else if(!getVisor().equals("0") && getOp() != null){
            setVisor("6");
        }
    }//bt06
    
    public void bt01(ActionEvent a){
        if(getVisor().equals("0")){
            setVisor("1");
        }else if(!getVisor().equals("0") && getOp() == null){
            String aux = getVisor();
            //armazenar o valor atual no visor
            aux += "1";
            setVisor(aux);
        }else if(!getVisor().equals("0") && getOp() != null){
            setVisor("2");
        }
    }//bt01
    
    public void bt02(ActionEvent a){
        if(getVisor().equals("0")){
            setVisor("2");
        }else if(!getVisor().equals("0") && getOp() == null){
            String aux = getVisor();
            //armazenar o valor atual no visor
            aux += "2";
            setVisor(aux);
        }else if(!getVisor().equals("0") && getOp() != null){
            setVisor("2");
        }
    }//bt02
    
    public void bt03(ActionEvent a){
        if(getVisor().equals("0")){
            setVisor("3");
        }else if(!getVisor().equals("0") && getOp() == null){
            String aux = getVisor();
            //armazenar o valor atual no visor
            aux += "3";
            setVisor(aux);
        }else if(!getVisor().equals("0") && getOp() != null){
            setVisor("3");
        }
    }//bt03
    
    public void bt00(ActionEvent a){
        if(!getVisor().equals("0") || getOp() == null){
            String aux = getVisor();
            //armazenar o valor atual no visor
            aux += "0";
            setVisor(aux);
        }
    }//bt00
    
    public void btLimpa(ActionEvent a){
        setVisor("0");
        setN1(0);
        setN2(0);
        setRes(0);
        setOp("");
    }
    
    public void btSoma(ActionEvent a){
        setOp("+");
        setN1(Double.parseDouble(getVisor()));
    }//btSoma
    
    public void btMenos(ActionEvent a){
        setOp("-");
        setN1(Double.parseDouble(getVisor()));
        setVisor("0");
    }//btMenos
    
    public void btMult(ActionEvent a){
        setOp("X");
        setN1(Double.parseDouble(getVisor()));
        setVisor("0");
    }//btMult
    
    public void btDiv(ActionEvent a){
        setOp("/");
        setN1(Double.parseDouble(getVisor()));
        setVisor("0");
    }//btDiv
    
    public void btRes(ActionEvent a){
        setN2(Double.parseDouble(getVisor()));
        Double aux = 0.0;
        switch(getOp()){
            case "+":
                aux = n1 + n2;
                setVisor(aux.toString());
                break;
            case "-":
                aux = n1 - n2;
                setVisor(aux.toString());
                break;
            case "X":
                aux = n1 * n2;
                setVisor(aux.toString());
                break;
            case "/":
                aux = n1 / n2;
                setVisor(aux.toString());
                break;
        }
    }

    ///////////////////////////////// GET SET
    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
    
    
    
}//class
