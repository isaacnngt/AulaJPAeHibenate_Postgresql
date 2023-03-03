package cliente;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;

public class Teste {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("postgres");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public static void main(String[] args) {
	
		
		Scanner scn = new Scanner(System.in);
		
		// PROCURAR
		Cliente cliente = entityManager.find(Cliente.class, 1);
		System.out.println("Nome do cliente:" + cliente.getNome());
		
		// INSERT
		
		/*Cliente cliente = new Cliente();
		System.out.println("Nome do cliente:");
		cliente.setNome(scn.next());
		
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();*/
		
		// DELETE
		/*System.out.println("Id cliente a ser excluído: ");
		Cliente cliente = entityManager.find(Cliente.class, scn.nextInt());
		entityManager.getTransaction().begin();
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();*/
		
		// UPDATE
		/*Cliente cliente = new Cliente();
		System.out.println("Id cliente a ser atualizado: ");
		cliente.setId(scn.nextInt());
		System.out.println("Novo nome do cliente: ");
		cliente.setNome(scn.next());
		
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();*/

		entityManager.close();
		entityManagerFactory.close();
		
	}
	
}
