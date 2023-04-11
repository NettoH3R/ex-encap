


public class Caixa {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroDaConta(1);
        conta.setSaldo(0);
        
        conta.depositaValor(1110);

        conta.sacaValor(100);

        System.out.println("seu saldo é: " + conta.getSaldo() + "\n");


        conta.depositaValor(-3);

        conta.sacaValor(9000);

        System.out.println("seu saldo é: " + conta.getSaldo()+ "\n");
    }
}
