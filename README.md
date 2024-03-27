Principio de Responsabilidad unica: Cada clase de mi código he intentado que tenga una única responsabilidad, y hace lo que debe hacer.
  -Vehículo: Los mandos y datos de un vehículo
  -Store: Un concesionario.
  -Taller: El taller
  -Factura: Una factura.

Abierto/Cerrado:  Las clases Vehiculo, Factura y Taller son entidades que pueden ser extendidas sin necesidad de modificarlas. 
  -Por ejemplo, Vehiculo es una clase abstracta que puede ser extendida por otras clases como Deportivo, MixtoAdaptable y Turismo.

Liskov: Las clases Deportivo, MixtoAdaptable y Turismo pueden ser reemplazadas por su superclase Vehiculo sin afectar el comportamiento de las clases que las utilizan.

Segregación de Interfaces:  Vehiculo implementa la interfaz ISimulacionVehiculo, lo que significa que Vehiculo no está obligado a implementar métodos que no necesita.
                            Además, Taller implementa la interfaz ITaller, lo que significa que Taller no está obligado a implementar métodos que no necesita

Principio de Inversión de Dependencias: Este no se si lo he implementado correctamente.

También, comentar que no me ha dado tiempo a acabar el ejercicio, me ha faltado todo el tema de las piezas y tal.
