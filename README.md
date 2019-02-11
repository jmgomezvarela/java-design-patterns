# Patrones de Diseño en Java. Explicación y Ejemplos.

## Introducción.

Los patrones de diseño son unas técnicas para resolver problemas comunes en el desarrollo de software y otros ámbitos referentes al diseño de interacción o interfaces.

Un patrón de diseño resulta ser una solución a un problema de diseño. Para que una solución sea considerada un patrón debe poseer ciertas características. Una de ellas es que debe haber comprobado su efectividad resolviendo problemas similares en ocasiones anteriores. Otra es que debe ser reutilizable, lo que significa que es aplicable a diferentes problemas de diseño en distintas circunstancias

En otra definición, “Los patrones de diseño son el esqueleto de las soluciones a problemas comunes en el desarrollo de software.”

La siguiente es una lista de patrones de diseño con descripcipnes breves y con aplicaciones en ejemplos muy sencillos de entender.

## <a name="lista-de-patrones">Lista de Patrones de Diseño.</a>

### Patrones de Creación (Creational Patterns)

Relativos al proceso de creación de un objeto.

* [Abstract Factory](#abstract-factory)
* [Factory Method](#factory)
* [Builder](#builder)
* [Singleton](#singleton)
* [Prototype](#prototype)

## <a name="abstract-factory">Abstract Factory</a> [&#8593;](#lista-de-patrones)

**Propósito:** Proveer una interfaz para la creación de familias o objetos dependientes relacionados, sin especificar sus clases concretas.

**Descripción:**

Es una jerarquía que encapsula muchas *familias* posibles y la creación de un conjunto de *productos*. El objeto "fábrica" tiene la responsabilidad de proporcionar servicios de creación para toda una familia de productos. Los "clientes" nunca crean directamente los objetos de la familia, piden la fábrica que los cree por ellos.

**Diagrama:**

![alt text](https://upload.wikimedia.org/wikipedia/commons/b/b7/Diagrama_Abstract_Factory.png)

**Aplicación:** Usamos el patrón Abstract Factory...
* Cuando tenemos una o múltiples familias de productos.
* Cuando tenemos muchos objetos que pueden ser cambiados o agregados durante el tiempo de ejecución.
* Cuando queremos obtener un objeto compuesto de otros objetos, los cuales desconocemos a que clase pertenecen.
* Para encapsular la creación de muchos objetos.

**Ejemplos:**

* [Armado de equipo de futbol](https://github.com/jmgomezvarela/java-design-patterns/tree/master/abtractFactorySoccer/src)

## <a name="factory">Factory Method</a> [&#8593;](#lista-de-patrones)

**Propósito:** Definir una interface para crear un objeto, dejando a las subclases decidir de que tipo de clase se realizará la instancia. Reducir el uso del operador *new*.

Crear objetos en una clase usando un método factory es más flexible que crear un objeto directamente. Es posible conectar la generación de familias de clases que tienen comportamientos en común. Elimina la necesidad de estar haciendo binding (casting) hacia clases específicas dentro del código, ya que este solo se entiende con las clases abstractas.

**Diagrama:**

![alt text](https://upload.wikimedia.org/wikipedia/commons/7/73/Factory_Method.png)

**Aplicación:** Usamos el patrón Factory...
* Cuando una clase no puede anticipar que clase de objetos debe crear, esto se sabe durante el tiempo de ejecución.
* Cuando un método regresa una de muchas posibles clases que comparten carecterísticas comunes a través de una superclase.
* Para encapsular la creación de objetos.

**Ejemplos:**

* [Carros](https://github.com/LuisBurgos/design-patterns/tree/master/src/factory/examples/cars)




