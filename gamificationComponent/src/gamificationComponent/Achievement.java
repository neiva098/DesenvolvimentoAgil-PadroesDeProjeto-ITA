package gamificationComponent;

public abstract class Achievement {
	String name;

	public Achievement(String name) {
		this.name = name;
	}

	public String getNome() {
		return name;
	}

	public void add(String user, AchievementStorage memo) {}

	@Override
	public int hashCode() {
		final int prime = 31;
		
		return prime + ((name == null) ? 0 : name.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		return this == obj;
	}
}
