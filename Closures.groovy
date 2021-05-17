def myClosure = {println "hello from closure"}
myClosure.call();

def myClosure1 = {name -> println "hello from $name"}
myClosure1.call("Ash");

//passing closure in method
def method(col){
    col.call('Groovy')
}

method(myClosure1)

// closure with return type
def myClosure2 = {
    a,b,c -> return (a+b+c)
}

println(myClosure2(1,2,3))