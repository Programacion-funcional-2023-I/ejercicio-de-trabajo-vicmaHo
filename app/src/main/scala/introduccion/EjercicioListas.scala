package introduccion

import javax.naming.OperationNotSupportedException

class EjercicioListas {
  /*
  * Punto 2 repetir lista
  * @param lista Lista a repetir
  * @param n Número de veces a repetir la lista
  * @return Lista repetida n veces
  * @example repetirLista(List(1, 2, 3), 2) = List(List(1,1),List(2,2),List(3,3))
  * @throws IllegalArgumentException si n es negativo
  */
  def repetirListas(lista: List[Int], n: Int): List[List[Int]] = {
    // forma simplificada de crear una lista y rellenarla n veces con un numero i List.fill(n)(i)
    //listaRepetida = listaRepetida :+ List.fill(n)(i)

    if(n < 0) throw new IllegalArgumentException

    var listaRepetida: List[List[Int]] = List()
    for (i <- lista){
      var listTemp: List[Int] = List()
      for (j <- 1 to n){
        listTemp = listTemp :+ i
      }
      listaRepetida = listaRepetida :+ listTemp
    }
    return listaRepetida
    //Complete el código
    throw new UnsupportedOperationException("No implementado aún")
  }
  /*
  * Punto 3: Filtrar listas
  * @param criterioIn Criterio de filtrado que puede ser "mayor", "menor", "mayoroigual", "igual", "diferente" o "menoroigual"
  * @param n Número a comparar
  * @param lista Lista a filtrar
  * @return Lista filtrada de acuerdo al criterio y n
  * @throws IllegalArgumentException si el criterio no es uno de los valores válidos
  */

  def filtrarListas(criterioIn: String, n: Int, lista: List[Int]): List[Int] = {
    val criterio: String = criterioIn.toLowerCase()
    val listaCriterios: List[String] = List("mayor", "menor", "mayoroigual", "igual", "diferente", "menoroigual")

    // si el criterio no esta en la lista lanzo una excepcion
    if (!listaCriterios.contains(criterio)) throw new IllegalArgumentException

    var listaFiltrada: List[Int] = List()

    // suponiendo que es mayor
    if (criterio == "mayor") {
      for (i <- lista) {
        if (i > n) {
          listaFiltrada = listaFiltrada :+ i
        }
      }
    }else if(criterio == "menor"){
      for (i <- lista){
        if (i < n){
          listaFiltrada = listaFiltrada :+ i
        }
      }
    }else if(criterio == "mayoroigual"){
      for (i <- lista){
        if (i >= n){
          listaFiltrada = listaFiltrada :+ i
        }
      }
    }else if(criterio == "igual"){
      for (i <- lista){
        if (i == n){
          listaFiltrada = listaFiltrada :+ i
        }
      }
    }else if (criterio == "diferente"){
      for (i <- lista){
        if (i != n){
          listaFiltrada = listaFiltrada :+ i
        }
      }
    } else if (criterio == "menoroigual"){
      for (i <- lista){
        if (i <= n){
          listaFiltrada = listaFiltrada :+ i
        }
      }
    }
    return listaFiltrada
  }

}