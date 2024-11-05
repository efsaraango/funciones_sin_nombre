// Funcion con nombre que devuelve la suma de los numeros naturales
def f1(n: Int)=(1 to n).sum

// Funcion sin nombre

val f1=(n: Int)=> (1 to n).sum

// Funcion con nombre
def f2(n: Int): Int= (1 to n).product

// Funcion sin nombre
val f2=(n: Int) => (1 to n).product

// Funcion con nombre

def formula(m: Double) =
  val C: Int = 299792458
  m * math.pow(C, 2)

// Funcion sin nombre

val funcionAnonima = (m: Double) => m * math.pow(299792458, 2)