class Beutel {

    private var itemsInBag: MutableList<String> =
        mutableListOf("healing potion", "vitamins", "Apple", "Meat", "Banana", "the essence of life")


    //healing logic
    fun use(hero: Held): Int {
        if (itemsInBag.isNotEmpty()) {
            val chooseRandomItem: String = itemsInBag.random()
            when (chooseRandomItem) {
                "healing potion" -> {
                    println("\n${blue}${underline}${hero.name}${reset} uses a healing potion, ${green}+25${reset} HP.")
                    hero.hp += 25
                    println("${blue}${underline}${hero.name}${reset} have ${green}${hero.hp}${reset} HP now.\n")

                }

                "vitamins" -> {
                    println("\n${blue}${underline}${hero.name}${reset} uses vitamins, ${green}+40${reset} HP.")
                    hero.hp += 40
                    println("${blue}${underline}${hero.name}${reset} have ${green}${hero.hp}${reset} HP now.\n")

                }

                "Apple" -> {
                    println("\n${blue}${underline}${hero.name}${reset} eats an Apple, ${green}+15${reset} HP.")
                    hero.hp += 15
                    println("${blue}${underline}${hero.name}${reset} have ${green}${hero.hp}${reset} HP now.\n")

                }

                "Meat" -> {
                    println("\n${blue}${underline}${hero.name}${reset} eats a piece of Meat, ${green}+30${reset} HP.")
                    hero.hp += 30
                    println("${blue}${underline}${hero.name}${reset} have ${green}${hero.hp}${reset} HP now.\n")

                }

                "Banana" -> {
                    println("\n${blue}${underline}${hero.name}${reset} eats a Banana, ${green}+15${reset} HP.")
                    hero.hp += 15
                    println("${blue}${underline}${hero.name}${reset} have ${green}${hero.hp}${reset} HP now.\n")

                }

                "the essence of life" -> {
                    println("\n${blue}${underline}${hero.name}${reset} drinks a portion of the essence of life, ${green}+60${reset} HP.")
                    hero.hp += 60
                    println("${blue}${underline}${hero.name}${reset} have ${green}${hero.hp}${reset} HP now.\n")

                }
            }

            itemsInBag.remove(chooseRandomItem)
        } else {
            println("\nThe bag is ${underline}empty${reset}. ${red}No life points added${reset}.\n")
        }
        return 0
    }

    // print the item in the bag
    fun printBagItems() {
        println("${cyan}$itemsInBag${reset}")
    }

    // print the number of the item left in the bag
    fun printItemsLeft() {
        println("Bag: ${red}${itemsInBag.size}${reset}")
    }

    // to restart the value in the bag after new game
    fun reset() {
        itemsInBag = mutableListOf("healing potion", "vitamins", "Apple", "Meat", "Banana", "the essence of life")
    }

}