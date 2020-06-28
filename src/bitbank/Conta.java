package bitbank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;	
	}
	
	public boolean saca(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			System.out.println("N�o � poss�vel sacar ou realizar transfer�ncia!");
			return false;			
		}
	}
	
}
