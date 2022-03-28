fun main() {

    val student = Student("Halil", "Ozel", 25, "Istanbul")
    println(student.component1())
    println(student.component2())
    println(student.component3())
    println(student.component4())

    val studentSecond=student.copy(surname = "Ibrahim",city = "Sivas")
    println("Student First: ${student.name} - ${student.surname} - ${student.age} - ${student.city}")
    println("Student Second: ${studentSecond.name} - ${studentSecond.surname} - ${studentSecond.age} - ${studentSecond.city}")

    println(student.toString())

    println("Student First hashCode: "+student.hashCode())
    println("Student Second hashCode: "+studentSecond.hashCode())

    println(student.equals(studentSecond))
}

data class Student(
        val name: String,
        val surname: String,
        val age: Int,
        val city: String
)