package br.com.caelum.livraria.testes_main;

import java.util.Random;

public class TesteRandom {

	public static void main(String[] args) {

		Random gerador = new Random();

		int geradoUm = gerador.nextInt(10);

		System.out.println(geradoUm);

		int geradoDois = gerador.nextInt(10);

		System.out.println(geradoDois);

		Random geradorBoolean = new Random(10);// seed inicial é 10

		boolean valor = geradorBoolean.nextBoolean(); // sempre true
		System.out.println(valor);

		boolean valor2 = geradorBoolean.nextBoolean(); // sempre false
		System.out.println(valor2);

	}
}
