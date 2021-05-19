import static java.util.stream.Collectors.toList

// 1.  Safe navigation operator
/*
def person = Person.find { it.id == 123 }  //suppose this return null instance   
def name = person?.name // it will return null not null pointer exception                     
println name // result is null
*/ 

// 2. Direct field access operator
class User {
    public final String name  

    User(String name) {
        this.name = name
    }
    String getName() { 
        "Name: $name" 
    }       
} 

def user = new User('Bob')
println user.name // this will call getter (RESULT -> Name: Bob)
println user.@name // this will call field name (RESULT -> Bob)

//3. Method pointer operator
def str = 'example of method reference'            
def fun = str.&toUpperCase //we store a reference to the toUpperCase method on the str instance inside a variable named fun
                           // which can be called later 

println fun() // (Result -> EXAMPLE OF METHOD REFERENCE)

//4. Method reference operator
    println([1G, 2G, 3G].stream().reduce(0G, BigInteger::add))
    //assert 6G == [1G, 2G, 3G].stream().reduce(0G, BigInteger::add)                           

    assert [4G, 5G, 6G] == [1G, 2G, 3G].stream().map(3G::add).collect(toList())              

    assert [1G, 2G, 3G] == [1L, 2L, 3L].stream().map(BigInteger::valueOf).collect(toList())  

    assert [1G, 2G, 3G] == [1L, 2L, 3L].stream().map(3G::valueOf).collect(toList())          


//5. Find Operator
def text = "some text to match"
def m = text =~ /match/ 
if (!m) {                                                         
    throw new RuntimeException("Oops, text not found!")
}

// 6. Match Operator
def txt1 = "some text to match"
def z = txt1 ==~ /match/                                     
if (z) {                                                          
    throw new RuntimeException("MATCH NOT FOUND!")
}

//7. Spread operator

class Car {
    String make
    String model
}
def cars = [
       new Car(make: 'Peugeot', model: '508'),
       new Car(make: 'Renault', model: 'Clio')]       
def makes = cars*.make    // equivalent of cars.collect{ it.make }                            
println makes

// 7.1 how to pass list as argument as seprate variable using spread op

def args = [4,5,6]

int function(int x, int y, int z) {
    x*y+z
}

println (function(*args))

// 7.2 Spread list and Spread map element

def items = [4,5]                      
def list = [1,2,3,*items,6]            
println list

def m1 = [c:3, d:4]                   
def map = [a:1, b:2, *:m1]            
println map

//8. Range Operator
println(" ")
def range = 0..5                                    
println range.collect()   // Inclusive
println range.collect()  // Exclusive                        
println range.size()
def alpha = ('a'..'f').collect() 
println alpha // works on alphabet too

//9. StarShip Operator 
/*
<=> is equivalent to compareTo 
if a = b = 0
if a < b = -1
if a > b = 1
*/
println 1 <=> 1

// 10. Safe index operator
def personInfo = [name: 'Daniel.Sun', location: 'Shanghai']
assert 'Daniel.Sun' == personInfo?['name']      // get using normal map index
personInfo?['name'] = 'sunlan'                  // set using normal map index
assert 'sunlan' == personInfo?['name']

personInfo = null
assert null == personInfo?['name']              // return null for all map values
personInfo?['name'] = 'sunlan'                  // quietly ignore attempt to set value
assert null == personInfo?['name']

//11. Membership operator
def list_y = ['Grace','Rob','Emmy']
assert ('Emmy' in list_y)      

//12. Identity operator
def list1 = ['Groovy 1.8','Groovy 2.0','Groovy 2.3']        
def list2 = ['Groovy 1.8','Groovy 2.0','Groovy 2.3']        
println list1 == list2    // using ==, we test object equality                                   
println list1.is(list2)   // but using is, we can check that references are distinct

//13. Coercion operator
/* 
Integer x = 123
String s = (String) x
Integer is not assignable to a String, so it will produce a ClassCastException at runtime
*/

Integer x = 123
String s = x as String  
//Integer is not assignable to a String, but use of as will coerce it to a String and it will be new object

