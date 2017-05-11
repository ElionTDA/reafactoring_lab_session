package lanSimulation.internals;

public class Workstation extends Node{
	
	public Workstation(byte type, String name) {
		 		super(type, name);
	}

	private void printOn(StringBuffer buf, Node currentNode) {
		buf.append("Workstation ");
		buf.append(currentNode.name_);
		buf.append(" [Workstation]");
	}

	private void printOnHTML(StringBuffer buf, Node currentNode) {
		buf.append("Workstation ");
		buf.append(currentNode.name_);
		buf.append(" [Workstation]");
	}

}
