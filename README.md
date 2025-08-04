# 🚀 **Práctica 08 - Control de Audio con Botones**

## 📝 Descripción

Esta práctica se centra en manejar la interacción de los botones para reproducir efectos de sonido en una aplicación de Android. Al presionar cada uno de los botones, se reproduce un sonido específico, y durante la reproducción, los botones se desactivan para evitar que se presionen mientras el audio se está ejecutando.

La aplicación contiene varios botones que representan diferentes sonidos: **Auto Cruise**, **Normal Cruise**, **Pursuit**, **Air**, y **Oil**. Cada uno de estos botones reproduce un sonido correspondiente al ser presionado, y se desactivan durante la duración del audio.

## ⚙️ Tecnologías usadas

- Android SDK 34  
- Java (MainActivity)  
- MediaPlayer  
- ConstraintLayout  
- Gradle Kotlin DSL (`build.gradle.kts`)

## 📐 Diseño UI

El layout principal (`activity_main.xml`) utiliza **ConstraintLayout** para organizar los botones de forma flexible. Cada botón tiene un color de fondo distintivo y un texto que indica el sonido correspondiente:

- **Auto Cruise**: Sonido para el modo de crucero automático.
- **Normal Cruise**: Sonido para el modo de crucero normal.
- **Pursuit**: Efecto de sonido para la persecución.
- **Air**: Sonido relacionado con el "aire".
- **Oil**: Efecto de sonido relacionado con el "aceite".

Se utiliza un conjunto de `Guideline` para organizar los botones de forma eficiente y garantizar que la UI se vea bien en diferentes tamaños de pantalla.

## 🚀 Ejecución

1. Abrir el proyecto en **Android Studio** con el SDK 34 configurado.
2. Ejecutar en un **dispositivo/emulador con Android 11 (API 30)** o superior.
3. Presionar cualquiera de los botones para reproducir el sonido correspondiente.
4. Durante la reproducción del sonido, los botones se desactivan automáticamente hasta que el audio termine.

## 📌 Versionado

Este proyecto utiliza **Git** y **GitHub** para el control de versiones, lo que permite mantener un registro detallado de los cambios realizados durante el desarrollo.

## 📄 Licencia

Este proyecto está bajo la [MIT License](./LICENSE).

## 🎁 Expresiones de Gratitud  

Podéis invitarme a una cerveza 🍺 o un café ☕.  
Gracias por la lectura 🤓.  
