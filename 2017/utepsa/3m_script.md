# Anécdota

Durante un proyecto reciente en el que trabajamos, 
entramos a reemplazar un equipo de desarrollo alemán,
el proyecto estaba en muy malas condiciones:

  -  el servicio tenía muchos errores
  -  cada cambio o arreglo era riesgoso, nuevos errores se encontraban
  -  la estabilidad del servicio era desconocida

El equipo alemán estaba agotado, ya no podía seguir
desarrollando sobre el servicio, pero el servicio era 
rentable, tenía un mercado en crecimiento y una buena
base de usuarios.

Entonces entramos nosotros a desarrollar sobre este servicio,
las dudas eran muchas, los miedos bastantes, pero afortunadamente,
no contaban con nuestra astucia. 

Ya habíamos tenidos situaciones similares en otros proyectos, 
sabíamos que era lo que había que hacer, todo esto nos fue enseñado
por uno de los mejores programadores que haya conocido, un físico
teórico.

Con las enseñanzas de este físico empezamos con el proyecto, 
que tenía muchos problemas y muchos clientes, a intentar mantenerlo 
funcionando y mejorarlo al mismo tiempo. Todo en base a un principio
gúia:

  1.  identificar el problema
  2.  plantear una solución
  3.  demostrar la solución en un escenario de prueba
  4.  éxito: lanzar nueva versión
  5.  fracaso: volver al punto 1

Identifican esa serie de pasos? es el método científico.

Al inicio los problemas fueron muchos, retrasos, errores, discusiones 
y muchas renuncias. Pero eventualmente llegamos a estabilizar el 
servicio, a corregir todos los errores serios, y a mover el negocio de
este servicio a satisfacer las nuevas necesidades.

# Problema

El servicio X es inestable e inflexible, lo cual genera dificultades
para que los clientes sigan usando el servicio y las capacidades del
mismo se extiendan para nuevos clientes.

# Solución

Implementar el método científico como proceso de desarrollo
para estabilizar y flexibilizar el servicio X
a través de mejoras incrementales en el software. 

TLDR: Aplicar Continuous Delivery

# Ingredientes

  -  Proceso de desarrollo iterativo (scrum, crystal, xp)
  -  Sistema de control de versiones (git, hg, fossil)
  -  Pruebas automatizadas
  -  Instalaciones automatizadas

# Topologías/Patrones

  -  Clay: Startups y negocios pequeños, necesitan demostrar algo y
     hacerlo rápido, pocas integraciones con otros servicios,
     flexibilidad y rápida respuesta a cambios
  -  Wood: Negocios establecidos, con necesidades de servicios mas
     estables, brindan APIs para integrarse con otros servicios, 
     consistencia
  -  Iron: Empresas de gran envergadura, requieren integración con
     múltiples servicios, estabilidad y consistencia son primordiales

# Conclusiones y recomendaciones

  -  El desarrollo de software es ampliamente experimental en muchos
     aspectos

  -  Ambientes experimentales requieren que los cambios sean fáciles de
     realizar y rápidos para descartar

  -  Terminado quiere decir, desarrollado, verificado y desplegado en
     producción
