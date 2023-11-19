package EjerciciosE;

public class ArticuloEMain {
    public static void main(String[] args) {

        ArticuloE zapas = new ArticuloE("Nike",154,8,1);
        System.out.println("Con el 21% "+zapas.getPVP());
        ArticuloE camisa = new ArticuloE("Naruto",154,8,2);
        System.out.println("Con el 10% "+camisa.getPVP());
        ArticuloE pamtalon = new ArticuloE("Gucci",154,8,3);
        System.out.println("Con el 4% "+pamtalon.getPVP());









    }
}
