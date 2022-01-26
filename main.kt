fun main() {
    println("Сортировка выбором наименьшего")
    val list1 = arrayListOf(3,51,34,77,4,6,9,124)
    if (list1.size == 1) {
        println(list1)
    } else {
        for (i in 0 until list1.size - 1) {
            var min = i
            for (j in i + 1 until list1.size - 1) {
                if (list1[j] < list1[min]) min = j
            }
            val nothing = list1[i]
            list1[i] = list1[min]
            list1[min] = nothing
        }
        println(list1)
    }
    println("Сортировка вставками")
    val list2 = arrayListOf(3,51,34,77,4,6,9,124)
    if (list2.size == 1) {
        println(list2)
    } else {
        for (i in 1 until list2.size - 1) {
            for (j in i downTo 1) {
                if (list2[j] < list2[j-1]){
                    val nothing = list2[j-1]
                    list2[j-1] = list2[j]
                    list2[j] = nothing
                }
            }
        }
        println(list2)
    }
}