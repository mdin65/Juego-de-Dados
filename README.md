# Juego-de-Dados
 Actividades a realizar y sus respuestas:

- Identifique TODAS las clases presentes en el dominio problema.
  
  * Dado
  * Calculadora
  * JuegoDeDados
  * Inicio
  * JuegoDeDadosTest

- Establezca los atributos y métodos para c/CLASE.
  
  * Clase Dado
      - Atributo:
        - valorCaraSuperior: int
      - Métodos:
        - lanzar(): void → genera un número aleatorio entre 1 y 6
        - getValor(): int → retorna el valor de la cara superior
  * Clase Calculadora
      - Atributos:
         - No posee
      - Métodos:
        - sumar(a: int, b: int): int → retorna la suma de dos enteros
  * Clase JuegoDeDados
      - Atributos:
        - dado1: Dado
        - dado2: Dado
        - calculadora: Calculadora
      - Métodos:
        - jugar(): String → lanza ambos dados, suma los valores y retorna si ganaste o perdiste
  * Inicio:
      - Atributos:
        - No posee
      - Método:
        - main(String[] args): void → ejecuta el juego
  * JuegoDeDadosTest:
      - Atributos:
        - No posee
      - Método:
        - testValoresDadosEstanEnRango(): void → Verifica que el valor generado por un dado esté siempre entre 1 y 6.
        - testSumaCorrectaDeValores(): void → Comprueba que la suma realizada por la calculadora sea correcta.
        - testResultadoDelJuego(): void → Evalúa que el juego retorne el resultado correcto (ganar o perder) para un caso controlado.
    
  
- Identifique y defina las relaciones entre clases presentes en este caso.
  
  * En el diseño del juego de dados, se identifican relaciones clave entre las clases. La clase JuegoDeDados tiene una relación de asociación con la clase Dado, ya que utiliza dos instancias de esta para simular los lanzamientos, siendo fundamentales para el funcionamiento del juego. Además, JuegoDeDados se asocia con la clase Calculadora, la cual se encarga de realizar la suma de los valores obtenidos por los dados, manteniendo así la responsabilidad de cálculo separada de los objetos que generan números aleatorios. Por otro lado, se incorpora una clase Inicio, la cual mantiene una relación de dependencia con JuegoDeDados, ya que la instancia únicamente para ejecutar el juego sin modificar su estructura interna. Finalmente, la clase TestJuegoDeDados también mantiene una relación de dependencia con JuegoDeDados, ya que se utiliza exclusivamente para realizar pruebas unitarias, validando el comportamiento esperado del sistema sin formar parte activa del flujo principal del programa.
       
- Modele el caso usando diagrama de casos UML y VP.
  * se encuentra en la imagen adjunta
    
- Codifique su solución, considerando el número mínimo de clases y test necesarios para su implementación y pruebas mínimas de funcionamiento.
  * se encuentra adjunto.
