import org.junit.jupiter.api.Test;

public class JavaTest {


   // test method to add two values
  @Test
   public void testAdd(){
      int result = 3 + 3;
      assert(result==6);
   }
   
   // test method to subtract two values
   @Test
   public void testSubtract(){
      int result = 3 - 3;
       assert(result==0);
   }
   
}
