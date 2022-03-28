package main;

public class Teste {
	public static void main(String[] args) {
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		Prioridade pNormal = Prioridade.NORMAL;
		
		System.out.println(pMin + " " + pMax);
		
		System.out.println(pMax.compareTo(pNormal));
		System.out.println(pMin.name());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.getValor());
		System.out.println(pNormal.getValor());
		System.out.println(pMax.getValor());
	}
}
