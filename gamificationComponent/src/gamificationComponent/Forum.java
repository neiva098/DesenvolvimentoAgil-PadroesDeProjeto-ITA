package gamificationComponent;

public class Forum implements ForumService {
	@Override
	public void addTopic(String user, String topic) {
		System.out.println("T�pico:" + topic + "adicionado para o usuario " + user);
	}

	@Override
	public void addComment(String user, String topic, String coment) {
		System.out.println("Comentario: " + coment + " adicionado para o t�pico: " + topic + " do usuario: " + user);
	}

	@Override
	public void likeTopic(String user, String topic, String topicUser) {
		System.out.println(
				"Like adicionado para o t�pico: " + topic + " do usuario" + topicUser + " likado pelo " + user);
	}

	@Override
	public void likeComment(String user, String topic, String comment, String commentUser) {
		System.out.println("Comentario" + comment + " de " + commentUser + " do topico: " + topic + " do usuario" + user
				+ "foi curtido");
	}
}
