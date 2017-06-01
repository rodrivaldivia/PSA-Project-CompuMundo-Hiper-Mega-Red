# language: es
Característica: Notificaciones al jefe de Admin y Finanzas

  Escenario: Se completan 3 milestones
    Dado ninguna notificación nueva
    Cuando se completan 3 milestones
    Entonces tengo 3 notificación

  Escenario: Se completa 1 milestone de 500$
    Dado ninguna notificación nueva
    Cuando se completa un milestone de 500$ y del cliente "PSA"
    Entonces tengo una notificación cuyo monto es 500$

   Escenario: Se completa 1 milestone del cliente PSA
    Dado ninguna notificación nueva
    Cuando se completa un milestone de 500$ y del cliente "PSA"
    Entonces tengo una notificación cuyo cliente es "PSA"