package listener;

import antlr4.tfParser;
import antlr4.tfParserBaseListener;
import data.Block;
import data.Module;

public class ModuleBuilderListener extends tfParserBaseListener {
	
	private Module module;
	
	public ModuleBuilderListener(Module module) {
		this.module = module;
	}
	
	public Module getModule() {
		return module;
	}
	
	@Override
	public void exitFile(tfParser.FileContext ctx) {
		
		String fileName = ctx.start.getTokenSource().getSourceName();
		module.addFileBlockList(fileName);
		
		for (tfParser.TerraformContext x : ctx.terraform()) {
			module.setTerraformBlock(new Block(x), fileName);
		}
		for (tfParser.ProviderContext x : ctx.provider()) {
			module.addProviderBlock(new Block(x), fileName);
		}
		for (tfParser.ResourceContext x : ctx.resource()) {
			module.addResourceBlock(new Block(x), fileName);
		}
		for (tfParser.DataContext x : ctx.data()) {
			module.addDataBlock(new Block(x), fileName);
		}
		for (tfParser.VariableContext x : ctx.variable()) {
			module.addVariableBlock(new Block(x), fileName);
		}
		for (tfParser.OutputContext x : ctx.output()) {
			module.addOutputBlock(new Block(x), fileName);
		}
		for (tfParser.ModuleContext x : ctx.module()) {
			module.addModuleBlock(new Block(x), fileName);
		}
		for (tfParser.LocalContext x : ctx.local()) {
			for (tfParser.ArgumentContext y : x.argument()) {
				module.addLocalArgument(y, fileName);
			}
		}
	}
}
