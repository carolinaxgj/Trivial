# Trivial

## Problema 0)

Extraemos el código duplicando a un único método "nuevaPosiciónJugador" ,
al que llamaremos desde ambos sitios.

Creamos un test unitario "si_al_principio_saco_un_1_voy_a_casilla_1"

## Problema 1)

Mediante un test, establecemos que el juego solo funcione si tiene un mínimo de 2 jugadores. 

Creamos un test unitario "al_menos_dos_jugadores"

## Problema 2)

Mediante un test, establecemos que el máximo de jugadores en una partida sean 6 jugadores. 

Creamos un test unitario "máximo_seis_jugadores"

## Problema 3)

Creamos un test para probar que el jugador sale de la cárcel. Añadimos dos metodos nuevos para poder comprobar esto y editamos un metodo que ya estaba.
Creamos los metodos "meterJugadorCarcel" y "comprobarJugadorCarcel".
Creamos un test unitario "jugador_sale_de_la_carcel".

## Problema 4)

Mediante un test, hacemos que en vez de noGanador = false sea ganador=true para finalizar el juego. 
Modificamos el metodo "fuerespuestaCorrecta" y el metodo "jugadorHaGanado" para que sea ganador=true. De igual forma, hay que modificar el GameLauncher cambiando tambien todos los noGanador por Ganador.
Creamos un test unitario "ganador_sea_true"

## Problema 5)

Creamos un test para comprobar que hemos eliminado código repetido.
Refactorizamos el código en un único método llamado "pasarSiguienteJugador".
Creamos un test unitario "pasar_siguiente_jugador"

## Problema 6)

Creamos un test para simplificar la función de "fueRespuestaCorrecta"
Simplificamos la funcion "fueRespuestaCorrecta" quitando el código duplicado y uniendolo en uno solo llamado "fue_respuestacorrecta".
Creamos un test unitario "refactor_Respuesta_correcta".

## Problema 7)

Creamos un test para comprobar que no nos quedamos sin preguntas.
Creamos un metodo llamado "probarPregunta" que nos ayudara a que no se quede el juego nunca sin preguntas.
Creamos un test unitario "no_quedar_sin_preguntas".


