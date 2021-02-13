package unused;

import java.nio.file.Path;

public class Version {
	
	private Path versionPath;
	
	public Version(Repo repo, Path versionPath) {
		this.versionPath = versionPath;
	}

	public Path getPath() {
		return versionPath;
	}
}
