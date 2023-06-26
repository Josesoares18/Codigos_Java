import java.util.Scanner;
public class Exercicio25
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        double cargaHorariaPresencial = 0, i = 0;
        double cargaHorariaOnline = 0;

        System.out.println("Exercício 06: Carga horária semanal\n");
        
        while (i < 5){
            System.out.print("Digite o tipo de aula para o dia " + i + " (P para presencial ou O para online): ");
            char tipoAula = input.next().charAt(0);
            
            if (tipoAula == 'P'){
                cargaHorariaPresencial += 3;
            } else if (tipoAula == 'O') {
                cargaHorariaOnline += 1.5;
            }
            
            i++;
        }
        input.close();

        double cargaHorariaTotal = cargaHorariaPresencial + cargaHorariaOnline;

        System.out.println("Carga horária semanal de aulas presenciais: " + cargaHorariaPresencial + " horas");
        System.out.println("Carga horária semanal de aulas online: " + cargaHorariaOnline + " horas");
        System.out.println("Carga horária semanal total: " + cargaHorariaTotal + " horas");

}
}
