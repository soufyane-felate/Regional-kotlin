
package com.example.ex_kotlin2023

class Ex3 {

}
fun main(){
    val questions= arrayOf(
        "Quel est le capital de du Maroc?",
        "quel est le pays le plus peuple du monde?",
        "combien y-t-il de continent sur terre?"
    )
    val answer= arrayOf(
        arrayOf("Fes","tanger","Rabat"),
        arrayOf("chine","indie","usa"),
        arrayOf(7,5,6)
    )
    val vraireponse = arrayOf(2,0,0)
    val ReponseUtilisateur= arrayOf(2,0,1)

    var score=0

    for (i in questions.indices){
        val question=questions[i]
        val ReponseUtilisateurIndex=ReponseUtilisateur[i]
        val vraieReponseIndex=vraireponse[i]
        val reponseUtilisateur=answer[i][vraieReponseIndex]
        if (ReponseUtilisateurIndex.equals(vraieReponseIndex)){
            println("votre reponse est : ${reponseUtilisateur} est correct! ")
            score++

        }else
            println("votre reponse est : ${reponseUtilisateur} est incorrect! ")



    }

    println("votre score est : ${score} /  ${questions.size} ")


}
