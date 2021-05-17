def number = 1
def eagerGString = "value == ${number}"
def lazyGString = "value == ${ -> number }"
 
println eagerGString //value == 1
println lazyGString //value == 1

number = 2 
println eagerGString //value == 1
println lazyGString //value == 2

/* 
closure is evaluated lazily while plain interpolated expression, the value was actually bound at the time of creation of the GString 
*/
