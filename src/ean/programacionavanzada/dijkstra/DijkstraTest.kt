package ean.programacionavanzada.dijkstra

import ean.collections.Graph
import ean.collections.IGraph
import org.testng.annotations.Test

internal class DijkstraTest {
    /**
     * Primera prueba del algoritmo de Dijkstra
     * El grafo se puede ver en la siguiente dirección: https://goo.gl/RIirDl
     */
    @Test
    fun dijkstraTest1() {
        // Vamos a probar con el grafo en https://goo.gl/RIirDl
        val g: IGraph<Int, String, Int> = Graph()

        // Agregue los vértices al grafo según ve en la imagen anterior
        g.addVertex(0, "s")
        TODO("Crear los otros vertices")

        // Ahora agregue los arcos entre los vértices, tal como está en la imagen del grafo
        g.addEdge(0, 1, 10)     // arco de s -> t de peso 10
        TODO("Crear los otros arcos")

        // Creamos los vectores donde almacenaremos el resultado
        val costos = IntArray(g.size)
        val anteriores = IntArray(g.size)

        // Invocamos el algoritmo de Dijkstra
        val verticeInicial = 0      // El vértice con una "s" será el origen
        Dijkstra.dijkstra(g, verticeInicial, costos, anteriores)

        // Imprimimos el resultado del algoritmo
        System.out.printf("Vertice\t\tCostos\t\tAnterior")
        for (i in g.vertices) {
            System.out.printf("%d:\t\t%d\t\t%d\n", i, costos[i], anteriores[i])
        }
    }

    /**
     * Segunda prueba del algoritmo de Dijkstra
     * El grafo se puede ver en la siguiente dirección: https://goo.gl/3QUePB
     */
    @Test
    fun dijkstraTest2() {
        // Creamos el grafo vacío
        val g: IGraph<Int, String, Int> = Graph()

        // Ahora configuramos el grafo, tal como está en la imagen anterior
        g.addVertex(0, "A")
        TODO("Agregar los otros vértices del grafo")

        // Ahora agregamos los arcos que aparecen el el arco. Tenga en cuenta que
        // es un grafo no dirigido
        g.addArc(0, 1, 3)   // Arco de A <-> B de peso 3
        TODO("Agregar todos los otros arcos del grafo")

        // Ahora creamos los vectores de resultado del algoritmo
        val costos = IntArray(g.size)
        val anteriores = IntArray(g.size)

        // Invocamos el algoritmo de Dijkstra
        val verticeInicial = 0      // El vértice con una "A" será el origen
        Dijkstra.dijkstra(g, verticeInicial, costos, anteriores)

        // Imprimimos el resultado del algoritmo
        System.out.printf("Vertice\t\tCostos\t\tAnterior")
        for (i in g.vertices) {
            System.out.printf("%d:\t\t%d\t\t%d\n", i, costos[i], anteriores[i])
        }

    }

}