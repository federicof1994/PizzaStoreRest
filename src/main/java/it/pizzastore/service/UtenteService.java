package it.pizzastore.service;

import java.util.List;

import it.pizzastore.model.CodiceRuolo;
import it.pizzastore.model.Utente;

public interface UtenteService extends IBaseService<Utente> {

	public Utente eseguiAccesso(String username, String password);

	public Utente caricaSingoloUtenteEager(long id);

	public void aggiornaUtenteConRuoli(Utente utenteModel, List<String> listaIdRuoli);
	
	public Utente cercaDaUsername(String username);

	public List<Utente> cercaUtentiByCodiceRuoloAndCognomeLike(CodiceRuolo codiceRuolo, String cognome);

	public List<Utente> findByExampleEager(Utente example);

	public Utente aggiornaUtenteConRuoli(Utente utenteInstance);

	public boolean isUsernameDisponibile(String username);

	public Utente registraUtente(Utente utenteInstance);
	
	public Utente attivaUtenteDaId(Long id);

}
