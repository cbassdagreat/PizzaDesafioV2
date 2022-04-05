package cbassdagreat.github.pizzadesafiov2.model

import java.io.Serializable

class Pizza (val nombre:String, val maza:String , val ingredientes:ArrayList<Ingredientes>, val total:Int):
    Serializable {
}