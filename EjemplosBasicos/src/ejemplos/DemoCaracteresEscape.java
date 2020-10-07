package ejemplos;

public class DemoCaracteresEscape {
	public static void main(String[] args){
		String mensaje = new String("Hola Mundo");
		System.out.println(mensaje.toUpperCase());
		System.out.println(mensaje.toLowerCase());
		System.out.println(mensaje.charAt(0));
		System.out.println(mensaje.length());
		System.out.println(mensaje.equals("Hola Mundo"));
		System.out.println(mensaje.substring(5, 10));
		
		String partes[] = mensaje.split(" ");
		System.out.println("Parte 0: " + partes[0]);
		System.out.println("Parte 1: " + partes[1]);
		System.out.println(mensaje.contains("Musdfsdf"));
		
//		System.out.println("Linea 1\nLinea 2");
//		System.out.println("\tLinea con tabulacion");
//		System.out.println("\"Texto entre comillas\" \\ ");
	}
}
