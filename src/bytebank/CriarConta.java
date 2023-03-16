package bytebank;

public class CriarConta  {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(0001, 301220);
//		primeiraConta.deposita(2000);
		
		Cliente matheus = new Cliente();
//		matheus.setNome("Matheus");
//		primeiraConta.setTitular(matheus);
//		
//		System.out.println(primeiraConta.getTitular().getNome());
		
		
//		primeiraConta.deposita(300);
//		
//		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(0001, 301220);
//		segundaConta.deposita(50);
//		System.out.println(segundaConta.getSaldo());
		
		System.out.println(Conta.getSumConta());
	}
}
