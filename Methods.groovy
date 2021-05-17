def DisplayName() {
      println("This is how methods work in groovy");
      println("This is an example of a simple method");
   }

DisplayName();

// Methods with param
def sum(int a,int b) {
      int c = a+b;
   } 

println sum(10,5)

// Method with default param
def def_sum(int a,int b = 5) { 
      int c = a+b;  
   }

println def_sum(10)
println def_sum(20,20)

//Method with return type
def diff(a,b) { 
      return b-a 
}

println diff(10,40)

def Mul(def a,def b) { 
      return a*b 
}
println Mul(10,4)