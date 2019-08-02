package aula0108;

public class Desafio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node();
		int x=0;
		root.set26(26);
		int matriz[][]= new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				x-=((i-1)*5+j);
				x=root.seek(x);
				matriz[i][j]=x;
			}
			
		}
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(matriz[i][j]);
				System.out.println("//");
			}
			System.out.println();
		}
		
	}

}
