package bitbank;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta contaHum = new Conta();
		
		contaHum.saldo = 200;
		System.out.println("Saldo da conta 1 = " + contaHum.saldo);
		
		
		Conta contaDois = contaHum;
		System.out.println(contaDois);
		System.out.println("Saldo da conta 2 = " + contaDois.saldo);
		
		contaDois.saldo += 100;
		System.out.println("Saldo da conta 2 + 100 = " + contaDois.saldo);
		
		System.out.println("Saldo da conta 1 = " + contaHum.saldo);
		
		contaHum.agencia = 156;
		System.out.println(contaHum.agencia);
		contaDois.agencia = 123;
		System.out.println(contaDois.agencia);
		
		if(contaHum == contaDois) {
			System.out.println("S�o a mesma conta");
		}else {
			System.out.println("N�o s�o iguais");
		}
		
		// As contas s�o iguais, pois pertencem a mesma referencia de Conta. Ex: new Conta();

	}

}
