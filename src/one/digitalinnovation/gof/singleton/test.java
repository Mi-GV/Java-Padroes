package one.digitalinnovation.gof.singleton;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class test {

    public static void main (String[] args){

        //Singleton
         SingletonLazy lazy = SingletonLazy.getIntancia();
         System.out.println(lazy);
         lazy = SingletonLazy.getIntancia();
         System.out.println(lazy);

        SingletonEager eager = SingletonEager.getIntancia();
        System.out.println(eager);
        eager = SingletonEager.getIntancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getIntancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getIntancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Michelle", "14801788");


    }
}
