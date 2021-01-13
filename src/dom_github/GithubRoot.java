package dom_github;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GithubRoot {
	
	public static Path path = Paths.get("C:/Users/nichb/Anaconda/repos_modules-specified");
	
	public static void setPath(Path pathToSet) {
		path = pathToSet;
	}
}
