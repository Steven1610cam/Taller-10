public class Gato extends Animal {
    // Error de compilación: Diferente firma del método
    public void hacerSonido(String sonido) {
        System.out.println("El gato hace: " + sonido);
    }
}