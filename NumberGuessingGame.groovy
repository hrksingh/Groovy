//Get current Script path
def current_script = getClass().protectionDomain.codeSource.location.path
println(current_script)

//Game
Random random = new Random()
def hidden = random.nextInt(20)
def guessCounter = 0
while (true) {
    print "Guess number: "
    try{
    def guess = System.in.newReader().readLine() as Integer
    if (guess < hidden) {
        println "Guess was too small"
        guessCounter++
    } else if (guess > hidden) {
        println "Guess was too high"
        guessCounter++
    } else {
        println "Match! Guessed in ${guessCounter + 1} try"

        break
    }
   }
   catch(Exception ex) {
    println "Please Enter Number Only"
}
}
 
println "Bye"

