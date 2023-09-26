package info;

public class Conta {
	private Titular titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataAbertura;
	private static int totalDeContas = 0;
	
	public Conta(Titular titular, int numero, String agencia, double saldo, Data dataAbertura){
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		this.agencia = agencia;
		this.dataAbertura = dataAbertura;
		totalDeContas++;
		
	}
	
	public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public void mostrarTotalDeContas() {
        System.out.println("Total de contas criadas: " + getTotalDeContas());
    }
    
    public void ImprimeDatadeabertura() {
    	System.out.println("Data de Abertura: " + dataAbertura.dia + "/" + dataAbertura.mes + "/" + dataAbertura.ano);
    }
	
    public void ImprimeTitular() {
    	System.out.println("Nome: " + titular.nome);
    	System.out.println("CPF: " + titular.cpf);
    }
    
	public void Sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			System.out.println("R$" + valor + " sacado.");
		}else{
			System.out.println("Não é possível sacar um valor maior do que existe em sua conta.");
		}
	}
	
	public void Depositar(double valor){
		saldo = saldo + valor;
		System.out.println("R$" + valor + " depositado em sua conta.");
	}
	
	public void calcularRendimento() {
		System.out.println("Cálculo do rendimento: " + (saldo * 0.1));
	}

	
	public void ImprimeDados() {
		System.out.println("---------------------------------------------");
		ImprimeTitular();
		System.out.println("Número: " + numero);
		System.out.println("Agência: " + agencia);
		System.out.println("Saldo: "+ saldo);
		ImprimeDatadeabertura();
		System.out.println("---------------------------------------------");
	}
	
	public void Doacao() {
		if (saldo >= 1.00) {
			saldo -= 1.0;
	        System.out.println("Doação realizada com sucesso. Novo saldo: R$" + saldo);
		}else {
			System.out.println("Saldo insuficiente para fazer a doação.");
		}
	}
	
	public static void main(String[] args) {
		Titular titular = new Titular("João Henrique", "440.347.550-75");
		Data dataAbertura1 = new Data(12, 12, 2002);
		Conta conta1 = new Conta(titular, 99545633, "56789", 1000.00, dataAbertura1);
		
		conta1.ImprimeDados();
		
		conta1.mostrarTotalDeContas();
		
		conta1.Sacar(999);
		conta1.Doacao();
		conta1.Doacao();
	}
}