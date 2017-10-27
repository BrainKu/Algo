package demo

interface Executable {
    fun allFunctions(): List<() -> Unit>
}