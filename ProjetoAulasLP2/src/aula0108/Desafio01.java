package aula0108;

public class Desafio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node();
		int x=0;
		int y=0;
		
		long tempoSemPrint = 0;
		long tempoComPrint = 0;
		long tempoInicial = System.nanoTime();
		root.set26(30);
		int matriz[][]= new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				x= (int)(Math.random()*(26-y));
				y++;
				x=root.seek(x);
				matriz[i][j]=x;
			}
			
		}
		tempoSemPrint = System.nanoTime();
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j]);
				System.out.print("//");
			}
			System.out.println();
		}
		tempoComPrint = System.nanoTime();
		tempoSemPrint=tempoSemPrint  -tempoInicial ;
		tempoComPrint =tempoComPrint  - tempoInicial;
		tempoSemPrint/=100000;
		tempoComPrint/=100000;
		System.out.println("Tempo sem print em décimos de milissegundo:"+ tempoSemPrint);
		System.out.println("Tempo com print em décimos de milissegundo:"+ tempoComPrint);
		
	}

}
