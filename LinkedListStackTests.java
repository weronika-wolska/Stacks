public class LinkedListStackTests {
    public static void main(String[] args){
        testEmptyStack();
        testPushMethod();
        testPopMethod();
        testPopEmptyStack();
        testPeekEmptyStack();
    }

    // test if isEmpty works
    private static void testEmptyStack(){
        Stack<String> stack = new LinkedListStack<String>();
        try{
            if(!stack.isEmpty()){
                System.out.println("testEmptyStack(): FAILED");
                System.out.println("Expected empty stack.");
            } else {
                System.out.println("testEmptyStack(): SUCCESS");
            }
        } catch (RuntimeException e){
            System.out.println("testEmptyStack(): HELLA FAILED");
            e.printStackTrace();
        }
    }

    // test if push() method works
    private static void testPushMethod(){
        Stack<String> stack = new LinkedListStack<String>();
        stack.push("tada");

        try{
            if(!stack.peek().equals("tada")){
                System.out.println("testPushMethod(): FAILED");
                System.out.println(("Expected tada as top element"));
            } else {
                System.out.println("testPushMethod(): SUCCESS");
            }
        }catch (RuntimeException e){
            System.out.println("testPushMethod(): HELLA FAILED");
            e.printStackTrace();
        }
    }

    // test if pop() works on a non-empty stack
    private static void testPopMethod(){
        Stack<String> stack = new LinkedListStack<String>();
        stack.push("tada");

        try{
            if(!stack.pop().equals("tada")){
                System.out.println("testPopMethod(): FAILED");
                System.out.println(("Expected tada to be returned from method."));
            }else{
                System.out.println("testPopMethod(): SUCCESS");
            }
        }catch (RuntimeException e){
            System.out.println("testPopMethod(): HELLA FAILED");
            e.printStackTrace();
        }
    }

    // test if calling pop() on empty stack causes exception
    private static void testPopEmptyStack(){
        Stack<String> stack = new LinkedListStack<String>();

        try{
            stack.pop();
            System.out.println("testPopEmptyStack(): FAILED");
            System.out.println("Exception was not thrown as expected.");
        }catch(RuntimeException e){
            System.out.println("testPopEmptyStack(): SUCCESS");
        }
    }

    // tests if calling peek() onn an empty stack throws exception
    private static void testPeekEmptyStack(){
        Stack<String> stack = new LinkedListStack<String>();

        try{
            stack.peek();
            System.out.println("testPopEmptyStack(): FAILED");
            System.out.println("Exception not thrown as expected.");
        } catch(RuntimeException e){
            System.out.println("testPopEmptyStack(): SUCCESS");
        }
    }
}
