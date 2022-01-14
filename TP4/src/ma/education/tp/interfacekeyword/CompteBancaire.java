package ma.education.tp.interfacekeyword;

public class CompteBancaire implements Compte{
	private String numero;
	private int balance;
	public CompteBancaire(String numero) {
	this.numero = numero;
	} 
	
	public void deposer(int montant) {
	this.balance += montant;
	} 
	
	public int retirer(int montant) {
	if (balance < montant) {
	return 0;
	} return this.balance -= montant;
	} 
	
	public int getBalance() {
	return this.balance;
	}
	public String getNumero() {
		return numero;
		}
}

