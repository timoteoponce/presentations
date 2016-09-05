# Glosario
- Paradigma: conjunto de conceptos/teorias/patrones/métodos 
y convenciones que pueden ser usados en un escenario epecífico

# Presentacion
Buen dia, mi nombre es Timoteo Ponce y tengo el
agrado hoy de presentarles mi trabajo de grado 
para la maestría de Ing. en Software.

El trabajo se titula 'mejora de correctitud en el 
desarrollo de sistemas de software, aplicando el 
paradigma de desarrollo en roles DCI'

# Problema
Empecemos por el problema, y como siempre es mejor 
iniciemos con un ejemplo.

# Problema-1
Actualmente en este momento en el planeta tierra 
existen 300 millones de usuarios de MSWord, 

# Problema-2
y de estos usuarios aproximadamente 40 millones de 
documentos se crean y editan diariamente.

# Problema-3
todos estos documentos tienen imágenes, localizadas y 
personalizadas, y entonces, a alguien se le ocurre
cambiar el tamaño de página.

y ahora tenemos 40 millones de problemas, el documento
pierde formato, los espacios se saltan, y las imágenes
se reubican donde pueden. 

Pero claro me dirán, esto se soluciona usando apropiadamente
el software, pero he ahi un problema,

# Problema-4
esos son uds. adaptandose a la herramienta, no la herramienta
resolviendo un problema,

ud. verán, existe en el programa un conflicto, lo que el usuario
quiere no esta reflejado en el modelo de programación usado dentro
del programa, el programa está descrito como una interpretación
de lo que sus programadores entienden del usuario, y no realmente 
de lo que el espera.

# Problema-5
qué tenemos entonces?
- inconsistencia entre lo que el usuario quiere y el programa hace
- necesidades constanstes de soporte y mantenimiento
- costos elevados de soporte y mantenimiento, porque el programador
  debe actualizar el programa interpretando lo que el usuario espera
- costos de desarrollo con ingresos reducidos

A esto existe una teoría de Joel Spolsky que dice, 'todo software toma
10 años para ser un buen software'.

# Solucion propuesta
Este es un gran problema, muchas empresas mueren antes de siquiera
llegar a tener la chance de cumplir lo que el usuario final quiere,
es por eso que la situación deseada de muchas empresas de software
se puede resumir en:

# Solucion propuesta-1
- programas consistentes con lo que los usuarios esperan (programas
  correctos)
- programas flexibles para evolucionar
- reducir costos de desarrollo

# Solucion propuesta-2
Y varias técnicas han sido propuestas (y siguen siendo propuestas) para
intentar llegar a esa situación deseada:

- Diseño guiado por responsabilidades
- Diseño guiado por comportamiento
- Datos, contextos e interacciones

# Solucion propuesta-3
y la propuesta de este trabajo se centra en DCI debido a las características
diferenciables que tiene con respecto a las otras alternativas:

- Es un modelo arquitectónico que incluye un paradigma de desarrollo
  diferente
- Está basado en conceptos de comunicación humana
- Está orientado a ser legible y reutilizable
- Fué propuesto por Trygve Reenskaug, el creador del patrón de diseño
  MVC y muchos otros principios de desarrollo

# Solucion propuesta-4
y cual es la motivación adicional para esta propuesta de DCI?

- nuestra situación deseada puede ser alcanzada usando DCI
- DCI es una arquitectura conceptual
- que carece de herramientas que permitan su implementación en un
  entorno real

# Objetivo del trabajo
Entonces, en base a nuestro problema, nuestra situación deseada 
y la alternativa de DCI, el objetivo principal de este trabajo es:

# Objetivo del trabajo-1
"Mejorar la correctitud en el desarrollo de sistemas de software, 
aplicando el paradigma de desarrollo basado en roles DCI,
a través de la elaboración de un arquetipo de desarrollo"

# Objetivo del trabajo-2
Como objetivos específicos tenemos los siguientes:

- Localizar el trabajo para el entorno de Swissbytes (ya que tenemos una
  infraestructura y clientes dispuestos a realizar pruebas piloto)
- Definir los indicadores de desarrollo que nos permitirán cuantificar
  la efectividad del trabajo
- Elaborar el arquetipo DCI y su proyecto prototipo 
- Recolectar datos del prototipo y cotejar resultados en base a los
  indicadores inicialmente identificados
- Analizar ventajas y desventajas en base a los datos recolectados

# DCI
Ahora, entrando al trabajo en si, debemos dar un vistazo a DCI, qué 
es y cual es su valor para este trabajo.

# DCI-1
La definición nos dice que:

"DCI es un esquema de diseño que a través de elementos naturales de 
comunicación, permite reflejar el comportamiento de una aplicación
de software hacia los usuarios finales"

Como vemos en el gráfico, DCI es un esquema que permite tener los 
elementos que usamos al hablar, entidades, ambientes, etc. Como
elementos de programación, es decir, DCI permite que plasmemos
lo que el usuario quiere de forma directa en el modelo de programación.

# DCI-2
Y cómo hace esto? bueno, en DCI un sistema se define por:
- lo que es: lo que es estable y no cambia
- y lo que hace: lo que es dinámico y cambia frecuentemente

Un poco confuso? tomemos un ejemplo

# DCI-3
Aquí tenemos a una persona, llamemosla Daveyba, es un ser humano
definido por su ADN, sus huellas digitales, su tipo de sangre, y muchas
otras características que dificilmente cambian que la hacen única ante sus semejantes.

A estos elementos los denominamos DATOS.

# DCI-4
Ahora, Daveyba va al trabajo todos los días, es una Administradora en su
oficina, es una madre de familia en casa, es una conductora en
carretera. Pero todas estas funciones no son lo que Daveyba es, estas 
son cosas que Daveyba hace!!

Estos son sus ROLES

# DCI-5
Y todos estos roles tienen solamente un significado si se está en
diferentes lugares. Seria interesante ver a Daveyba con un cuchillo
en la oficina, no creen?...

Y a todos estos lugares donde un ROL tiene sentido, se los denomina
CONTEXTOS.

# DCI-6
Y la última palabra en DCI, INTERACCIONES, se definen por como Daveyba, 
en sus diferentes Roles, en sus respectivos Contextos, interactúa con
otros ROLES!!

Menos Rory, en todos los contextos su esposa manda.

Entonces DCI nos dice que estos elementos de lenguaje natural nos
permiten describir como una aplicación de software debe funcionar!!

# DCI-7
Y para esto DCI recomienda el siguiente formato de especificación de 
lo que un usuario quiere:

"Daveyba quiere realizar su declaración de impuestos como trabajador
dependiente durante el día, y como trabajador independiente cuando
trabaja en casa por las noches"

Si a nosotros, como programadores de un sistema de declaración de
impuestos nos entregan esta especificación de requerimiento, tenemos
una descripción muy completa ahi!!

A este estilo de especificación se le denomina 'Narrativa de usuario',
y es particularmente soportado por un artefacto muy conocido.

# DCI-8
El caso de uso!!
A pesar de que los casos de uso ya no son tan populares, son
herramientas excelentes para capturar narrativas de usuario, y
encaja perfectamente en lo que DCI propone, con todos sus elementos,
roles y contextos.

# DCI-9
Ok, ahora a lo práctico, cómo funciona DCI realmente dentro de un 
sistema de software, tomemos el ejemplo simple de un sistema bancario,
tenemos dos casos de uso, transferir un deposito y cancelar una tarjeta.

Los circulos representan todos los objetos que toman parte en el
proceso, y las flechas indican sus interacciones.

# DCI-10
Ahora, separamos en áreas los posibles cursos de ejecución de estos dos
casos de uso, como ven en la transferencia puede darse un solo caso,
pero en la cancelación de tarjeta hay dos posibles alternativas de
ejecución.

# DCI-11
Entonces, DCI nos dice que saquemos estas áreas de ejecución y las
convirtamos en contextos, que saquemos las operaciones de los objetos y
los convirtamos en roles, y movamos las interacciones entre objetos
hacia interacciones entre roles.

Dejando abajo los objetos como lo que son, solo datos que pueden asumir
uno o varios Roles en diferentes contextos.

# DCI-12
Si vemos el caso de Daveyba, Daveyba es una instancia de la entidad
Persona, a la cual le acoplamos los roles de
Contador, Auditor o Administrador para que cumpla una función dentro de
un contexto.

En nuestro ejemplo 'elaborar un comprobante financiero diario', qué rol
debería ser usado en este contexto?

# DCI-13
Si vamos a mas bajo nivel, se veria asi:
- Tenemos el contexto de comprobante financiero, cada caso de uso seria
  un contexto
- Obtenemos una persona y le acoplamos el rol de contador
- Procedemos a la ejecución del caso de uso

Si hacemos una analogía, se ve como el script de una película, donde
existen actores y actrices, les decimos 'tu eres el villano y tu la
heroina, estas son tus indicaciones' y decimos, 'listos, cámaras,
accion!!'

# DCI-14
Este es un modelo de programación simple en la superficie, pero para que
funcione de esta manera se necesitan artefactos y abstracciones
avanzadas que realicen el mapeo de los diferentes elementos de forma
eficiente.
Y para lograr esto se tienen estas necesidades para un modelo de
programación DCI:
- programación multi-paradigma (esencialmente orientada a objetos,
  funciona y orientada a aspectos)
- modelo computacional dinámico (que pueda ser cambiado sin detener el
  sistema de software)
- composición de objetos (ojo, no es herencia)
- contextos independientes de ejecución (o memoria transaccional)

# DCI-15
Y dentro de estas necesidades, el lenguaje de programación Scala cumple
con todas las espectativas, y tiene además el valor agregado de ser 
compatible con todo el ambiente e infrastructura de la máquina virtual
de Java. Por lo cual fué elegido para la implementación de este modelo
DCI.

# Arquetipo DCI
En base a lo explicado, y la selección de Scala como base de desarrollo,
se procedió con la elaboración del arquetipo DCI para su uso con el
prototipo.

Y porqué un arquetipo? un arquetipo es una plantilla de proyectos que
define una infraestructura de tecnología, una plataforma de desarrollo y
convenciones de programación.

# Arquetipo DCI-1
El arquetipo desarrollado tiene estas características:
- Orientado a la integración y ambientes Java (producción)
- Basado en estándares de desarrollo, porque queremos que esto se use
  para producción
- Basado en componentes de producción reales (no queremos tomar ningún
  riesto)
- Open source (para que sea compartido con el mundo, pues DCI es open
  source también)

# Arquetipo DCI-2
Esta es la arquitectura conceptual del arquetipo, donde tenemos
los elementos de DCI en integración con los elementos específicos
de la plataforma final.

# Arquetipo DCI-3
La arquitectura de componentes se visualiza aquí con diferentes
adaptadores para su integración con usuarios finales u otros sistemas,
y los elementos DCI en el Core, usando los componentes de producción de
un ambiente Java.

# Arquetipo DCI-4
El proceso de desarrollo del arquetipo en sí fué un proceso completo de 
desarrollo, donde se usó Scrum y XP como proceso de desarrollo, con 3
entregas y el uso de prácticas de integración/entrega continua y
métricas en un período de 4 meses.

# Arquetipo DCI-5
El resultado, un proyecto open-source con documentación que está
disponible en la nube, que es exactamente el mismo arquetipo que se usó
para el desarrollo del prototipo.

# Prototipo DCI
El prototipo se desarrolló en base a un cliente real, en un ambiente de
producción con requerimientos obtenidos de un sistema ya existente.

# Prototipo DCI-1
Debido a limitantes de tiempo y esfuerzo se tomó un proyecto dentro de
la categoría Pequeño para su desarrollo con el arquetipo.

# Prototipo DCI-2
Como decíamos al inicio, se tomaron indicadores en base a las métricas
del proyecto existente, las cuales son dinámicas y estáticas.

# Prototipo DCI-3
El proyecto tomado fué el CECAggregation (nombre falso debido a
contrato de no divulgación) que tiene las siguientes características.

# Prototipo DCI-4
Todos estos datos fueron recolectados en un periodo de 2 años en
ejecución.

# Prototipo DCI-5/6
El prototipo DCI de CECAggregation fué desarrollado en 3 meses con los
siguientes indicadores:
- mismo uso de memoria
- mismo tiempo de respuesta
- misma cobertura de pruebas
- 30% menos complejo
- 41% mas pequeño

# Prototipo DCI-7
En resumen, obtuvimos:
- una versión reducida en tamaño
- con menor complejidad y mejor legibilidad
- 100% compatible con el ambiente de producción

# Resultados
Entonces, teniendo el arquetipo preparado, el prototipo desarrollado
y los indicadores recolectados, podemos concluir que:
- tenemos costos de desarrollo reducidos, el trabajo de dos personas
  pudo ser realizado por una sola
- reducción de tiempos de soporte, fué mas rápido corregir errores en
  el sistema, porque ahora el sistema mismo esta expresado de otra forma
- reducción de complejidad, diferentes programadores sobre-tomaron el
  proyecto, y sigue siendo usado en la actualidad
- Intencionalidad del codigo (revela la intención del usuario final)
  incrementada

# Resultados-1
Un resultado inesperado fué el haber servido como argumento para se
cree el lenguaje de programación Trygve, que soporta como elementos
nativos todos los conceptos DCI. Lo sabemos porque servimos como
supporters como empresa para que este esfuerzo se inicie.

Otro resultado inesperado fue que la empresa vió el potencial de Scala
como tecnología, y ahora cada nuevo proyecto se está desarrollando en
base a este lenguaje. 

Y reemplazaron sus user-stories con casos de uso, y debido a eso están
obteniendo mejores resultados.
