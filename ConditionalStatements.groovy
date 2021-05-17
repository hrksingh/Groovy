// Initializing a local variable 
      def a = 200

      if (a == 200) { 
         println("The ${a} is 200")
      } 
      else if (a<100) { 
         println("The ${a} is less than 100")
      } 
      else { 
         println("The ${a} is greater than 100") 
      }


//Switch

def b = 5
		
      //Evaluating the expression value 
      switch(b) {            
         case 1: 
            println("The value of b is One"); 
            break; 
         case 2: 
            println("The value of b is Two"); 
            break; 
         case 3: 
            println("The value of b is Three"); 
            break; 
         case {b >= 4}: 
            println("The value of b is Four or greater then 4"); 
            break; 
         default: 
            println("The value is unknown"); 
            break; 
      }