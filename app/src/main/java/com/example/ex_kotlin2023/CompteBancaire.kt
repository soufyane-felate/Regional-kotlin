package com.example.ex_kotlin2023

class CompteBancaire(var numeroDuCompte: String,
                     var nomTutulaire: String,
                     var solde: Double) {
    override fun toString(): String {
        return "CompteBancaire(numeroDuCompte='$numeroDuCompte', nomTutulaire='$nomTutulaire', solde=$solde)"
    }

    fun depose(montent: Double){
     solde+=montent
    }
    fun retirer(montent: Double){
        if (solde>montent){
            solde-=montent
        }
        println("Votre solde est inférieur au montant que vous souhaitez retirer")
    }

    fun afficher(){
        println("le nom est ${nomTutulaire},numero du Compte est ${numeroDuCompte},solde ${solde}")
    }



}

fun main() {
    val compte=CompteBancaire("12345","Ahmad Raji",1000.0)
    compte.afficher()
    compte.depose(200.0)
    compte.afficher()
    compte.retirer(100.0)
    compte.afficher()

}

