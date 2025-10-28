import javax.swing.JOptionPane;  //Recurso para o modo grafico
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Entre com o peso do usuário: ")); //casting

        double altura =Double.parseDouble(JOptionPane.showInputDialog("Entre com a altura do usuário: "));

        double imc = peso / (altura * altura);
        String formatado = String.format("%.2f", imc);

        if (imc < 18.5) {

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Abaixo do peso");

        } else if (imc >= 18.6 && imc < 24.9) {

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Peso ideal");

        }else if(imc >= 25.0 && imc <= 29.9){

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Você está acima do peso");

        } else if(imc >= 30 && imc <= 34.9){

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Obesidade grau 1");
        } else if(imc >= 35 && imc <= 34.9){

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Obesidade grau 2 (Severa)");
        } else if (imc >= 40){

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Obesidade grau 3 (Morbida)");
        }

        sc.close();


    }
}