# Taller Vespertino de Java

## Entregable 1 - Sistema de Notificaciones Empresariales

Una empresa requiere desarrollar un Sistema de Notificaciones Empresariales que permita representar y gestionar distintos tipos de notificaciones enviadas a sus clientes o usuarios. 

El sistema debe estar diseñado siguiendo las mejores prácticas de programación orientada a objetos y aprovechando las características modernas incorporadas en Java 21, garantizando un código seguro, inmutable, mantenible y fácilmente extensible.

El sistema deberá soportar tres tipos de notificaciones:
- Correo electrónico (Email)
- Mensaje SMS
- Notificación Push
Cada tipo de notificación posee información específica y reglas de validación propias, las cuales deberán verificarse al momento de crear cada objeto para asegurar la integridad de los datos.


## Características
 
- **Records**: cada tipo de notificación se implementa como un `record`, obteniendo automáticamente constructor, `equals()`, `hashCode()` y `toString()`

- **Constructores compactos**: las validaciones se ejecutan antes de crear el objeto en el constructor compacto, lanzando `IllegalArgumentException` si los datos no son válidos

- **Sealed Interface**: `Notification` restringe las implementaciones únicamente a `EmailNotification`, `SmsNotification` y `PushNotification`

- **Arreglo**: las notificaciones se almacenan en `Notification[]`, no se hizo uso de colecciones (`List`, `Set`, `Map`)

- **Switch con Pattern Matching**: el procesamiento del arreglo se realiza sin `if-else` ni `instanceof` 


## Estructura del Proyecto
 
```
src/
├── clases/
│   ├── Notification.java        # Interfaz sealed base
│   ├── EmailNotification.java   # Record - Notificación por correo
│   ├── SmsNotification.java     # Record - Notificación SMS
│   └── PushNotification.java    # Record - Notificación Push
└── tests/
    └── Test.java                 # Clase principal de pruebas
```

##  Salida Esperada
 
```
========= RESUMEN =========
Correos enviados: 2
SMS enviados: 4
Push enviados: 1
Total: 7
```

## Requisitos
 
- [x] Uso de `records` para todas las notificaciones
- [x] Inmutabilidad en todos los objetos
- [x] Validaciones mediante constructores compactos
- [x] `Sealed interface` como tipo base
- [x] Almacenamiento en array (`Notification[]`)
- [x] Sin clases tradicionales para las notificaciones
- [x] Sin colecciones (`List`, `Set`, `Map`), solo el array mencionado
- [x] Sin `if-else` para identificar tipos, uso de `switch` con pattern matching


