[![Consultar a DeepWiki](https://deepwiki.com/badge.svg)](https://deepwiki.com/MauricioCastro16/android-estacionamientos-wrapper)

# NetParking WebView Wrapper

![Platform](https://img.shields.io/badge/platform-Android-green.svg)
![Language](https://img.shields.io/badge/language-Kotlin-orange.svg)

## Descripción Corta

Aplicación Android nativa que envuelve una aplicación web de gestión de estacionamientos mediante WebView. Proporciona una experiencia móvil optimizada con navegación integrada y controles nativos.
La aplicación carga automáticamente: `https://seminario-estacionamientos-3i3i.onrender.com/Account/Login`

## Características Principales

- WebView optimizado con JavaScript y DOM Storage habilitados
- Barras negras superiores e inferiores para integración visual (5% cada una)
- Navegación hacia atrás integrada dentro del historial WebView
- Compatibilidad con Android 7.0 (API 24) y superiores
- Configuración de seguridad de red para HTTP/HTTPS mixto
- Orientación vertical forzada para mejor experiencia móvil

## Stack Tecnológico

| Categoría | Tecnologías |
|-----------|-------------|
| Frontend | Android SDK, WebView, ViewBinding, ConstraintLayout |
| Backend | Aplicación web remota (Render) |
| Base de Datos | No aplica (consumo de API remota) |
| Herramientas | Gradle, Android Studio, Kotlin, AndroidX |

## Arquitectura / Flujo

La aplicación sigue una arquitectura de una sola actividad donde MainActivity configura y aloja el WebView principal. El WebView carga la aplicación web remota y maneja toda la navegación internamente. Los eventos del ciclo de vida de la actividad gestionan la inicialización, navegación hacia atrás y limpieza de recursos del WebView.

## Instalación y Uso

```bash
# Clonar el repositorio
git clone https://github.com/MauricioCastro16/android-estacionamientos-wrapper.git

# Navegar al directorio del proyecto
cd android-estacionamientos-wrapper

# Abrir en Android Studio
# File -> Open -> seleccionar el directorio del proyecto

# Sincronizar con Gradle Files
# Tools -> Gradle -> Sync Project with Gradle Files

# Ejecutar en dispositivo o emulador
# Run -> Run 'app'
```
