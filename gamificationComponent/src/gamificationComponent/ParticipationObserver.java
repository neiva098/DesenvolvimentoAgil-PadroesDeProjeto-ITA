package gamificationComponent;

public class ParticipationObserver implements AchievementObserver {
	@Override
	public void achievementUpdate(String user, Achievement a) {
		if (a instanceof Points && a.getNome().equals("PARTICIPATION")) {
			verificaPontua��oParticipation(user);
		}
	}

	public void verificaPontua��oParticipation(String user) {
		MemoryAchievementStorage memo = (MemoryAchievementStorage) AchievementStorageFactory.getAchievementStorage();
		int pontosParticipation = ((Points) memo.getAchievement(user, "PARTICIPATION")).getValor();
		if (pontosParticipation >= 100)
			memo.addAchievement(user, new Badge("PART OF THE COMMUNITY"));
	}
}
