Motivación

  La simplicidad es pre-requisito para la consistencia.

  Si hay algo que es necesario que se obtenga de esta 
  presentación, es retomar la importancia de simplicidad.

  Simplicidad es una característica difícil de obtener,
  mucho más difícil de mantener, pero brinda una ventaja 
  abismal con respecto a lo que uno tiene que hacer.

Problema  

  Alguna vez han trabajado en un documento Word ubicando imágenes
  centradas y varias páginas, y después al modificar el tamaño de
  página todo el documento pierde su formato?

  Este es un conflicto muy comun entre lo que el programa hace,
  y lo que el usuario espera, ya que lo que el programa hace (su modelo de documento) es definido en
  un esquema (lenguaje de programación) diferente al del usuario final
  (lenguaje de comunicación).

  Para resolver este problema, diferentes técincas de programación han
  sido propuestas para acercar la especificación del software
  (programación) hacia las necesidades de los usuarios.

Solucion

  Datos, Contextos e Interacciones es un patrón de arquitectura que
  propone un modelo computacional que permita representar las
  necesidades de los usuarios finales.

  Cómo hace esto? DCI permite definir programas en base a
  conceptos naturales de los usuarios finales (lenguaje natural), 
  poniendo asi el modelo mental de los usuarios finales en el programa.

Demostracion

  Tomemos un ejemplo, usted es una persona, un ser humano, que está
  definida por su ADN, tipo de sangre, huella digital y una serie
  de características que definen su identidad. Estos son los DATOS.

  Ahora, usted cumple diferentes funciones en su vida diaria, es
  administrador, es padre, es conductor, es esposo, etc. Todos
  estos comportamientos definen lo que usted hace, sin cambiar su
  identidad, estos son los ROLES que usted cumple.

  Pero estos ROLES son cumplidos en ciertos CONTEXTOS, usted es un
  padre en casa, un administrador en la oficina, un conductor en la
  carretera. Estos ROLES solamente tienen un significado dentro de
  un CONTEXTO, donde usted INTERACTÚA con otros individuos que
  también están cumpliendo otros ROLES.

  DCI entonces toma estos elementos del lenguaje natural y permite
  especificarlos dentro un programa.
  
Motivación

  DCI es una alternativa a las herramientas que usamos para elaborar
  sistemas, que tiene como objetivo reducir la complejidad de las
  aplicaciones haciendo que estas estén definidas en base al lenguaje
  natural de los usuarios finales.

Objetivo de la presentación 

  El objetivo de mi trabajo es elaborar una herramienta de
  aplicación de este patrón arquitectónico que permita desarrollar
  programas que representen lo que el usuario final espera.

Pasos a seguir

  Para lograr este objetivo se:

  -  creó un arquetipo de desarrollo que permite desarrollar 
  aplicaciones con esta arquitectura de forma efectiva
  - después se elaboró un proyecto prototipo en base a un
  sistema real 
  - y se realizó una comparativa de factores entre
  el sistema existente y su versión DCI, para identificar ventajas
  y desventajas.


Resultados

  Los resultados:
  - DCI permite definir programas de forma mas natural.
  - no tiene un costo de rendimiento en el sistema real.
  - permite tener una mayor claridad con respecto a lo que un programa hace. 
  - consistencia entre lo que el programa hace, y el programa espera


