package lanSimulation.internals;

public class Printer extends Node{

	public Printer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void printOn(StringBuffer buf, Node currentNode) {
		buf.append("Printer ");
		buf.append(currentNode.name_);
		buf.append(" [Printer]");
	}
	@Override
	public void printOnHTML(StringBuffer buf, Node currentNode) {
		buf.append("Printer ");
		buf.append(currentNode.name_);
		buf.append(" [Printer]");
	}
	@Override
	public void printOnXML(StringBuffer buf, Node currentNode) {
		buf.append("<printer>");
		buf.append(currentNode.name_);
		buf.append("</printer>");
	}

}
