package dom_github;
import java.nio.file.Path;
import java.util.TreeMap;

import org.antlr.v4.runtime.tree.ParseTree;

import dom_terraform.Module;

/**
 * @author nichb
 *
 */
@SuppressWarnings("unused")
public class Repo extends Module {
	
	private static TreeMap<String, Repo> repos = new TreeMap<String, Repo>();
	
	// Repo has a path, which contains:
	// 1. Username
	// 2. Reponame
	// 3. VersionId
	private Path path;
	
	private Module module;
	
	public Repo(User user, Path path)
	{
		this.path = GithubRoot.path.relativize(path);
		
		user.addRepo(this);
		repos.put(getKey(), this);
	}
	public String getKey()
	{
		return path.toString();
	}
	public String getName()
	{
		// untested, may also include the user
		return path.getName(1).toString();
	}
	public String getVersion()
	{
		return path.getFileName().toString();
	}
	public static Repo getRepo(String repoKey)
	{
		return repos.get(repoKey);
	}
	
	/**
	 * If foldername is in folders, return the Folder
	 * Else create new Folder(repo, foldername), add to folders, and return the Folder
	 * @param foldername
	 * @return
	 
	public Folder getOrAddFolder(Path folderpath)
	{
		folderpath = Root.path.relativize(folderpath);
		Folder folder = folders.get(folderpath.toString());
		if (folder == null)
		{
			folder = new Folder(this, folderpath);
			folders.put(folder.getKey(), folder);
		}
		return folder;
	}
	*/
}
