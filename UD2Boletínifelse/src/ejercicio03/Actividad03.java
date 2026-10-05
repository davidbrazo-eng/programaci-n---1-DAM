package ejercicio03;

public class Actividad03 {
	public static void main(String[] args) {
		Integer anyo = 2024;
		Integer mes = 2;
		Integer dias = null;

		if (mes != 2) 

			if (mes == 4 || mes == 6 || mes == 11 || mes == 9) {
				dias = 30;

			} else {
				dias = 31;
				
			}
		else if (anyo % 4==0 && anyo % 100 != 0) {
			dias = 29;
			
		}
		else {
			dias = 28;
		}
		
		System.out.println("El mes " +mes+ " del año " +anyo+ " tiene " +dias+ " días.");
	}

}
