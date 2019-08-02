package aula0108;

public class Node {
	private int x;
	private Node no;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Node getNo() {
		return no;
	}
	public void setNo(Node no) {
		this.no = no;
	}
	
	public void change(Node n) {
		this.setNo(n);
	}
	public void set26(int n) {
		if (n < 0)
		{
			return;
		}
		else 
		{ 
			Node novo = new Node();
			this.setX(30-n);
			this.setNo(novo);
			this.no.set26(n-1);
		}
	}
	public int seek(int n) {
		
		Node a= this.getNo();
		
		if(n==0)
	    {
			
			this.setNo(a.getNo());
	    	
	    	return a.getX();
	    }
		 
		else
		{
			
			
			return a.seek(n-1);
		}
	}

}
