package dom_terraform;

import java.util.TreeMap;

/** The Node class is an all-purpose generalization of an AST Node
 * There are many types of Nodes, however, we'll try and abstract them all for now
 * The key of a Node is TBD
 * 
 */
public class Node {
	
	private TreeMap<String, Node> children;
	
	public Node() {
		
	}

}
