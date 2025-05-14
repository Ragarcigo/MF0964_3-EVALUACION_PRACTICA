import javax.swing.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            try {
                // Solicitamos los números al usuario
                double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número: "));
                double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número: "));

                // Creamos el objeto Operaciones
                Operaciones operaciones = new Operaciones(numero1, numero2);

                // Mostramos el menú y obtenemos la opción seleccionada
                String[] opciones = {
                        "Sumar",
                        "Restar",
                        "Multiplicar",
                        "Dividir",
                        "Resto",
                        "Potencia",
                        "Salir"
                };

                int opcion = JOptionPane.showOptionDialog(
                        null,
                        "Seleccione una operación:",
                        "Menú de opciones",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]
                );

                // Control de la opción seleccionada
                String mensaje = "";
                switch (opcion) {
                    case 0 -> mensaje = "Resultado de la suma: " + operaciones.sumar();
                    case 1 -> mensaje = "Resultado de la resta: " + operaciones.restar();
                    case 2 -> mensaje = "Resultado de la multiplicación: " + operaciones.multiplicar();
                    case 3 -> {
                        try {
                            mensaje = "Resultado de la división: " + operaciones.dividir();
                        } catch (NumberFormatException e) {
                            mensaje = "Error: No se puede dividir entre 0.";
                        }
                    }
                    case 4 -> mensaje = "Resultado del resto: " + operaciones.resto();
                    case 5 -> mensaje = "Resultado de la potencia (al cuadrado): " + operaciones.potencia(2);
                    case 6 -> {
                        continuar = false;
                        mensaje = "Gracias por usar la calculadora.";
                    }
                    default -> mensaje = "Por favor, seleccione una opción válida.";
                }

                // Mostramos el resultado al usuario
                JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Asegúrese de ingresar números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}