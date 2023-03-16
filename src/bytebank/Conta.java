package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int conta;
	private Cliente titular;
	private static int total;
	

	public Conta() {

	}

	public Conta(int agencia, int conta) {
		Conta.total++;
		this.agencia = agencia;
		this.conta = conta;
		System.out.println("Conta:  " + conta + " Agencia: " + agencia);
	}

	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println(saldo);
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque de " + valor + " realizado!");
			return true;
		} else {
			System.out.println("voce nao tem saldo suficiente");
			return false;
		}

	}

	public boolean transfere(double valor, Conta destinatario) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destinatario.deposita(valor);
			System.out.println("Transferencia de " + valor + " realizada!");
			return true;
		} else {
			System.out.println("voce nao tem saldo suficiente para realizar a transferencia");
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getConta() {
		return this.conta;
	}

	public void setConta(int conta) {
		if (conta <= 0) {
			System.out.println("Valor da conta não pode ser menor que zero");
			return;
		}
		this.conta = conta;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Valor da agencia não pode ser menor que zero");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getSumConta() {
		return Conta.total;
	}

}
