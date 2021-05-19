import groovy.transform.TupleConstructor
import groovy.transform.ToString

@TupleConstructor   // to create constructors 
@ToString
class Person {
    String firstName
    String lastName
}

def p1 = new Person(firstName: 'Jack', lastName: 'Nicholson') // traditional map-style constructor
def p2 = new Person('James', 'son') // generated tuple constructor
def p3 = new Person('John')

println p1
println p2
println p3

/* Output
Person(Jack, Nicholson)
Person(James, son)
Person(John, null)
*/