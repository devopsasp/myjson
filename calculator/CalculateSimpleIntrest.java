   interface Intrest
    {
         void calculate(); 
 } 
   class CalculateSimpleIntrest
 { 
      public void calculateIntrest(Intrest i)
 { 
    i.calculate();
 } 
     public static void main(String args[]) 
 { 
    CalculateSimpleIntrest obj=new CalculateSimpleIntrest();
    
    obj.calculateIntrest(new Intrest(){
     public void calculate() 
 { 
 System.out.println("intrest calculated");
 } 

}); 
 } 
}