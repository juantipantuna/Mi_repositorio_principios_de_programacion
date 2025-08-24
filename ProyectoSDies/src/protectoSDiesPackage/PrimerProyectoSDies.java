package protectoSDiesPackage;

public class PrimerProyectoSDies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
            };
            
            System.out.println("Valor original en [1][1]: " + matriz[1][1]);
            matriz[1][1] = 100;
            System.out.println("Nuevo valor en [1][1]: " + matriz[1][1]);

	}

}
