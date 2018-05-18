/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Proyecto Implementación del algoritmo de Dijkstra
 * Fecha: 16 de mayo de 2018
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.programacionavanzada.dijkstra

import ean.collections.IGraph

/**
 * Objeto donde desarrollaremos el algoritmo de Dijkstra
 *
 * Fecha de entrega: Lunes 21 de mayo
 */
object Dijkstra {
    //------------------------------------------------------------
    // Constantes
    //------------------------------------------------------------
    const val INFINITO: Int = Int.MAX_VALUE

    //------------------------------------------------------------
    // Métodos a desarrollar
    //------------------------------------------------------------

    /**
     * Encuentra todos los caminos de costos mínimos que parten del vértice v
     * a todos los otros vértices del grafo. Llena los arreglos costos y anteriores
     * tal como hemos visto en clase.
     */
    fun dijkstra(grafo: IGraph<Int, String, Int>,
                 v: Int,
                 costos: IntArray,
                 anteriores: IntArray) {

        // 1. Desmarcamos todos los vértices del grafo
        grafo.clearMarkVertices()

        // 2. Inicializamos el vector de costos y los anteriores
        for (w in grafo.vertices) {
            /* TODO:
             * La inicialización consiste en:
             * si existe un arco en el grafo entre el vertice v y w ent
             *    guarde en la posicion w del vector de costos el peso del arco
             *    y en el vector anterior (posicion w) el vertice inicial v
             * sino
             *   guarde infinito en la posicion w del vector dist
             */
            if (grafo.existsEdge(v,w)){
                grafo.
            }
        }

        // 3. Inicializamos los valores del vector de costos y anterior
        //    para el vertice inicial v
        costos[v] = 0
        anteriores[v] = -1

        // 4. Marcamos el vértice inicial en el grafo
        grafo.markVertex(v)

        // 5. Recorremos el grafo, llenando el vector de costos mínimos
        while (!estenMarcadosTodosLosVertices(grafo)) {

            // 5.1 Encontramos el vértice no marcado de costo mínimo
            val vert: Int = encontrarVerticeNoMarcadoDeCostoMinimo(grafo, costos)

            // 5.2 Marcamos el vértice seleccionado w
            grafo.markVertex(vert)

            // Ahora actualizamos los costos de los vecinos del vértice seleccionado vert
            for (w in grafo.neighbors(vert)) {
                /*  TODO
                 *  Guardar en la variable peso
                 *  la información del arco que une el vertice vert y w
                 */
                val peso: Int

                /* TODO
                 * Actualizar el vector de costos
                 */
                if (costos[w] > costos[w] + peso) {
                    costos[w] = costos[w] + peso
                    anteriores[w] = vert
                }
            }

        }
    }


    /**
     * Obtiene el vértice del grafo que no está marcado y que tiene el costo menor
     * @param grafo el grafo donde están los vértice
     * @param costos los costos actuales o distancias
     * @return el vértice no marcado
     */
    private fun encontrarVerticeNoMarcadoDeCostoMinimo(grafo: IGraph<Int, String, Int>,
                                                       costos: IntArray): Int {
        var vertice = 0
        return vertice
    }

    /**
     * Permite saber si todos los vértices del grafo están marcados o no
     * @param grafo el grafo a revisar
     * @return true si todos los vértices están marcado y false si no es así
     */
    private fun estenMarcadosTodosLosVertices(grafo: IGraph<Int, String, Int>): Boolean {
        return false
    }
}

