package bitbank;

public class Criaconta {

	public static void main(String[] args) {
	
		Conta contaArthur = new Conta();
		
		contaArthur.saldo = 200;
		contaArthur.agencia = 109;
		contaArthur.numero = 231;
		contaArthur.titular = "Arthur";
		
		contaArthur.saldo += 200;
		System.out.println(contaArthur.saldo);
		System.out.println(contaArthur.agencia);
		System.out.println(contaArthur.numero);
		System.out.println(contaArthur.titular);
		
		Conta contaMarjori = new Conta();
		
		contaMarjori.saldo = 245;
		contaMarjori.agencia = 203;
		contaMarjori.numero = 222;
		contaMarjori.titular = "Marjori";
		
		System.out.println(contaMarjori.saldo);
		System.out.println(contaMarjori.agencia);
		System.out.println(contaMarjori.numero);
		System.out.println(contaMarjori.titular);
		
		if(contaArthur == contaMarjori) {
			System.out.println("São a mesma conta!");
		}else {
			System.out.println("São contas diferentes! Pois são 2 referências distintas");
			System.out.println("Ex: contaArthur & contaMarjori");

		}
		
		
		// São duas contas, logos são duas referências diferentes uma da outra.Ex: contaArthur e contaMarjori


	}

}
