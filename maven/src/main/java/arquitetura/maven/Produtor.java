package arquitetura.maven;

public class Produtor{

	
	private String nomeProdutor;
	private double loteProdutor;
	private double areaTotal;
	private int talhao;
	private double areaTalhao;
	private int matriculaLote;
	private int texturaSolo;
	private String respTecnico;
	private double profundAmostra;
	private int numAnalise;
	
	
	public String getNomeProdutor(){
		return nomeProdutor;
	}
	public void setNomeProdutor(String nomeProdutor) {
		this.nomeProdutor = nomeProdutor;
	}
	
	
	public double getLoteProdutor(){
		return loteProdutor;
	}
	public void setLoteProdutor(double loteProdutor) {
		this.loteProdutor = loteProdutor;
	}
	
	public double getAreaTotal(){
		return areaTotal;
	}
	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}
	
	public int getTalhao(){
		return talhao;
	}
	public void setTalhao(int nomeProdutor) {
		this.talhao = talhao;
	}
	
	public double getAreaTalhao(){
		return areaTalhao;
	}
	public void setAreaTalhao(double areaTalhao) {
		this.areaTalhao = areaTalhao;
	}
	
	public int getMatriculaLote(){
		return matriculaLote;
	}
	public void setMatriculaLote(int matriculaLote) {
		this.matriculaLote = matriculaLote;
	}
	
	public int getTexturaSolo() {
		return texturaSolo;
	}
	public void setTexturaSolo(int texturaSolo) {
		 this.texturaSolo = texturaSolo;
	}
	
	public String getRespTecnico(){
		return respTecnico;
	}
	public void setRespTecnico(String respTecnico) {
		this.respTecnico = respTecnico;
	}
	
	public double getProfundAmostra(){
		return profundAmostra;
	}
	public void setProfundAmostra(double profundAmostra) {
		this.profundAmostra = profundAmostra;
	}
	
	public int getNumAnalise(){
		return numAnalise;
	}
	public void setNumAnalise(int numAnalise) {
		this.numAnalise = numAnalise;
	}

}
