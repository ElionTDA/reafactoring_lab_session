package lanSimulation.internals;

public class Printer extends Node{

	public Printer(byte type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	private void printOn(StringBuffer buf, Node currentNode) {
		buf.append("Printer ");
		buf.append(currentNode.name_);
		buf.append(" [Printer]");
	}

}
