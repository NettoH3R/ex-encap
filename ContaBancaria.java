public class ContaBancaria{
    
    private int numeroDaConta;
    private String titular;
    private double saldo;
    
    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }
    public int getNumeroDaConta(){
        return this.numeroDaConta;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return this.titular;
    }

    public void setSaldo(double saldo){
        if(saldo > 0){
            this.saldo = saldo;
        }
    }


    public double getSaldo(){
        return this.saldo;
    }

    public double sacaValor(double valor){
        if(this.saldo > valor){
            return this.saldo =  this.saldo - valor;
        }else{
            System.out.println("Valor do saque é maior que o saldo!!")
            return this.saldo;
        }
    }

    public double depositaValor(double valor){
        if( 0 < valor){
            return this.saldo =  this.saldo + valor;
        }else{
            System.out.println("Não é possivel depositar o valor negativo!!")
            return this.saldo;
        }
    }
}