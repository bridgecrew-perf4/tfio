package main;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map.Entry;

import org.antlr.v4.runtime.tree.ParseTree;

import antlr4.tfParserListener;
import dom_terraform.Module;
import util_listener.ExecuteParseListener;

@SuppressWarnings("unused")
public class WalkFolder implements FileVisitor<Path> 
{	
	private Module module;
	private tfParserListener listener;
	
	public WalkFolder(Module module, tfParserListener listener)
	{
		this.module = module;
		this.listener = listener;
	}
	
	@Override
	public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) 
	{
		if (attrs.isRegularFile() && path.toString().endsWith(".tf"))
		{
			try {
				ExecuteParseListener.listen(path, module, listener);
			} catch (Exception e) {
				return FileVisitResult.CONTINUE;
			}
		}
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFileFailed(Path path, IOException exc) throws IOException {
		System.out.println("Failed:\t" + path.toString() + "\n" + exc.getMessage());
		return FileVisitResult.TERMINATE;
	}
	
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		return FileVisitResult.CONTINUE;
	}
}