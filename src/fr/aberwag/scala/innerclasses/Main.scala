package fr.aberwag.scala.innerclasses

object Main {
  def main(args: Array[String]) {

    /*
     * In our program, graphs are represented by a list of nodes.
     * Nodes are objects of inner class Node.
     * Each node has a list of neighbours, which get stored in the list connectedNodes.
     * Now we can set up a graph with some nodes and connect the nodes incrementally:
     */
    val g = new Graph
    val n1 = g.newNode
    val n2 = g.newNode
    val n3 = g.newNode
    n1.connectTo(n2)
    n3.connectTo(n1)
    println("###############################################################################################################")

    /*
     * We now enrich the above example with types to state explicitly what the type of the various defined entities is:
     */
    val graph: Graph = new Graph
    val node1: graph.Node = graph.newNode
    val node2: graph.Node = graph.newNode
    val node3: graph.Node = graph.newNode
    node1.connectTo(node2)
    node3.connectTo(node1)

    println("###############################################################################################################")

    /*
     * This code clearly shows that a node type is prefixed with its outer instance (which is object g in our example).
     * If we now have two graphs, the type system of Scala does not allow us to mix nodes defined within one graph with the nodes of another graph,
     * since the nodes of the other graph have a different type. Here is an illegal program
     */
    val gr: Graph = new Graph
    val nd1: gr.Node = gr.newNode
    val nd2: gr.Node = gr.newNode
    nd1.connectTo(nd2) // legal
    val h: Graph = new Graph
    val nd3: h.Node = h.newNode
    //nd1.connectedTo(n3) // illegal!
    println("###############################################################################################################")

  }
}