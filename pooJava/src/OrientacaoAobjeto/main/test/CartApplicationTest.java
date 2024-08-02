package OrientacaoAobjeto.main.test;

import OrientacaoAobjeto.main.dominio.CartsApplication;

public class CartApplicationTest {
    public static void main(String[] args) {
        CartsApplication cart = new CartsApplication();
        cart.nameCart = "Mustang";
        cart.modeloCart = "285FDW";
        cart.anoCart = 1988;

        System.out.println("O "+cart.nameCart+", foi lançado em "+cart.anoCart+" e pertence ao modelo "+cart.modeloCart);
    }
}
