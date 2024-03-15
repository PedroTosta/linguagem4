import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.text.DecimalFormat;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {

    //EX A    
    private Integer num1;
    private Integer num2;
    private Integer num3;   
    private String maiorNum;
    private Integer mediaNum;
    private String somaNum;
    
    //EX B
    private Double peso;
    private Double altura;
    private String imc;
    
    //EX C
    private Integer anos;
    private Double investimento;
    private Double taxa;
    private String montante;
    
    //EX D
    private Double salario;
    private String novoSalario;
    
    public Bean() {
        setMaiorNum("0");
        setMediaNum(0);
        setSomaNum(" ");
        
        setPeso(0.0);
        setAltura(0.0);
        setImc("");
        
        setMontante("");
        setAnos(0);
        setInvestimento(0.0);
        setTaxa(0.0);
    }
    
    public void Limpar(){
        setMaiorNum("0");
        setMediaNum(0);
        setSomaNum(" ");
        setNum1(0);
        setNum2(0);
        setNum3(0);
        
        setPeso(0.0);
        setAltura(0.0);
        setImc("");
        
        setAnos(0);
        setInvestimento(0.0);
        setTaxa(0.0);
        setMontante("");
        
        setSalario(0.0);
        setNovoSalario("");
    }
    
    public String btExA(ActionEvent a){
        Limpar();
        return "exa";
    }
    
    public String btExB(ActionEvent a){
        Limpar();
        return "exb";
    }
    
    public String btExC(ActionEvent a){
        Limpar();
        return "exc";
    }
    
    public String btExD(ActionEvent a){
        Limpar();
        return "exd";
    }  
    
    public void btVerificar(ActionEvent a){
        btMaior();
        btMedia();
        btSomaNum();
    }
    
    public void btMaior(){
        if(num1 > num2 && num1 > num3){
            setMaiorNum(""+num1);
        }else if(num2 > num1 && num2 > num3){
            setMaiorNum(""+num2);
        } else if(num3 > num1 && num3 > num2){
            setMaiorNum(""+num3);
        }else{
            setMaiorNum("Número iguais");
        }
    }
    
    public void btMedia(){
        setMediaNum(((num1+num2+num3)/3));
    }
    
    public void btSomaNum(){
        if((num1+num2+num3)%2 == 0){
            setSomaNum("PAR");
        }else{
            setSomaNum("ÍMPAR");
        }
    }
    
    public void btImc(ActionEvent a){
        DecimalFormat df = new DecimalFormat("#.##");
        Double aux = (peso/(altura*altura));
        if(aux < 18.5){
            setImc(df.format(aux)+ " - IMC abaixo de 18,5: Abaixo do peso");
        }else if(aux >= 18.5 && aux <= 24.9){
            setImc(df.format(aux)+ " - IMC entre 18,5 e 24,9: Peso normal");
        }else if(aux >= 25 && aux <= 29.9){
            setImc(df.format(aux)+ " - IMC entre 25 e 29,9: Sobrepeso");
        }else if(aux >= 30 && aux <= 34.9){
            setImc(df.format(aux)+ " - IMC entre 30 e 34,9: Obesidade grau 1");
        }else if(aux >= 35 && aux <= 39.9){
            setImc(df.format(aux)+ " - IMC entre 35 e 39,9: Obesidade grau 2");
        }else if(aux >= 40){
            setImc(df.format(aux)+ " - IMC acima de 40: Obesidade grau 3");
        }
    }
    
    public void btInvestimento(ActionEvent a){
        DecimalFormat df = new DecimalFormat("#.##");
        Double aux = 1+(taxa/100);
        aux = Math.pow(aux, anos);
        aux = investimento * aux;
        setMontante(df.format(aux));
    }
    
    public void btAumento(ActionEvent a){
        DecimalFormat df = new DecimalFormat("#.##");
        if(salario <= 1000){
            setNovoSalario(df.format((salario*1.20)));
        }else if(salario > 1000 && salario <= 3000){
            setNovoSalario(df.format((salario*1.15)));
        }else if(salario > 3000){
            setNovoSalario(df.format((salario*1.10)));
        }
    }
    
    ///////////////////// GETTER - SETTER

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(String novoSalario) {
        this.novoSalario = novoSalario;
    }

    
    
    
    public Integer getAnos() {
        return anos;
    }

    public void setAnos(Integer anos) {
        this.anos = anos;
    }

    public Double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Double investimento) {
        this.investimento = investimento;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public String getMontante() {
        return montante;
    }

    public void setMontante(String montante) {
        this.montante = montante;
    }

    
    
    
    
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    
    
    
    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Integer getNum3() {
        return num3;
    }

    public void setNum3(Integer num3) {
        this.num3 = num3;
    }            

    public String getMaiorNum() {
        return maiorNum;
    }

    public void setMaiorNum(String maiorNum) {
        this.maiorNum = maiorNum;
    }

    public Integer getMediaNum() {
        return mediaNum;
    }

    public void setMediaNum(Integer mediaNum) {
        this.mediaNum = mediaNum;
    }

    public String getSomaNum() {
        return somaNum;
    }

    public void setSomaNum(String somaNum) {
        this.somaNum = somaNum;
    }
    
    
    
}
