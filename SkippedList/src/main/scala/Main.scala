
object Main {
  def main(args: Array[String]): Unit = {
    val skipList = new SkipList[Int](4)


//    skipList.addNode(1)

    skipList.addNode(3)
    skipList.addNode(2)
    skipList.addNode(1)
    skipList.addNode(5)
    skipList.addNode(565)
    skipList.addNode(34)
    skipList.addNode(545)
    println("current size is: " + skipList.getSize())
    skipList.printList()
//    println(skipList.search(3))
//    println(skipList.search(4))
//    println(skipList.search(565))
//    println(skipList.search(34))
    println('\n')
    skipList.delete(1)
    println("current size is: " + skipList.getSize())


    skipList.printList()
    println('\n')
    skipList.delete(5)
    println("current size is: " + skipList.getSize())

    skipList.printList()
    println("current size is: " + skipList.getSize())
  }

}
