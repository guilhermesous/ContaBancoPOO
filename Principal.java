package info;

public class Principal {

	public static void main(String[] args) {
		Titular titular1 = new Titular("Antônio Neto", "440.347.550-75");
		Data dataabertura1 = new Data(12, 05, 2016);
		Conta conta1 = new Conta(titular1, 994652378, "56478", 789.45, dataabertura1);
		
		Titular titular2 = new Titular("Sabrina Matos", "222.080.810-64");
		Data dataabertura2 = new Data(30, 9, 2020);
		Conta conta2 = new Conta(titular2, 994567891, "567842", 5458.60, dataabertura2);
		
		conta1.ImprimeDados();
		conta2.ImprimeDados();
		
		
		if (conta1.getSaldo() > conta2.getSaldo()) {
			System.out.println(titular1.nome + " possui o saldo maior.");
		}else{
			System.out.println(titular2.nome + " possui o saldo maior.");
		}
		
		for (int i = 0; i < 5; i++) {
            conta1.Depositar(100.00);
        }
        System.out.println("Novo saldo da conta1: R$" + conta1.getSaldo());
    	}
	}
