package Cadastro;

public class FutebolPartida extends PartidaEsportiva{

	public FutebolPartida(String data, String adversario, String local, String placar, String participantes) {
		super(data, adversario, local, placar, participantes);
	}
	
	//Adicionando atributos
	private String time1;
	private String time2;
	private int golsTime1;
	private int golsTime2;

	//Modificar e exibir
	public String getTime1() {
		return time1;
	}
	public void setTime1(String time1) {
		this.time1 = time1;
	}
	public String getTime2() {
		return time2;
	}
	public void setTime2(String time2) {
		this.time2 = time2;
	}
	public int getPontosTime1() {
		return golsTime1;
	}
	public void setPontosTime1(int pontosTime1) {
		this.golsTime1 = pontosTime1;
	}
	public int getPontosTime2() {
		return golsTime2;
	}
	public void setPontosTime2(int pontosTime2) {
		this.golsTime2 = pontosTime2;
	}

	public void calcularResultado1(int pontosTime1) {
		this.golsTime1 += pontosTime1;
	}

	public void calcularResultado(int pontosTime2) {
		this.golsTime2 += golsTime2;
	}
	
	//Escolha de iniciar, pausar e encerrar a partida
	@Override
	public void iniciar() {

	}
	@Override
	public void pausar() {

	}
	@Override
	public void encerrar() {

	}
	@Override
	public void calcularResultado() {

	}


}
