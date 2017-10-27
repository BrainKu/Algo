package demo


class Chap1 : Executable {
    override fun allFunctions(): List<() -> Unit>  = listOf(this::binarySearchDemo)

    fun binarySearchDemo() {
        SimpleSortedIntList.forEach {
            println("index of $it is ${binarySearch(SimpleSortedIntList, it)}")
        }
    }

    private fun binarySearch(list: List<Int>, searchValue: Int): Int? {
        var low = 0
        var high = list.size - 1
        var middle: Int
        while (low <= high) {
            middle = (low + high) / 2
            when {
                searchValue == list[middle] -> return middle
                searchValue > list[middle] -> low = middle + 1
                searchValue < list[middle] -> high = middle - 1
            }
        }
        return null
    }
}
