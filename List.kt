fun main(){
    val list = LinkedList<Int>()
    for (x in 10 downTo 1) {
        list.push(x)
    }
    println(list)
    //list.middlePush(4, 20)
    println(list)

    val Dlist = DLlist<Int>()
    for (x in 5 downTo 1) {
        Dlist.Dpush(x)
    }
    println(Dlist)
    Dlist.enqueue(7)
    println(Dlist)
    Dlist.DmiddlePush(90, 40)
    println(Dlist)
    Dlist.DmiddlePop(90)
    println(Dlist)
}