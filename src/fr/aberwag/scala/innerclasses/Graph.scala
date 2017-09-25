package fr.aberwag.scala.innerclasses

class Graph {
  class Node {
    var connectedNodes: List[Node] = Nil
    def connectTo(node: Node) {
      if (connectedNodes.find(node.equals).isEmpty) {
        connectedNodes = node :: connectedNodes
      }
    }
  }

  var nodes: List[Node] = Nil
  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }
}

/*
 * Please note that in Java the last line in the previous example program would have been correct.
 * For nodes of both graphs, Java would assign the same type Graph.Node; i.e. Node is prefixed with class Graph.
 * In Scala such a type can be expressed as well, it is written Graph#Node.
 *
 * If we want to be able to connect nodes of different graphs,
 * we have to change the definition of our initial graph implementation in the following way:
 */

//    class Graph {
//      class Node {
//        var connectedNodes: List[Graph#Node] = Nil
//        def connectTo(node: Graph#Node) {
//          if (connectedNodes.find(node.equals).isEmpty) {
//            connectedNodes = node :: connectedNodes
//          }
//        }
//      }
//      var nodes: List[Node] = Nil
//      def newNode: Node = {
//        val res = new Node
//        nodes = res :: nodes
//        res
//      }
//    }
