package ModelHelper;

public enum HomeEnum {
	
	ADAM_HOME("D:\\workspace_mars\\ISI_PYSZNE_PL_T\\"),
	ADAM_WORK_HOME("C:\\workspaces\\workspace_neon\\ISI_PYSZNE_PL\\"),
	PATRAYK_HOME("");
	
	public final String homeDir;

	HomeEnum(String homeDir) {
		this.homeDir = homeDir;
	}

	@Override
	public String toString() {
		return homeDir;
	}

	public String getHomeDir() {
		return homeDir;
	}

}
