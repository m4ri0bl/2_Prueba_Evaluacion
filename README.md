# Hundir la Flota 🚢⚓💥

¡Bienvenido a **Hundir la Flota**! Este es mi proyecto de clase, una implementación moderna del clásico juego de hundir la flota en Java. Con un toque innovador, el juego incorpora persistencia de datos, un modelo entidad-relación generado automáticamente y funcionalidades avanzadas como manejo de grafos y tablas hash. ¡Prepárate para zarpar en una aventura épica en alta mar! 🌊🏴‍☠️

## Características ✨

- **Multi-Tipo de Barcos:**  
  Implementa acorazados, fragatas y canoas, cada uno con su propia lógica. Los acorazados requieren que se impacten todas sus posiciones aisladas para hundirse, agregando un desafío adicional. 🚢💣

- **Persistencia Total:**  
  Utiliza JPA con Hibernate y una base de datos embebida H2. El esquema SQL se genera de forma automática, sin necesidad de escribir SQL manualmente. ¡Todo se configura en local y funciona a la perfección! 📊🗄️

- **Modelo Entidad-Relación:**  
  Los jugadores y sus barcos se mapean a un modelo entidad-relación robusto, permitiendo el registro completo de cada partida. 📝🔗

- **Módulo de Puertos:**  
  Incluye una implementación de grafos para gestionar puertos y rutas. Dispone de funciones para realizar recorridos en profundidad, calcular el camino más corto y eliminar el puerto con más conexiones. 🛳️🗺️

- **Interfaz Interactiva:**  
  Configura jugadores y barcos mediante la consola, simula ataques y muestra resultados en tiempo real para una experiencia dinámica. 🎮💥

## Tecnologías Utilizadas 💻

- **Java 8** ☕️
- **Maven** ⚙️
- **JPA / Hibernate** 🔥
- **Base de datos embebida H2** 🗃️
