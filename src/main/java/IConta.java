public interface IConta {
	
	void sacar(double valor);
 
	void transferir(double valor,  Conta contadestino);

	void depositar(double valor);
	
	void imprimirExtrato();
	
}
