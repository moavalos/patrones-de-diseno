package patrones.estructurales;

import patrones.estructurales.adapter.CreditCard;
import patrones.estructurales.bridge.ClassicCreditCard;
import patrones.estructurales.bridge.CreditCardBridge;
import patrones.estructurales.bridge.SecureCreditCard;
import patrones.estructurales.bridge.UnsecureCreditCard;
import patrones.estructurales.composite.CuentaAhorro;
import patrones.estructurales.composite.CuentaComponent;
import patrones.estructurales.composite.CuentaComposite;
import patrones.estructurales.composite.CuentaCorriente;
import patrones.estructurales.decorator.*;
import patrones.estructurales.facade.CreditMarket;
import patrones.estructurales.flyweight.Enemy;
import patrones.estructurales.flyweight.EnemyFactory;

import java.util.Random;

public class Main {

    /**
     * Composición de las clases y objetos.
     * separan la interfaz de la implementación.
     * si una parte cambia, no es necesario cambiar toda la estructura
     */

    public static void main(String[] args) {
        probarAdapter();
        probarBridge();
        probarComposite();
        probarDecorator();
        probarFacade();
        probarFlyweight();
    }

    private static void probarFacade(){
        CreditMarket creditMarket = new CreditMarket();
        creditMarket.showCreditBlack();
        creditMarket.showCreditGold();
        creditMarket.showCreditSilver();
    }

    private static void probarFlyweight(){
        for(int i=0; i<15; i++){
            Enemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
            enemy.setWeapon(getRandomWeapon());
            enemy.lifePoints();
        }
    }

    private static String getRandomWeapon(){
        Random r = new Random();
        int randInt = r.nextInt(weapon.length);
        return weapon[randInt];
    }

    private static String getRandomEnemyType(){
        Random r = new Random();
        int randInt = r.nextInt(enemyType.length);
        return enemyType[randInt];
    }

    private static String[] enemyType = {"Private", "Detective"};
    private static String[] weapon = {"Fusil", "Revolver", "Pistola", "Metralleta", "Lanza Granadas", "9mm"};


    private static void probarDecorator(){
        Credit gold = new Gold();

        Credit blackInternationalPayment = new Black();
        blackInternationalPayment = new InternationalPaymentDecorator(blackInternationalPayment);

        Credit goldSecureInternational = new Gold();
        goldSecureInternational = new InternationalPaymentDecorator(goldSecureInternational);
        goldSecureInternational = new SecureDecorator(goldSecureInternational);

        System.out.println("----Tarjeta Gold con configuración----");
        gold.showCredit();

        System.out.println("----Tarjeta Black con configuración----");
        blackInternationalPayment.showCredit();

        System.out.println("----Tarjeta Gold2 con configuración----");
        goldSecureInternational.showCredit();

    }

    private static void probarComposite(){
        CuentaComponent cuentaCorriente = new CuentaCorriente(1000.0, "Alberto");
        CuentaComponent cuentaAhorro = new CuentaAhorro(20000.0, "Alberto");

        CuentaComposite cuentaComposite = new CuentaComposite();
        cuentaComposite.addCuenta(cuentaCorriente);
        cuentaComposite.addCuenta(cuentaAhorro);

        cuentaComposite.showAccountName();
        cuentaComposite.getAmount();
    }

    private static void probarBridge(){
        CreditCardBridge classic = new ClassicCreditCard(new UnsecureCreditCard());
        classic.realizarPago();

        classic = new ClassicCreditCard(new SecureCreditCard());
        classic.realizarPago();
    }

    private static void probarAdapter(){
        CreditCard creditCard = new CreditCard();
        creditCard.pay("classic");
        creditCard.pay("gold");
        creditCard.pay("black");
        creditCard.pay("silver");
    }
}