import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String nombre = "Porfirio Cadena";
        String tipoDeCuenta = "Corriente";
        Double saldo = 1720.00;
        String opcion = ".";
        Scanner teclado = new Scanner(System.in);

        System.out.println("************************************************");
        System.out.println("** Cliente............: " + nombre);
        System.out.println("** Tipo de Cuenta.....: " + tipoDeCuenta);
        System.out.println("** Saldo Disponible...: $" + saldo);
        System.out.println("************************************************");
        System.out.println("\n");

        String menu = """
                ****   MENU PRINCIPAL   ****
                     1 - Consulta Saldo
                     2 - Retirar
                     3 - Depositar
                     X - Salir
                """;

        while (!Objects.equals(opcion, "X")){
            System.out.println(menu);
            System.out.println("Seleccione -> ");
            opcion = teclado.next();

            switch (opcion){
                case "1":
                    System.out.println("** Saldo Disponible...: $" + saldo);
                    System.out.println("************************************************");
                    System.out.println("\n");
                    break;
                case "2":
                    System.out.println("** ¿Monto a retirar?");
                    double retiro = teclado.nextDouble();
                    if (saldo < retiro){
                        System.out.println("** Saldo Insuficientes...");
                        System.out.println("************************************************");
                        System.out.println("\n");
                    } else {
                        saldo -= retiro;
                        System.out.println("** Saldo Disponible...: $" + saldo);
                        System.out.println("************************************************");
                        System.out.println("\n");
                    }
                    break;
                case "3":
                    System.out.println("** ¿Monto a depositar?");
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.println("** Saldo Disponible...: $" + saldo);
                    System.out.println("************************************************");
                    System.out.println("\n");
                    break;
                case "X":
                    System.out.println("** Gracias, vuelva pronto!!!");
                    System.out.println("************************************************");
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("La opcion no es valida!!!");
                    System.out.println("************************************************");
                    System.out.println("\n");
            }
        }

    }
}

