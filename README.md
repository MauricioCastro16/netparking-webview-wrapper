# Seminario WebView Wrapper

Esta aplicación Android es un wrapper WebView para la aplicación web de estacionamientos desplegada en Render.

## Características

- **WebView optimizado**: Configurado para cargar la aplicación web de estacionamientos
- **Barras negras**: 5% arriba, 5% abajo, 90% contenido WebView
- **Compatibilidad API 24**: Compatible con Android 7.0 Nougat y versiones superiores
- **JavaScript habilitado**: Soporte completo para la funcionalidad web
- **Navegación mejorada**: Botón atrás funciona dentro del WebView

## URL de destino

La aplicación carga automáticamente: `https://seminario-estacionamientos-3i3i.onrender.com/Account/Login`

## Configuración técnica

### Permisos requeridos
- `INTERNET`: Para acceso a la web
- `ACCESS_NETWORK_STATE`: Para verificar conectividad
- `ACCESS_WIFI_STATE`: Para optimización de red

### Configuración WebView
- JavaScript habilitado
- DOM Storage habilitado
- Geolocalización habilitada
- Zoom habilitado
- Cache optimizado
- User Agent personalizado

### Compatibilidad
- **minSdk**: 24 (Android 7.0 Nougat)
- **targetSdk**: 36 (Android 14)
- **compileSdk**: 36

## Compilación

1. Abrir el proyecto en Android Studio
2. Sincronizar con Gradle Files
3. Compilar y ejecutar en dispositivo o emulador

## Estructura del proyecto

```
app/
├── src/main/
│   ├── java/com/example/seminario_webviewwrapper/
│   │   └── MainActivity.kt          # Actividad principal con WebView
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml     # Layout con barras negras y WebView
│   │   ├── xml/
│   │   │   └── network_security_config.xml  # Configuración de seguridad de red
│   │   └── values/
│   │       └── themes.xml            # Tema de la aplicación
│   └── AndroidManifest.xml          # Permisos y configuración
└── build.gradle.kts                 # Dependencias y configuración
```

## Dependencias principales

- `androidx.appcompat:appcompat:1.7.0`
- `androidx.webkit:webkit:1.12.1`
- `androidx.constraintlayout:constraintlayout:2.1.4`
- `androidx.core:core-ktx:1.17.0`

## Notas importantes

- La aplicación está configurada para orientación portrait
- El WebView maneja automáticamente la navegación interna
- Se incluye configuración de seguridad de red para HTTPS/HTTP mixto
- Compatible con todas las funcionalidades de la aplicación web original
