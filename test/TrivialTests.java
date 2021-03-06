import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(false);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1(){
        //Arrange
        Game sut = new Game();
        sut.agregar("Maria");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de Maria es 1";

        //Act
        String actual = sut.nuevaPosicionJugador();

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void al_menos_dos_jugadores(){
        Game.esJugable();
        Game juego = new Game();
        juego.agregar("Horacio");
        juego.agregar("Gustabo");
        int expected = 2;
        int actual = Game.cuantosJugadores();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void maximo_seis_jugadores(){
        Game.esJugable();

        Game juego = new Game();

        juego.agregar("Horacio");
        juego.agregar("Gustabo");
        juego.agregar("Jack");
        juego.agregar("Viktor");
        juego.agregar("Ivanov");
        juego.agregar("Yun");
        Assertions.assertEquals(6,
                Game.cuantosJugadores());

    }

    @Test
    public void jugador_sale_de_la_carcel(){
        Game.esJugable();
        Game juego = new Game();

        juego.agregar("Horacio");
        juego.agregar("Gustabo");

        juego.meterJugadorCarcel();
        juego.tirarDado(3);

        boolean expected = false;
        boolean actual = juego.comprobarJugadorCarcel();

        Assertions.assertEquals(expected, actual);



    }

    @Test
    public void ganador_sea_true(){
    Game.esJugable();
    Game juego = new Game();

    juego.agregar("Horacio");
    juego.agregar("Gustabo");

    boolean expected = true;
    boolean actual = juego.fueRespuestaCorrecta();

    Assertions.assertEquals(expected, actual);


    }

    @Test
    public void pasar_siguiente_jugador(){
        Game.esJugable();
        Game juego = new Game();
        juego.agregar("Horacio");
        juego.agregar("Gustabo");

        juego.fueRespuestaCorrecta();
        juego.pasarSiguienteJugador();

        int expected = 1;
        int actual = juego.pasarSiguienteJugador();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void refactor_Respuesta_correcta(){
        Game.esJugable();
        Game juego = new Game();
        juego.agregar("Horacio");
        juego.agregar("Gustabo");

        boolean expected = true;
        boolean actual = juego.fueRespuestaCorrecta();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void no_quedar_sin_preguntas(){
        Game.esJugable();
        Game juego = new Game();

        juego.agregar("Horacio");
        juego.agregar("Gustabo");

        boolean expected = true;
        boolean actual = juego.probarPregunta();

        Assertions.assertEquals(expected, actual);
    }
}

