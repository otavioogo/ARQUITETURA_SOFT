package solos1;

public class Solos {
	
//	podia fazer uma funcao , e com o if retornar o elemento daria certo tambem
	
	
	private Element1 soloIdeal(int tipoSolo) {
		Element1 elemento = new Element1();
		switch (tipoSolo) {
			case 1:
				System.out.println("Argiloso");
                                
				elemento.setFosforo(9.0);
				elemento.setPotassio(0.35);
				elemento.setCalcio(6.0);
				elemento.setMagnesio(1.5);
				elemento.setEnxofre(9.0);
				elemento.setAluminio(0);
				elemento.sethAl(0);
				return elemento;
			case 2:
				System.out.println("Solo Text. Média");
                                
				elemento.setFosforo(12.0);
				elemento.setPotassio(0.25);
				elemento.setCalcio(6.0);
				elemento.setMagnesio(1.5);
				elemento.setEnxofre(9.0);
				elemento.setAluminio(0);
				elemento.sethAl(0);
				return elemento;
			default:
                            
                            
				System.out.println("Solo não encontrando!");
				return elemento;
		}
	}
}