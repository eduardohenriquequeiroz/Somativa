package Cadastro;

public abstract class PartidaEsportiva implements Partida {
	
	//Adicionando atributos
	private String data;
	private String local;
	private String placar;
	private String participantes;
	
	public PartidaEsportiva(String data, String adversario, String local, String placar, String participantes) {
		this.data = data;
		this.local = local;
		this.placar = placar;
		this.participantes = participantes;
	}

	//Modificar e exibir
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

	public String getPlacar() {
		return placar;
	}

	public void setPlacar(String placar) {
		this.placar = placar;
	}

	public String getParticipantes() {
		return participantes;
	}

	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}

	//Atribuindo a classe partida
	public abstract void calcularResultado();
		
		public void exibirResultado() {
			return;
		}
	}

