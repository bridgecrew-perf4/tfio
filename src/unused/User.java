package unused;

import java.nio.file.Path;
import java.util.TreeMap;

@SuppressWarnings("unused")
public class User 
{
	private static TreeMap<String, User> users = new TreeMap<String, User>();
	private TreeMap<String, Repo> repos;
	
	private Path path;
	
	public User(Path path)
	{
		this.path = GithubRoot.path.relativize(path);
		repos = new TreeMap<String, Repo>();
		
		users.put(getKey(), this);
	}
	
	public String getKey()
	{
		return path.toString();
	}
	
	public static User getUser(String username) 
	{
		return users.get(username);
	}
	
	public void addRepo(Repo repo)
	{
		repos.put(repo.getName(), repo);
	}
	
	public Repo getRepo(String reponame)
	{
		return repos.get(reponame);
	}
}
