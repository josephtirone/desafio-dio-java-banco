public class Main {
    public static void main (String [] args){

        Cliente joseph = new Cliente();
        joseph.setNome("Joseph");

        Conta cc = new ContaCorrente(joseph);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(joseph);

        cc.transferir(100, poupanca);


        cc.imprimirInformacoes();
        poupanca.imprimirInformacoes();
    }
}
