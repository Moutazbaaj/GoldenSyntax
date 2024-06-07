class Krieger(name: String, hp: Int, maxHp: Int) : Held(name, hp, maxHp) {


    private var attackPowerIncrease: Int = 0


    // uppercut attack
    fun uppercutAttack(): Int {
        println("${blue}${underline}\n$name${reset} Run towards 'His enemy' And give him a bunch under his chin And He deals ${red}30${reset} damage\n")
        Thread.sleep(1000)
        return (30)
    }

    //Sword attack
    fun swordAttack(): Int {
        val damage: Int = ((20..45).random())
        println("${blue}${underline}\n$name ${reset}Take his sword out and stabs 'The enemy' In the stomach, He deals ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        return damage
    }

    //Archery attack
    fun archeryAttack(): Int {
        val damage = ((10..70).random())
        println("${blue}${underline}\n$name${reset} Takes his bow and arrow and shoots 'The enemy' in the Stomach And He deals ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        return damage
    }

    //stomp attack
    fun stompAttack(): Int {
        val damage: Int = (15 + attackPowerIncrease)
        attackPowerIncrease += (5..25).random()
        println("${blue}${underline}\n$name${reset} Goes in rage, Hit the ground strongly with his feet And shakes it underneath 'The enemy' He deals ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        attackPowerIncrease++
        return damage

    }

}