public class PruebaAnimal {
    public static void main(String[] args) {
       
        Animal animal = new Animal();
        Gato gato = new Gato();
        Perro perro = new Perro();

       
        animal.hacerSonido(); 
        
        // Intentar invocar el método de Gato con un argumento
        // Esto no generará un error de compilación, pero no se puede usar como sobrescritura
        gato.hacerSonido("miau"); // Muestra: El gato hace: miau
        
        // Invocar el método hacerSonido del perro
        perro.hacerSonido(); // Muestra: El perro ladra.
    }
}