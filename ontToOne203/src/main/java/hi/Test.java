package hi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

//		Engine engine=new Engine();
//		engine.setModelNo("2028");
//		engine.setType("hydrogen");
//		
//		
//		Car car=new Car();
//		car.setBrand("jet");
//		car.setColour("red");
//		car.setEngine(engine);
//		
//		
//		et.begin();
//		em.persist(car);
//		em.persist(engine);
//		et.commit();

		et.begin();
		Car c = em.find(Car.class, 1);
		c.setColour("red");
		et.commit();

	}

}
