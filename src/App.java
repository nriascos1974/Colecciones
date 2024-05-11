public class App {
    public static void main(String[] args) throws Exception {
        
        Sets sets = new Sets();
        
        //Adiciona los elementos en cualquier orden
        sets.hashSet();
        //Adiciona los elementos en Orden Afabetico
        sets.treeSet();
        //Adiciona los elementos en el Orden que se ingresan
        sets.linkedHashSet();

        
    }
}
