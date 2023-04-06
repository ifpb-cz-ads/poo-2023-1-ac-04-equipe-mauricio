public class CTExercicio01 {

    public static void main (String[] arg) {

        int idade = 69;

        if (idade < 16) {
            System.out.println("Não pode votar!");
        }
        else if (idade < 65 && idade > 18) {
            System.out.println("Voto obrigatório!");
        }
        else {
            System.out.println("Voto é facultativo!");
        }
    }

}
