package demo

class HelloWorld {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val world = HelloWorld()
            world.call()
        }
    }

    val executables: MutableList<Executable> = mutableListOf(
            Chap1(),
            Chap2()
    )

    private fun call() {
        executables.asSequence().forEach {
            it.allFunctions().asSequence().forEach {
                it.invoke()
            }
        }
    }
}