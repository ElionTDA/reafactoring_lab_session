package lanSimulation.internals;

public class Workstation extends Node{
	
	public Workstation(String name) {
		 		super(name);
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
