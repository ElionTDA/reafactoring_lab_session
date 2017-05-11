package lanSimulation.internals;

public class Workstation extends Node{
	
	public Workstation(byte type, String name) {
		 		super(type, name);
	}
	
	@Override
	protected void printOn(StringBuffer buf, Node currentNode) {
		buf.append("Workstation ");
		buf.append(currentNode.name_);
		buf.append(" [Workstation]");
	}

	@Override
	public void printOnHTML(StringBuffer buf, Node currentNode) {
		buf.append("Workstation ");
		buf.append(currentNode.name_);
		buf.append(" [Workstation]");
	}
	@Override
	public void printOnXML(StringBuffer buf, Node currentNode) {
		buf.append("<workstation>");
		buf.append(currentNode.name_);
		buf.append("</workstation>");
	}

}
