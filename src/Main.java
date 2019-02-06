
/**
 * 3. Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario,
 *    Pinguino y Lagarto. Crea, al menos, tres métodos específicos de
 *    cada clase y redefne el/los método/s cuando sea necesario.
 *    Prueba las clases creadas en un programa en el que se instancien
 *    objetos y se les apliquen métodos.
 * 
 * @author Luis José Sánchez
 */
public class Main{

  public static void main(String[] args) {
    Pinguino tux = new Pinguino(Sexo.MACHO);
    tux.come("palomitas");
    tux.programa();
    
    Perro laika = new Perro(Sexo.HEMBRA);
    laika.duerme();
    laika.dameLaPata();
    laika.amamanta();
    laika.cuidaCrias();
    
    Lagarto godzilla = new Lagarto(Sexo.MACHO);
    godzilla.tomaElSol();
    godzilla.duerme();
    
    
    
    System.out.println("\n");
    Gato misifu = new Gato(Sexo.MACHO, "Siames");
    Gato BolaDeNieve = new Gato(Sexo.HEMBRA, "persa");
    Gato BolaDeNieve2 = new Gato(Sexo.MACHO, "persa");
    
    misifu.maulla();
    misifu.amamanta();
    misifu.anda();
    misifu.caza();
    misifu.come("Filete");
    misifu.peleaCon(BolaDeNieve);
    misifu.peleaCon(BolaDeNieve2);
    misifu.limpiate();
    misifu.ronronea();
  }
}