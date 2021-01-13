package dom_terraform;

import java.util.TreeMap;

public class Module {
	
	private Module parentModule;
	private TreeMap<String, Module> childModules;
	private TreeMap<String, Block> topLevelBlocks;
	
	public Module() {
		
	}
}
