class Magier(name: String, hp: Int, maxHp: Int) : Held(name, hp, maxHp) {

    //Magic ball Attack
    fun magicBallAttack(): Int {
        println("\n${blue}${underline}$name${reset} Use his magic ball to attack , He deals ${red}30${reset} damage\n")
        Thread.sleep(1000)

        return 30
    }

    //self Heal
    fun selfHealing(): Int {
        val heal: Int = (10..30).random()
        println("\n${blue}${underline}$name${reset} Use A secret spell to hell himself with ${green}$heal${reset} HP")
        hp += heal
        println("${blue}${underline}$name${reset}, have ${green}$hp${reset} HP now\n")
        Thread.sleep(1000)


        return 0

    }


    //Healing a random teammate
    fun healingRandomTeammate(herosTeam: List<Held>): Int {
        val filteredHeroes = herosTeam.filter { it !is Magier }
        val chooseRandomHero: Held = filteredHeroes.shuffled().random()
        val heal: Int = (10..40).random()

        when (chooseRandomHero) {
            is Krieger, is Meerjungfrau -> {
                println("\n${blue}${underline}$name${reset} heals '${blue}${underline}${chooseRandomHero.name}${reset}' with ${green}$heal${reset} HP")
                Thread.sleep(1000)

                chooseRandomHero.hp += heal
            }
        }
        println("${blue}${underline}${chooseRandomHero.name}${reset} have ${green}${chooseRandomHero.hp}${reset} HP now.\n")
        Thread.sleep(1000)

        return 0
    }


    //Invisibility Attack
    fun invisibilityAttack(): Int {
        val damage: Int = ((10..40).random())
        println("\n${blue}${underline}$name${reset} Uses his Invisibility spell To be Invisible To attack without being noticed , He deals ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        return damage
    }

}


