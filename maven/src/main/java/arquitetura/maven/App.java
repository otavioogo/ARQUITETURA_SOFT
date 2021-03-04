package arquitetura.maven;

import java.util.Scanner;

import calculo_solos.*;

public class App {
	
   	Element1 elementy = new Element1();

    public static void main(String[] args) {
    	Produtor dadosProd = new Produtor();
    	
    	App app = new App();


   
//    	dados p´re recebidos 


    	
    	app.elementy = app.elementRecebido();
    	 
    	System.out.println("cmol: " + app.somaScmol(app.elementy));
    	
    	System.out.println("Ctc cmol: " + app.somaCtc(app.elementy));
    	
    	System.out.println("V%: " + app.vAtual(app.elementy));
    }
    
// printando os dados recebidos
    
    public Element1 elementRecebido() {    	
       	Element elementy = new Element();

    	Scanner lerDadosProdutor = new Scanner(System.in);
    	
    	System.out.println("Digite o valor do Fósforo: ");
    	elementy.setFosforo(lerDadosProdutor.nextDouble());
    	
    	System.out.println("Digite o valor do Potássio: ");
    	elementy.setPotassio(lerDadosProdutor.nextDouble());
    	
    	System.out.println("Digite o valor do Cálcio: ");
    	elementy.setCalcio(lerDadosProdutor.nextDouble());
    	
    	System.out.println("Digite o valor do Magnésio: ");
    	elementy.setMagnesio(lerDadosProdutor.nextDouble());

    	System.out.println("Digite o valor do Enxofre: ");
    	elementy.setEnxofre(lerDadosProdutor.nextDouble());
 
    	System.out.println("Digite o valor do Alumínio: ");
    	elementy.setAluminio(lerDadosProdutor.nextDouble());

    	System.out.println("Digite o valor do H + Al: ");
    	elementy.sethAl(lerDadosProdutor.nextDouble());
    	
    	lerDadosProdutor.close();
    	return elementy;
    }
    
   // 

    public Produtor dadosRecebProp() {
    	Produtor dadosProd = new Produtor();
    	
    	Scanner lerDadosProdutor = new Scanner(System.in);
    	
    	System.out.println("Nome do Produtor: ");
    	dadosProd.setNomeProdutor(lerDadosProdutor.next());

     	System.out.println("Área total: ");
    	dadosProd.setAreaTotal(lerDadosProdutor.nextDouble());
 
    	System.out.println("Talhão: ");
    	dadosProd.setTalhao(lerDadosProdutor.nextInt());

    	System.out.println("Área Talhão: ");
    	dadosProd.setAreaTalhao(lerDadosProdutor.nextDouble());

    	System.out.println("Matrícula do Lote: ");
    	dadosProd.setMatriculaLote(lerDadosProdutor.nextInt());

    	System.out.println("Textura de Solo: ");
    	dadosProd.setTexturaSolo(lerDadosProdutor.nextInt());

    	System.out.println("Sistema de Cultivo: ");
    	dadosProd.setSistemaCultivo(lerDadosProdutor.nextInt());
    	
    	System.out.println("Responsável Técnico: ");
    	dadosProd.setRespTecnico(lerDadosProdutor.next());
    	
     	System.out.println("Produnfidade da amostra de solos: ");
    	dadosProd.setProfundAmostra(lerDadosProdutor.nextDouble());
    	
    	System.out.println("Resultado da análise de solos Nº: ");
    	dadosProd.setNumAnalise(lerDadosProdutor.nextInt());
    	
    	lerDadosProdutor.close();
    	return dadosProd;
    }
    







    public double somaScmol(Element1 elementy) {
    	return elementy.getPotassio() + elementy.getCalcio() + elementy.getMagnesio();
    }
    public double somaCtc(Element1 elemento) {
    	return somaScmol(elemento) + elemento.gethAl();
    }
    public double vAtual(Element1 elemento) {
    	return 100 * somaScmol(elemento) / somaCtc(elemento);
    }
    
    

    
    
}
