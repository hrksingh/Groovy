//Using console
def username1 = System.console().readLine 'What is your name?'
println "Hello $username1"

//where console is not avialble mainly IDE
println "What is your name?"
println "Your name is ${System.in.newReader().readLine()}"

//Using Input Dialog
def readln = javax.swing.JOptionPane.&showInputDialog
def username = readln 'What is your name?'
println "Hello $username."

//Using BufferReader
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
print "Input:"
def userInput = br.readLine()
println "You entered: $userInput"


// Using Scanner
Scanner scan = new Scanner(System.in);
print 'enter: '
String s = scan.nextLine()
println "Entered : $s"

//demo program to demostrate casting
print "First number: "
def x = System.in.newReader().readLine() as Integer
print "Second number: "
def y = System.in.newReader().readLine() as Integer
println x * y