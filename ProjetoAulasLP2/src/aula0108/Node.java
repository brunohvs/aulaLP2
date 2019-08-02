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
		if (n == 0)
		{
			return;
		}
		else 
		{ 
			Node novo = new Node();
			this.setX(n);
			this.setNo(novo);
			this.no.set26(n-1);
		}
	}
	public int seek(int n) {
		
		if(this.no.equals(null))
		{
			return n;
		}
		Node a= this.getNo();
		
		if(n==0)
	    {
			a = this.getNo();
			this.setNo(a.getNo());
	    	if(a.equals(null)) {
	    	return (this.getX()-(2*this.getX()));}
	    	return (a.getX()-(2*a.getX()));
	    }
		 
		else
		{
			
			
			return this.no.seek(n-1);
		}
	}

}
