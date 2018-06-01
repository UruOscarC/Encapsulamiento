package com.ogcg.encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationTest test = new EncapsulationTest();
		
		// Al escribir test. , las unicas opciones visibles son las publicas.
		// Todas las opciones privadas solo pueden ser modificadas y leidas por metodos publicos
		test.setAge(21);
		test.setName("Oscar Colmenares");
		test.idNum = "12344556";
		System.out.println(test);
	}

}
