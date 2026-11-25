import java.util.Scanner;
public class RegistroComidas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);        
        int totalRealizadas=0, desayunos=0, almuerzos=0, cenas=0, omitidas=0, tipo1=0, tipo2=0, tipo3=0, tipo4=0, diasCompletos=0;
        System.out.println("REGISTRO DE COMIDAS (7 DIAS)");
        int dia = 1;
        while(dia <= 7){
            System.out.println("DIA "+dia);
            int realizadasDia = 0;
            int omitidasDia = 0;
            int momento = 1;
            while (momento <= 3){
                String nombre;
                if (momento == 1){
                    nombre = "desayuno";
                }else if(momento == 2){
                    nombre = "almuerzo";
                }else{
                    nombre= "cena";
                }
                System.out.print("¿Hizo " + nombre + "? (S/N): ");
                String respuesta = tcl.nextLine().toUpperCase();
                while (!respuesta.equals("S") && !respuesta.equals("N")){
                    System.out.print("Respuesta iválida, ingrese S o N: ");
                    respuesta = tcl.nextLine().toUpperCase();
                }
                if (respuesta.equals("S")){
                    realizadasDia++;
                    totalRealizadas++;               
                    //CONTAR POR MOMENTO
                    if (momento == 1){
                        desayunos++;
                    }else if (momento == 2){
                    almuerzos++;
                    }else{
                    cenas++;
                    }
                 System.out.println("Tipo de almuerzo predominante: ");
                    System.out.println("1. Frutas y verduras");
                    System.out.println("2. Cereales y tuberculos");
                    System.out.println("3. Carnes, huevos y legumbres");
                    System.out.println("4. Otros alimentos");
                    System.out.println("Seleccione (1-4)");
                    int opcion = tcl.nextInt();
                    while (opcion < 1 || opcion > 4){
                        System.out.print("Opción inválida. Ingrese un numero del 1 al 4: ");
                        opcion = tcl.nextInt();
                    }
                    if (opcion == 1){
                        tipo1++;
                    }else if (opcion == 2){
                        tipo2++;
                    }else if (opcion == 3){
                        tipo3++;
                    }else {
                        tipo4++;
                    }
                    tcl.nextLine();
                }else{
                    omitidasDia++;
                    omitidas++;
                }
                momento++;
            }
            System.out.println("RESUMEN DEL DIA " + dia);
            System.out.println("Comidas realizadas: " + realizadasDia);
            System.out.println("Comidas omitidas: " + omitidasDia);
            if (realizadasDia == 3){
                diasCompletos++;
            }
            dia++;
        }
        double promedioDiario = totalRealizadas/7.0;
        double porcentaje = (totalRealizadas / 21.0)*100;
        System.out.println("RESULTADOS DE LA SEMANA");
        System.out.println("1. Total de comidas realizadas: " + totalRealizadas);
        System.out.println("2. Desayunos: "+ desayunos + " | Almuerxos: " + almuerzos + " | Cenas: "+ cenas);
        System.out.println("3. Comidas omitidas: " + omitidas);
        System.out.println("4. Registros por tipo de alimento: ");
        System.out.println(" -Frutas y verduras: " + tipo1);
        System.out.println(" -Cereales y tubérculos: " + tipo2);
        System.out.println(" -Carnes, huevos y legumbres: " + tipo3);
        System.out.println(" -Otros alimentos: " + tipo4);
        System.out.printf("5. Promedio diario de comidas realizadas: %.2f%n", promedioDiario);
        System.out.printf("6. Porcentaje comidas realizadas (de 21): %.2f%%%n", porcentaje);
        System.out.println("7. Días con las tres comidas: " + diasCompletos);
    }
}