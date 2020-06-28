package bitbank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaArthur = new Conta();
		Conta contaMarjori = new Conta();
		
		contaArthur.saldo = 200;
		System.out.println("Saldo do Arthur: " + contaArthur.saldo);
		
		contaArthur.deposita(123);	
		System.out.println("Saldo do Arthur + deposito: " + contaArthur.saldo);
		
		contaArthur.saca(7723, contaMarjori);
		System.out.println("Saldo do Arthur + sacar: " + contaArthur.saldo);
		
		
		
		contaMarjori.deposita(1000);
		boolean sucessoTransferencia = contaMarjori.saca(500, contaArthur);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso!");
		}else {
			System.out.println("Falta dinheiro para realizar transferência!");
		}
		System.out.println("Marjori depositou R$ 500 para Arthur: "  + contaArthur.saldo);
		System.out.println("Saldo na Conta da Marjori: " + contaMarjori.saldo);
		
		contaMarjori.titular = "Marjori Pacheco Dias";
		System.out.println(contaMarjori.titular);
		
	}
}
