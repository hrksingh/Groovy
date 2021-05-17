// we do not need class to work with groovy

/**
variable type can be static
**/
def name_def = "Ash"  //valid
String name_string = "Ash" // valid
name = "Ash" // valid but not recommended as it may produce un expexted error

println name // #Ash
println 'Name is '+name_def // #Name is Ash

// println 'Name is $name_def' // gonna take $name_def as literal and print it #Name is $name_def
// println 'Name is ${name_def}' // gonna take ${name_def} as literal and print it #Name is ${name_def}

println "Name is ${name_string}" // #Name is Ash
println "Name is $name_string" // #Name is Ash

println 1 /* one */ + 2 /* two */ //# 3 here it perform sum with multiline comment in between


// Groovy is case senstive
def x= 10
def X = 20

println x
println X


// giving values to multiple vriables
def (a,b,c) = [30,40,50]
println a
println b
println c

def (String xx, int y, double z)= [500,600,700]
println xx
println y
println z

// TypeCasting in groovy
def s = 11
println s.getClass().getName()
s = (byte)s
println s.getClass().getName()

//how to print Unicode
println 'The Euro currency symbol: \u20AC'

// dotted expressions 
def person = [name: 'Ash', age: 22]
println "${person.name} is $person.age years old"
assert "$person.name is $person.age years old" == 'Ash is 22 years old'

