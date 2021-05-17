//fun main(){
//    val professor = Professor(nome = "Felipe Araújo", registroDocente = "301290")
//
//    val materiaKotlin = Materia(nome = "Aula de kotlin")
//    val aulaKotlin = Aula(materiaKotlin, horaInicio = "19:30", horaTermino = "21:45")
//
//    val materiaAndroid = Materia(nome = "Aula de Android")
//    val aulaAndroid = Aula(materiaAndroid, horaInicio = "19:30", horaTermino = "21:45")
//
//    val luci = Aluno(registroAcademico = "1234", nome = "Luci", sobrenome = "Pereira")
//    val gabi = Aluno(registroAcademico = "5678", nome = "Gabi", sobrenome = "Nascimento")
//
//    val curso = Curso(
//            nome = "Curso de Android 10/10",
//            listOf(aulaAndroid, aulaKotlin),
//            listOf(luci, gabi),
//            professor
//    )
//
//    val turmaTop = Turma(nome = "Turma 1 de Android", curso)
//
//    println(turmaTop.curso.listaAlunos)
//    println(turmaTop.curso.listaAulas)
//
//}
//
//class Materia(nome: String)
//
//class Aula(materia: Materia, horaInicio: String, horaTermino: String)
//
//open class Pessoa(nome: String)
//
//class Professor(nome: String, registroDocente: String): Pessoa(nome)
//
//class Aluno(
//    registroAcademico: String,
//    nome: String,
//    sobrenome: String
//): Pessoa(nome) {
//
//    fun assistirAula() {
//
//    }
//
//    fun fazerLicao() {
//
//    }
//}
//
//class Curso(
//        nome: String,
//        val listaAulas: List<Aula>,
//        val listaAlunos: List<Aluno>,
//        professor: Professor
//)
//
//
//
//class Turma(nome: String, val curso: Curso)