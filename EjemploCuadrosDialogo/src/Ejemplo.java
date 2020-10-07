import javax.swing.JOptionPane;

public class Ejemplo {
	public static void main(String args[]) {
		//Swing
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad"));
		JOptionPane.showMessageDialog(null, "Hola " + nombre + " " + edad, "Titulo", JOptionPane.WARNING_MESSAGE);
	}
}
