public class Main {
    public static void main(String[] args) {
        DoubleCircularList<Carro> lista = new DoubleCircularList<>();

        args = new String[4];
        args[0] = "Nissan 0";
        args[1] = "Toyota 1";
        args[2] = "Cherolet 2";
        args[3] = "Subaru 3";

        int n = 4;
        for (int i = 0; i < 4; i++) {
            lista.add(new Carro(args[i], i + n));
            n -= 2;
        }
        printCarros(lista);

        lista.remove(3);
        System.out.println("----------------------------");
        printCarros(lista);


    }


    public static void printCarros(DoubleCircularList<Carro> carros){
        for (int i = 0; i < carros.length(); i++) {
            System.out.println(carros.get(i).getMarca());
        }
    }
}





























