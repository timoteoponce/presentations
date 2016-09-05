# Checklist

[x] copia impresa de los documentos
[x] preguntas iniciales respondidas
[x] presentación de 3 minutos
[x] bosquejo de la audiencia
[x] esquema general de la presentación/partes de la presentación 
[x] guión de la presentacion (30 mins)
[x] diapositivas en base al guión
[x] 1ra práctica
[x] 2da práctica
[ ] 3ra práctica
[ ] 4ta práctica
[ ] 5ta práctica
[ ] 6ta práctica
[ ] 7ma práctica
[ ] 8va práctica
[ ] 9na práctica
[ ] 10ma práctica
[ ] Lista de posibles preguntas

# La idea principal

- Qué necesita ser entendido para transmitir la idea principal?
  La inconsistencia en el desarrollo del software
  entre lo que los usuarios requieren y lo que el software entrega.

- Qué puedo esperar que la audiencia ya conozca?
  Proceso de desarrollo de software, problemas comunes en el ámbito
  del desarrollo, programación estructurada u orientada a objetos.

# La audiencia

- **Peinado**: Académico con algo de experiencia, conocedor del proceso
  de presentación y bastante formal, rígido
- **Evelio**: Académico y con mucha experiencia, no muy conocedor del
  ámbito de desarrollo pero interesado en el tema, accesible
- **Ernesto**: Académico y con experiencia, interesado en el tema
  y muy procedimental, accesible a convencer

# Presentación de 3 minutos
## 1
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

  Pero DCI carece de herramientas reales que permitan su aplicación
  en el entorno de desarrollo, es una arquitectura conceptual que 
  requiere convenciones y artefactos que permitan su uso en ambientes
  de producción reales.

Objetivo del estudio

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

# Esquema de la presentación

- Problema
- Solución propuesta + demostración con ejemplos
- Motivación 
- Objetivo del estudio + objetivos específicos
- Metodología?? 
- Implementación 
  - Arquitectura DCI
  - Requerimientos de artefactos de programación
  - Scala
  - Arquetipo de desarrollo + sitio y guias
  - Desarrollo de prototipo y comparativa
- Resultados
