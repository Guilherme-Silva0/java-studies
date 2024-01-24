package studies.maratonajava.introducao;
/*
    Prática

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Jhon Doe";
        String adress = "Rua das flores";
        float wage = 3500.25f;
        String date = "24/01/2024";

        System.out.println("Eu " + name + ", morando no endereço " + adress + ",\nconfirmo que recebi o salário de " + wage + ", na data " + date );
    }
}
